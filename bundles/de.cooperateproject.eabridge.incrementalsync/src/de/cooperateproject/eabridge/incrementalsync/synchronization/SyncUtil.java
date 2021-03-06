package de.cooperateproject.eabridge.incrementalsync.synchronization;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Optional;

import org.eclipse.emf.teneo.hibernate.SessionWrapper;
import org.hibernate.SessionFactory;
import org.hibernate.metadata.ClassMetadata;
import org.hibernate.persister.entity.AbstractEntityPersister;

import de.cooperateproject.eabridge.incrementalsync.monitoring.Table;

/**
 * Provides utility methods to deal with synchronization, mapping and logging.
 */
public class SyncUtil {

	private static Optional<Table> createTableFromMetaData(ClassMetadata classMetadata) {
		
		AbstractEntityPersister aep = (AbstractEntityPersister) classMetadata;

		String idColumn = (aep.getIdentifierColumnNames().length == 1) ? aep.getIdentifierColumnNames()[0] : "";

		String tableName = (aep.getTableName() == null) ? null : aep.getTableName().replace("`", "");
		String entityName = (aep.getEntityName() == null) ? null : aep.getEntityName().replace("`", "");
		String column = (idColumn == null) ? null : idColumn.replace("`", "");
		String property = (aep.getIdentifierPropertyName() == null) ? null
				: aep.getIdentifierPropertyName().replace("`", "");

		// FIXME: Composite-IDs not supported right now!
		if (column == null || property == null || tableName == null || entityName == null) {
			return Optional.empty();
		} else {

			Table elem = new Table(tableName, entityName, column, property);
			return Optional.of(elem);
		}
		
	}

	/**
	 * Returns a list of all Tables, retrieved from the Hibernate Mapping.
	 * 
	 * @param dbStore
	 *            the HBDataStore from Hibernate
	 * @return A ArrayList with all information about the tables (database and
	 *         mapping)
	 */
	public static ArrayList<Table> getTables(SessionWrapper wrapper) {

		ArrayList<Table> tableList = new ArrayList<Table>();

		SessionFactory sessionFactory = wrapper.getHibernateSession().getSessionFactory();
		Map<String, ClassMetadata> classMetadataMap = sessionFactory.getAllClassMetadata();

		// Searches the table information in the mapped data
		for (ClassMetadata classMetadata : classMetadataMap.values()) {

			Optional<Table> elem = createTableFromMetaData(classMetadata);
			
			if(elem.isPresent()) {
				tableList.add(elem.get());
			}
		}

		return tableList;
	}
	
	/**
	 * Makes an ArrayList of Strings pretty again!
	 * 
	 * @param input
	 *            A List of Strings, e.G. List(1,2,3)
	 * @return A pretty pretty String, e.G. 1,2,3
	 */
	public static String prettyPrintArrayList(ArrayList<String> input) {
		StringBuilder sb = new StringBuilder();
		Iterator<String> i = input.iterator();

		while (i.hasNext()) {
			String next = i.next();
			sb.append(next);
			if (i.hasNext())
				sb.append(", ");
		}

		return sb.toString();
	}

	// No instances of this class allowed
	private SyncUtil() {
	}

}
