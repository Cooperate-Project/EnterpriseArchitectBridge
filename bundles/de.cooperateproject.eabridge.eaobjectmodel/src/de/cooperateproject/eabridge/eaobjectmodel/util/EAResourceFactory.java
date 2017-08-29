package de.cooperateproject.eabridge.eaobjectmodel.util;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

public class EAResourceFactory extends XMIResourceFactoryImpl {

	@Override
	public Resource createResource(URI uri) {
		return new EAResource(uri);
	}

}
