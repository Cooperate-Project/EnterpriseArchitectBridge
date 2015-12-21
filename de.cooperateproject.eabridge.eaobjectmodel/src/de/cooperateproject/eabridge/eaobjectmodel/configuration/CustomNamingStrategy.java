package de.cooperateproject.eabridge.eaobjectmodel.configuration;

import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEStructuralFeature;
import org.eclipse.emf.teneo.mapping.strategy.impl.TeneoSQLNameStrategy;


public class CustomNamingStrategy extends TeneoSQLNameStrategy {

	@Override
	public String getColumnName(PAnnotatedEStructuralFeature aStructuralFeature, String prefix) {
		
		String name = aStructuralFeature.getModelEStructuralFeature().getName();

		return aStructuralFeature.getModelEStructuralFeature().getName();
	}
	
	@Override
	public String convert(String name) {
		return name;
	}
	
}
