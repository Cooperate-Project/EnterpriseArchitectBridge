package de.cooperateproject.eabridge.services.hbdbfactory;

import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEClass;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEStructuralFeature;
import org.eclipse.emf.teneo.mapping.strategy.impl.TeneoSQLNameStrategy;


public class CustomNamingStrategy extends TeneoSQLNameStrategy {
	
	@Override
	public String getColumnName(PAnnotatedEStructuralFeature aStructuralFeature, String prefix) {		
		
		String name = aStructuralFeature.getModelEStructuralFeature().getName();
			
		return name;
	}
	
	public String getTableName(PAnnotatedEClass aClass) {
		
		String name = getEntityName(aClass.getPaModel(), aClass.getModelEClass());
		
		return "t_" + name.toLowerCase();
		
	}
	
}
