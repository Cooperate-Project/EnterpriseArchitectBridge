package de.cooperateproject.eabridge.eaobjectmodel.util;

import java.util.List;

import org.hibernate.Query;

public class HibernateUtils {

	@SuppressWarnings("unchecked")
	public static <T> List<T> getListFromQuery(Query query, Class<T> resultType) {
		List<?> results = query.list();
		if (results.stream().filter(r -> r != null).allMatch(r -> resultType.isAssignableFrom(r.getClass()))) {
			return (List<T>)results;
		}
		throw new IllegalArgumentException("The given result list does not only contain results of the type " + resultType.getSimpleName());
	}
	
}
