package de.cooperateproject.eabridge.transformation;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EPackage.Registry;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.m2m.internal.qvt.oml.evaluator.QVTEvaluationOptions;
import org.eclipse.m2m.qvt.oml.BasicModelExtent;
import org.eclipse.m2m.qvt.oml.ExecutionContextImpl;
import org.eclipse.m2m.qvt.oml.ExecutionDiagnostic;
import org.eclipse.m2m.qvt.oml.ModelExtent;
import org.eclipse.m2m.qvt.oml.TransformationExecutor;
import org.eclipse.m2m.qvt.oml.util.Trace;
import org.eclipse.uml2.uml.resource.UMLResource;
import org.eclipse.uml2.uml.resources.util.UMLResourcesUtil;
import org.hibernate.Query;
import org.hibernate.Session;
import org.junit.Before;
import org.junit.BeforeClass;

import com.google.common.collect.Iterables;

import de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage;
import de.cooperateproject.eabridge.eaobjectmodel.Package;
import de.cooperateproject.eabridge.eaobjectmodel.database.DatabaseFactory;
import de.cooperateproject.eabridge.eaobjectmodel.util.HibernateUtils;
import de.cooperateproject.eabridge.tests.common.util.EAObjectModelHelper;
import de.cooperateproject.eabridge.tests.common.util.TestDB;
import de.cooperateproject.eabridge.tests.common.util.TestResource;

public abstract class TransformationTestBase {
	
	private static final Logger LOGGER = Logger.getLogger(TransformationTestBase.class);
	private ResourceSet resourceSet;
	
	@BeforeClass
	public static void init() throws Exception {
		BasicConfigurator.resetConfiguration();
		BasicConfigurator.configure(new ConsoleAppender(new PatternLayout("%m%n")));
		
		if (!isPluginEnvironment()) {
			EcorePlugin.getPlatformResourceMap().put("de.cooperateproject.eabridge.eaobjectmodel", determinePluginUri("de.cooperateproject.eabridge.eaobjectmodel", DatabaseFactory.class));
			EcorePlugin.getPlatformResourceMap().put("de.cooperateproject.eabridge.transformation", determinePluginUri("de.cooperateproject.eabridge.transformation", TransformationTestBase.class));

			Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("*", new XMIResourceFactoryImpl());
	        Registry packageRegistry = EPackage.Registry.INSTANCE;
	        packageRegistry.replace(EaobjectmodelPackage.eNS_URI, EaobjectmodelPackage.eINSTANCE);  
	        
            NotationPackage.eINSTANCE.eClass();
		}
	}
	
	protected static void generateXMI(TestResource changelog, String xmiPath) throws Exception {
		TestDB testDB = new TestDB(changelog);
		
		Session session = testDB.getDataStore().getSessionFactory().openSession();

		Query query = session.createQuery("FROM Package WHERE PARENT_ID = 0");
		List<Package> results = HibernateUtils.getListFromQuery(query, Package.class);
		assertEquals(1, results.size());

		Package actualContent = results.get(0);
	
		EAObjectModelHelper.saveModel(actualContent, String.format("model/%s", xmiPath));
		
		testDB.close();
	}
	
	protected static String makeXMIPath(String testName) {
		return String.format("%s/%s.xmi", testName, testName);
	}
	
	protected static String makeUMLPath(String testName) {
		return String.format("%s/%s.uml", testName, testName);
	}
	
	protected static String makeXMITransformedPath(String testName) {
		return String.format("%s/%sTransformed.xmi", testName, testName);
	}
	
	protected static String makeUMLTransformedPath(String testName) {
		return String.format("%s/%sTransformed.uml", testName, testName);
	}
	
	protected static String makeNotationTransformedPath(String testName) {
		return String.format("%s/%sTransformed.notation", testName, testName);
	}

	
	@Before
	public void setup() throws Exception {
		resourceSet = new ResourceSetImpl();
		UMLResourcesUtil.init(resourceSet);
	}
	
	protected ResourceSet getResourceSet() {
		return resourceSet;
	}

	@SuppressWarnings("restriction")
	protected void runEAtoUMLTransformation(String transformationPath, String xmiPath, String umlPath) throws IOException {
		runEAtoUMLTransformation(transformationPath, xmiPath, umlPath, "");
	}
	
