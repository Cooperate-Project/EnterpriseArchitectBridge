package de.cooperateproject.eabridge.eaobjectmodel;

import java.io.Serializable;

import org.apache.commons.lang.ArrayUtils;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.teneo.hibernate.EMFInterceptor;
import org.hibernate.type.LongType;
import org.hibernate.type.Type;

public class MappingInterceptor extends EMFInterceptor {

    private static final long serialVersionUID = -5653981169180886674L;

    @Override
    public boolean onSave(Object entity, Serializable id, Object[] state, String[] propertyNames, Type[] types) {
        
        if (entity instanceof Package) {
              if (((EObject)entity).eContainer() == null) {
//                int parentIndex = ArrayUtils.indexOf(propertyNames, "ParentID");
//                if (parentIndex == ArrayUtils.INDEX_NOT_FOUND) {
//                    // log error
//                    return false;
//                }
//                state[parentIndex] = 0L;
            }
            return true;
        }

        return super.onSave(entity, id, state, propertyNames, types);
    }

    
}
