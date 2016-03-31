package de.cooperateproject.eabridge.eaobjectmodel.util;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.Map;

import org.apache.commons.lang.RandomStringUtils;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EPackage.Registry;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage;
import de.cooperateproject.eabridge.eaobjectmodel.PackageBase;
import de.cooperateproject.eabridge.eaobjectmodel.RootPackage;

public class EAObjectModelHelper {

    static {
        Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
        Map<String, Object> m = reg.getExtensionToFactoryMap();
        m.put(Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());
        
        Registry packageRegistry = EPackage.Registry.INSTANCE;
        packageRegistry.replace(EaobjectmodelPackage.eNS_URI, EaobjectmodelPackage.eINSTANCE);        
    }
    
    public static RootPackage loadModel(InputStream is) throws IOException {
        ResourceSet rs = new ResourceSetImpl();
        File tmpFile = File.createTempFile(RandomStringUtils.randomAlphanumeric(10), ".xmi");
        tmpFile.delete();
        URI uri = URI.createFileURI(tmpFile.getAbsolutePath());
        Resource r = rs.createResource(uri);
        r.load(is, null);
        EcoreUtil.resolveAll(r);
        return (RootPackage) r.getContents().get(0);
    }
    
    public static void saveModel(PackageBase model, String projectRelativePath) throws IOException {
        ResourceSet rs = new ResourceSetImpl();
        Resource r = rs.createResource(URI.createFileURI(projectRelativePath));
        r.getContents().add(model);
        r.save(Collections.EMPTY_MAP);
    }
}
