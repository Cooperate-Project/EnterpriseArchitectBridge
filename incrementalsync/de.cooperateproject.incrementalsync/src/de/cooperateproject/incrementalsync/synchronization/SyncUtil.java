package de.cooperateproject.incrementalsync.synchronization;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.emf.teneo.hibernate.HbDataStore;
import org.hibernate.SessionFactory;
import org.hibernate.metadata.ClassMetadata;
import org.hibernate.persister.entity.AbstractEntityPersister;

import de.cooperateproject.incrementalsync.monitoring.Table;

/**
 * Provides utility methods to deal with synchronization, mapping and logging.
 */
public class SyncUtil {

	// No instances of this class allowed
	private SyncUtil() {
	}

	/**
	 * Returns a list of all Tables, retrieved from the Hibernate Mapping.
	 * 
	 * @param dbStore
	 *            the HBDataStore from Hibernate
	 * @return A ArrayList with all information about the tables (database and
	 *         mapping)
	 */
	public static ArrayList<Table> getTables(HbDataStore dbStore) {

		ArrayList<Table> tableList = new ArrayList<Table>();

		SessionFactory sessionFactory = dbStore.getSessionFactory();
		Map<String, ClassMetadata> classMetadataMap = sessionFactory.getAllClassMetadata();

		// Searches the table information in the mapped data
		for (ClassMetadata classMetadata : classMetadataMap.values()) {

			AbstractEntityPersister aep = (AbstractEntityPersister) classMetadata;

			String idColumn = (aep.getIdentifierColumnNames().length == 1) ? aep.getIdentifierColumnNames()[0] : "";

			String tableName = (aep.getTableName() == null) ? null : aep.getTableName().replace("`", "");
			String entityName = (aep.getEntityName() == null) ? null : aep.getEntityName().replace("`", "");
			String column = (idColumn == null) ? null : idColumn.replace("`", "");
			String property = (aep.getIdentifierPropertyName() == null) ? null
					: aep.getIdentifierPropertyName().replace("`", "");

			Table elem = new Table(tableName, entityName, column, property);

			// FIXME: Composite-IDs not supported right now!
			if (column == null || property == null) {
				continue;
			}

			tableList.add(elem);
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

}
