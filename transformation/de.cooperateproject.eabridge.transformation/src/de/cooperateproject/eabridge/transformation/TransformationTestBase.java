package de.cooperateproject.eabridge.transformation;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Path;
import java.nio.file.Paths;

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
import org.eclipse.m2m.internal.qvt.oml.evaluator.QVTEvaluationOptions;
import org.eclipse.m2m.qvt.oml.ExecutionContextImpl;
import org.eclipse.m2m.qvt.oml.ExecutionDiagnostic;
import org.eclipse.m2m.qvt.oml.ModelExtent;
import org.eclipse.m2m.qvt.oml.TransformationExecutor;
import org.eclipse.m2m.qvt.oml.util.Trace;
import org.eclipse.uml2.uml.util.UMLUtil;
import org.junit.Before;
import org.junit.BeforeClass;

import org.eclipse.uml2.uml.resources.util.UMLResourcesUtil;

import com.google.common.collect.Iterables;

import de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage;
import de.cooperateproject.eabridge.eaobjectmodel.database.DatabaseFactory;

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
		}
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
	protected void runTransformation(URI transformationURI, Iterable<ModelExtent> transformationParameters, Trace traceModel) throws IOException {
		TransformationExecutor executor = new TransformationExecutor(transformationURI);
		ExecutionContextImpl ctx = new ExecutionContextImpl();
		ctx.setLog(new Log4JLogger(LOGGER, Level.INFO));
		ctx.getSessionData().setValue(QVTEvaluationOptions.INCREMENTAL_UPDATE_TRACE, traceModel);
		ExecutionDiagnostic result = executor.execute(ctx, Iterables.toArray(transformationParameters, ModelExtent.class));
		assertEquals(ExecutionDiagnostic.OK, result.getSeverity());
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