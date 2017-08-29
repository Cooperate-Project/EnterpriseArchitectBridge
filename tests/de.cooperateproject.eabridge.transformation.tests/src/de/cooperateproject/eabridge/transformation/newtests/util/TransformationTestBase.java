package de.cooperateproject.eabridge.transformation.newtests.util;

import java.net.URISyntaxException;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.PatternLayout;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EPackage.Registry;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.m2m.qvt.oml.TransformationExecutor.BlackboxRegistry;
import org.eclipse.papyrus.infra.viewpoints.style.StylePackage;
import org.eclipse.uml2.uml.resources.util.UMLResourcesUtil;
import org.junit.Before;
import org.junit.BeforeClass;

import de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage;
import de.cooperateproject.eabridge.eaobjectmodel.database.DatabaseFactory;
import de.cooperateproject.eabridge.eaobjectmodel.util.EAResourceFactory;
import de.cooperateproject.qvtoutils.blackbox.CooperateLibrary;

public abstract class TransformationTestBase {

	private static final String PLUGIN_ID = "de.cooperateproject.eabridge.transformation.tests";
	private ResourceSet resourceSet;

	@BeforeClass
	public static void init() throws URISyntaxException {
		BasicConfigurator.resetConfiguration();
		BasicConfigurator.configure(new ConsoleAppender(new PatternLayout("%m%n")));

		if (!isPluginEnvironment()) {
			EcorePlugin.getPlatformResourceMap().put("de.cooperateproject.eabridge.eaobjectmodel",
					determinePluginUri("de.cooperateproject.eabridge.eaobjectmodel", DatabaseFactory.class));
			EcorePlugin.getPlatformResourceMap().put("de.cooperateproject.eabridge.transformation",
					determinePluginUri("de.cooperateproject.eabridge.transformation", de.cooperateproject.eabridge.transformation.executor.TransformationExecutorRegistry.class));
			EcorePlugin.getPlatformResourceMap().put(PLUGIN_ID,
					determinePluginUri(PLUGIN_ID, TransformationTestBase.class));

			Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("eaom", new EAResourceFactory());
			Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("*", new XMIResourceFactoryImpl());
			Registry packageRegistry = EPackage.Registry.INSTANCE;
			packageRegistry.replace(EaobjectmodelPackage.eNS_URI, EaobjectmodelPackage.eINSTANCE);

			NotationPackage.eINSTANCE.eClass();
			StylePackage.eINSTANCE.eClass();
			org.eclipse.papyrus.infra.gmfdiag.style.StylePackage.eINSTANCE.eClass();
			UMLResourcesUtil.init(null);
			
			BlackboxRegistry.INSTANCE.registerModule(CooperateLibrary.class, "de.cooperateproject.qvtoutils.CooperateLibrary", "CooperateLibrary", new String[]{EcorePackage.eNS_URI});
		}
	}
	
	@Before
	public void setup() {
		resourceSet = new ResourceSetImpl();
	}
	
	protected ResourceSet getResourceSet() {
		return resourceSet;
	}
	
	protected static boolean isPluginEnvironment() {
		return ResourcesPlugin.getPlugin() != null;
	}

	protected static URI createLocalPlatformURI(String pathName) {
		return createPlatformURI(String.format("%s/%s", PLUGIN_ID, pathName));
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
