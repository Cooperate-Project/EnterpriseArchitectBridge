package de.cooperateproject.eabridge.eaobjectmodel.util;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;

public class EAResource extends XMIResourceImpl {

	public EAResource() {
		super();
	}

	public EAResource(URI uri) {
		super(uri);
	}

	@Override
	protected boolean useUUIDs() {
		return true;
	}

}
