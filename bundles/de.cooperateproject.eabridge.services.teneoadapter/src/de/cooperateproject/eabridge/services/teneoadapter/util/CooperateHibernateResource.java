package de.cooperateproject.eabridge.services.teneoadapter.util;

import java.util.HashMap;
import java.util.Map;
import java.util.Spliterators;
import java.util.function.Function;
import java.util.stream.StreamSupport;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.teneo.hibernate.resource.HibernateResource;

import de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage;

public class CooperateHibernateResource extends HibernateResource {
	Map<EClass, Function<EObject, String>> keyExtractors = new HashMap<>();

	public CooperateHibernateResource(URI uri) {
		super(uri);
		initializeKeyExtractors();
	}
	
	protected void initializeKeyExtractors() {
		keyExtractors.put(EaobjectmodelPackage.eINSTANCE.getElement(), o -> wrapGUID(o.eGet(EaobjectmodelPackage.eINSTANCE.getElement_ElementGUID()).toString(), o));
		keyExtractors.put(EaobjectmodelPackage.eINSTANCE.getDiagram(), o -> wrapGUID(o.eGet(EaobjectmodelPackage.eINSTANCE.getDiagram_DiagramGUID()).toString(), o));
		keyExtractors.put(EaobjectmodelPackage.eINSTANCE.getPackage(), o -> wrapGUID(o.eGet(EaobjectmodelPackage.eINSTANCE.getPackage_PackageGUID()).toString(), o));
	}
	
	protected String wrapGUID(String guid, EObject element) {
		return String.format("%s_id=%s", 
				emfDataStore.toEntityName(element.eClass()),
				guid);
	}

	@Override
	public String getURIFragment(EObject object) {
		return keyExtractors.getOrDefault(object.eClass(), super::getURIFragment)
			.apply(object);
	}
	
	@Override
	public EObject getEObject(String uriFragment) {
		EObject result = super.getEObject(uriFragment);
		
		//If lookup using traditional means fails revert to primitive search
		//TODO: optimize the following
		
		return result != null ? result : StreamSupport.stream(Spliterators.spliteratorUnknownSize(this.getAllContents(), 0), false)
				.filter(o -> this.getURIFragment(o).equals(uriFragment)).findAny().orElse(null);
	}
	
	

}
