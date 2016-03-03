package de.cooperateproject.eabridge.eaobjectmodel;

import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EPackage.Registry;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import de.cooperateproject.eabridge.eaobjectmodel.xcore.Package;
import de.cooperateproject.eabridge.eaobjectmodel.xcore.XcorePackage;

public class EAObjectModelHelper {

    static {
        Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
        Map<String, Object> m = reg.getExtensionToFactoryMap();
        m.put(Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());
        
        Registry packageRegistry = EPackage.Registry.INSTANCE;
        packageRegistry.replace(XcorePackage.eNS_URI, XcorePackage.eINSTANCE);        
    }
    
    public static Package loadModel(String projectRelativePath) throws IOException {
        ResourceSet rs = new ResourceSetImpl();
        File p = new File(projectRelativePath);
        URI uri = URI.createFileURI(p.getAbsolutePath());
        Resource r = rs.createResource(uri);
        r.load(null);
        EcoreUtil.resolveAll(r);
        return (Package) r.getContents().get(0);
    }
    
    public static void saveModel(Package model, String projectRelativePath) throws IOException {
        ResourceSet rs = new ResourceSetImpl();
        Resource r = rs.createResource(URI.createFileURI(projectRelativePath));
        r.getContents().add(model);
        r.save(Collections.EMPTY_MAP);
    }
}