	@SuppressWarnings("restriction")
	protected void runEAtoUMLTransformation(String transformationPath, String xmiPath, String umlPath, String notationPath) throws IOException {
		TransformationExecutor executor = new TransformationExecutor(createTransformationURI(transformationPath));
		ExecutionContextImpl ctx = new ExecutionContextImpl();
		ctx.setLog(new Log4JLogger(LOGGER, Level.INFO));
		Trace traceModel = new Trace(Collections.emptyList());
		ctx.getSessionData().setValue(QVTEvaluationOptions.INCREMENTAL_UPDATE_TRACE, traceModel);
		
		ModelExtent xmi = new BasicModelExtent(getResourceSet().getResource(createResourceModelURI(xmiPath), true).getContents());
		ModelExtent primitives = new BasicModelExtent(getResourceSet().getResource(URI.createURI(UMLResource.ECORE_PRIMITIVE_TYPES_LIBRARY_URI), true).getContents());
		ModelExtent uml = new BasicModelExtent();
		ModelExtent notation = new BasicModelExtent();
		Iterable<ModelExtent> transformationParameters = Arrays.asList(xmi, primitives, uml, notation);
		
		ExecutionDiagnostic result = executor.execute(ctx, Iterables.toArray(transformationParameters, ModelExtent.class));
		assertEquals(ExecutionDiagnostic.OK, result.getSeverity());
		
		Resource umlResultResource = getResourceSet().createResource(createResourceModelURI(umlPath));
		umlResultResource.getContents().addAll(uml.getContents());
		umlResultResource.save(null);
		
		if(notationPath != "") {
			Resource notationResultResource = getResourceSet().createResource(createResourceModelURI(notationPath));
			notationResultResource.getContents().addAll(notation.getContents());
			notationResultResource.save(null);
		}
	}
	
	// TODO: Refactor
	
	@SuppressWarnings("restriction")
	protected void runUMLtoEATransformation(String transformationPath, String umlPath, String xmiPath) throws IOException {
		TransformationExecutor executor = new TransformationExecutor(createTransformationURI(transformationPath));
		ExecutionContextImpl ctx = new ExecutionContextImpl();
		ctx.setLog(new Log4JLogger(LOGGER, Level.INFO));
		Trace traceModel = new Trace(Collections.emptyList());
		ctx.getSessionData().setValue(QVTEvaluationOptions.INCREMENTAL_UPDATE_TRACE, traceModel);
		
		ModelExtent xmi = new BasicModelExtent();
		ModelExtent primitives = new BasicModelExtent(getResourceSet().getResource(URI.createURI(UMLResource.ECORE_PRIMITIVE_TYPES_LIBRARY_URI), true).getContents());
		ModelExtent uml = new BasicModelExtent(getResourceSet().getResource(createResourceModelURI(umlPath), true).getContents());
		Iterable<ModelExtent> transformationParameters = Arrays.asList(uml, primitives, xmi);
		
		ExecutionDiagnostic result = executor.execute(ctx, Iterables.toArray(transformationParameters, ModelExtent.class));
		assertEquals(ExecutionDiagnostic.OK, result.getSeverity());
		
		Resource resultResource = getResourceSet().createResource(createResourceModelURI(xmiPath));
		resultResource.getContents().addAll(xmi.getContents());
		resultResource.save(null);
	}
	
	protected static URI createTransformationURI(String filename) {
		String pathName = String.format("/%s/transforms/%s", "de.cooperateproject.eabridge.transformation", filename);
		return createPlatformURI(pathName);
	}
	
	protected static URI createResourceModelURI(String filename) {
		String pathName = String.format("/%s/model/%s", "de.cooperateproject.eabridge.transformation", filename);
		return createPlatformURI(pathName);
	}
	
	private static boolean isPluginEnvironment() {
		return ResourcesPlugin.getPlugin() != null;
	}
	
	private static URI createPlatformURI(String pathName) {
		if (!isPluginEnvironment()) {
			return URI.createPlatformResourceURI(pathName, true);			
		} else {
			return URI.createPlatformPluginURI(pathName, true);
		}
	}
	
	private static URI determinePluginUri(String pluginId, Class<?> classOfPlugin) throws URISyntaxException {
		Path p = Paths.get(classOfPlugin.getProtectionDomain().getCodeSource().getLocation().toURI());
		while (p.getParent() != null && !p.getFileName().toString().equals(pluginId)) {
			p = p.getParent();
		}
		return URI.createFileURI(p.toAbsolutePath().toFile().toString() + "/");
	}
	
}