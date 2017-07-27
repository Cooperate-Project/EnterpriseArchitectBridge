package de.cooperateproject.eabridge.eaobjectmodel.custom;

import java.io.Serializable;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.hibernate.engine.spi.SessionImplementor;
import org.hibernate.usertype.UserType;

/**
 * Hibernate data type that represents primary keys as used by Enterprise
 * Architect.
 * 
 * Enterprise Architect (EA) uses primary keys starting including 1 to represent
 * valid ids. Invalid or missing ids are represented by 0. To make hibernate
 * handle missing references correctly, this data type converts 0 to null when
 * reading the value and converts null to 0 when writing the value.
 */
public class EAPrimaryKeyType implements UserType {

	private static final int[] SQL_TYPES = { Types.INTEGER };
	private static final EFactory EFACTORY = EcoreFactory.eINSTANCE;
	private static final EDataType EDATA_TYPE = EcorePackage.eINSTANCE.getELong();

	@Override
	public Object assemble(Serializable arg0, Object arg1) {
		return arg0;
	}

	@Override
	public Object deepCopy(Object arg0) {
		String data = EFACTORY.convertToString(EDATA_TYPE, arg0);
		return EFACTORY.createFromString(EDATA_TYPE, data);
	}

	@Override
	public Serializable disassemble(Object arg0) {
		return (Serializable) arg0;
	}
	
	

	@Override
	public boolean equals(Object arg0, Object arg1) {
		if (arg0 == arg1) {
			return true;
		}

		if (arg0 == null || arg1 == null) {
			return false;
		}

		return arg0.equals(arg1);
	}

	@Override
	public int hashCode(Object arg0) {
		return arg0.hashCode();
	}

	@Override
	public boolean isMutable() {
		return false;
	}

	@Override
	public Object nullSafeGet(ResultSet arg0, String[] arg1, SessionImplementor arg2, Object arg3) throws SQLException {
		Long typedData = arg0.getLong(arg1[0]);
		String data = arg0.getString(arg1[0]);
		if (data == null || typedData.longValue() == 0L) {
			return null;
		}
		return EFACTORY.createFromString(EDATA_TYPE, data);
	}
	
	//TODO: Make this better
	@Override
	public void nullSafeSet(PreparedStatement arg0, Object arg1, int arg2, SessionImplementor arg3)
			throws SQLException {
		Long pvalue = null;
		if (arg1 != null) {
			pvalue = (Long) arg1;
		}
		if (pvalue != null ) {
			arg0.setLong(arg2, pvalue);
		} else /*if (arg0.getParameterMetaData().getParameterCount() == 22)*/ {
			arg0.setLong(arg2, 0L);
		}/* else {
			arg0.setNull(arg2, Types.INTEGER);
		}*/
	}

	@Override
	public Object replace(Object arg0, Object arg1, Object arg2) {
		return arg0;
	}

	@Override
	@SuppressWarnings("rawtypes")
	public Class returnedClass() {
		return EDATA_TYPE.getDefaultValue().getClass();
	}

	@Override
	public int[] sqlTypes() {
		return SQL_TYPES;
	}

}
