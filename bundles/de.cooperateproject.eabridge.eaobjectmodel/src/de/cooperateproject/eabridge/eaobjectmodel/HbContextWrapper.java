package de.cooperateproject.eabridge.eaobjectmodel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.teneo.PersistenceOptions;
import org.eclipse.emf.teneo.extension.ExtensionManager;
import org.eclipse.emf.teneo.hibernate.HbContext;
import org.eclipse.emf.teneo.mapping.strategy.EntityNameStrategy;
import org.hibernate.Interceptor;
import org.hibernate.cfg.Configuration;
import org.hibernate.property.PropertyAccessor;

public class HbContextWrapper extends HbContext {

    private final HbContext hbContext;
    
    public HbContextWrapper(HbContext hbContext) {
        this.hbContext = hbContext;
    }

    public int hashCode() {
        return hbContext.hashCode();
    }

    public Class<?> getEMFTuplizerClass(Configuration hbConfiguration) {
        return hbContext.getEMFTuplizerClass(hbConfiguration);
    }

    public Class<?> getEMFComponentTuplizerClass(Configuration hbConfiguration) {
        return hbContext.getEMFComponentTuplizerClass(hbConfiguration);
    }

    public Class<?> getFeatureMapEntryTuplizer(Configuration hbConfiguration) {
        return hbContext.getFeatureMapEntryTuplizer(hbConfiguration);
    }

    public Interceptor createInterceptor(Configuration hbConfiguration, EntityNameStrategy ens) {
        return hbContext.createInterceptor(hbConfiguration, ens);
    }

    public boolean equals(Object obj) {
        return hbContext.equals(obj);
    }

    public PropertyAccessor createFeatureMapEntryFeatureURIAccessor() {
        return hbContext.createFeatureMapEntryFeatureURIAccessor();
    }

    public PropertyAccessor createFeatureMapEntryAccessor(EStructuralFeature feature) {
        return hbContext.createFeatureMapEntryAccessor(feature);
    }

    public PropertyAccessor createVersionAccessor() {
        return hbContext.createVersionAccessor();
    }

    public PropertyAccessor createEContainerAccessor() {
        return hbContext.createEContainerAccessor();
    }

    public PropertyAccessor createEContainerFeatureIDAccessor() {
        return hbContext.createEContainerFeatureIDAccessor();
    }

    public PropertyAccessor createFeatureMapPropertyAccessor(EStructuralFeature eFeature) {
        return hbContext.createFeatureMapPropertyAccessor(eFeature);
    }

    public PropertyAccessor createEListAccessor(EStructuralFeature eFeature, boolean extraLazy,
            boolean newEMapMapping) {
        return hbContext.createEListAccessor(eFeature, extraLazy, newEMapMapping);
    }

    public PropertyAccessor createEListAccessor(EStructuralFeature eFeature, boolean extraLazy, boolean newEMapMapping,
            PersistenceOptions po) {
        return hbContext.createEListAccessor(eFeature, extraLazy, newEMapMapping, po);
    }

    public PropertyAccessor createEReferenceAccessor(EReference eReference) {
        return hbContext.createEReferenceAccessor(eReference);
    }

    public PropertyAccessor createEAttributeAccessor(EAttribute eAttribute) {
        return hbContext.createEAttributeAccessor(eAttribute);
    }

    public void setExtensionManager(ExtensionManager extensionManager) {
        hbContext.setExtensionManager(extensionManager);
    }

    public String toString() {
        return hbContext.toString();
    }
    
    
}
