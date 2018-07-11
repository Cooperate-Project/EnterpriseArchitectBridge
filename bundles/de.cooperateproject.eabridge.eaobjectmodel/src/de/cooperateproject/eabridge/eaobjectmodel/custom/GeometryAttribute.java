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
import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SessionImplementor;
import org.hibernate.usertype.UserType;

import de.cooperateproject.eabridge.eaobjectmodel.DiagramLinkGeometry;

public class GeometryAttribute implements UserType {
    private static final int[] SQL_TYPES = { Types.VARCHAR };
    
    @Override
    public int[] sqlTypes() {
        return SQL_TYPES;
    }

    @Override
    public Class returnedClass() {
        return DiagramLinkGeometry.class;
    }

    @Override
    public boolean equals(Object x, Object y) throws HibernateException {
        if (x == y) {
            return true;
        }

        if (x == null || y == null) {
            return false;
        }

        return x.equals(y);
    }

    @Override
    public int hashCode(Object x) throws HibernateException {
        return x.hashCode();
    }

    @Override
    public Object nullSafeGet(ResultSet rs, String[] names, SessionImplementor session, Object owner)
            throws HibernateException, SQLException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void nullSafeSet(PreparedStatement st, Object value, int index, SessionImplementor session)
            throws HibernateException, SQLException {
        // TODO Auto-generated method stub
        
    }

    @Override
    public Object deepCopy(Object value) throws HibernateException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean isMutable() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public Serializable disassemble(Object value) throws HibernateException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Object assemble(Serializable cached, Object owner) throws HibernateException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Object replace(Object original, Object target, Object owner) throws HibernateException {
        // TODO Auto-generated method stub
        return null;
    }


}
