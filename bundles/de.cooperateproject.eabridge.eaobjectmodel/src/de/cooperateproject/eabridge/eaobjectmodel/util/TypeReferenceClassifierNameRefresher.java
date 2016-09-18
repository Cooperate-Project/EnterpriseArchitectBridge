package de.cooperateproject.eabridge.eaobjectmodel.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import de.cooperateproject.eabridge.eaobjectmodel.Element;
import de.cooperateproject.eabridge.eaobjectmodel.TypeReference;;
public class TypeReferenceClassifierNameRefresher implements Adapter {

	private Notifier target;
	private final TypeReference tr;
	
	public TypeReferenceClassifierNameRefresher(TypeReference tr) {
		this.tr = tr;
	}
	
	@Override
	public void notifyChanged(Notification notification) {
		if ( notification.getNotifier() == target) {
			Element e = (Element)notification.getNotifier();
			tr.setType(e);
		}
	}

	@Override
	public Notifier getTarget() {
		return target;
	}

	@Override
	public void setTarget(Notifier newTarget) {
		this.target = newTarget;
	}

	@Override
	public boolean isAdapterForType(Object type) {
		return false;
	}

}
