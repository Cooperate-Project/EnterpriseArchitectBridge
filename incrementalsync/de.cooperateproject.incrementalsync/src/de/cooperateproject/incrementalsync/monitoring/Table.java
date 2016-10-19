package de.cooperateproject.incrementalsync.monitoring;

/**
 * Immutable table object, representing a monitored database table.
 */
public class Table {

	private String tableName;
	private String entityName;
	private String identifierColumn;
	private String identifierProperty;

	/**
	 * Creates a new immutable table object with information about the database
	 * and the mapped representation. Example: "t_object" and "Element",
	 * "Object_ID" and "ElementID"
	 * 
	 * @param tableName
	 *            The name of the table in the database
	 * @param entityname
	 *            The name of the mapped entity in Hibernate
	 * @param identifierColumn
	 *            the name of the primary key column in the database
	 * @param identifierProperty
	 *            the name of the mapped identifier property in Hibernate
	 */
	public Table(String tableName, String entityname, String identifierColumn, String identifierProperty) {
		this.tableName = tableName;
		this.entityName = entityname;
		this.identifierColumn = identifierColumn;
		this.identifierProperty = identifierProperty;
	}

	/**
	 * Returns the table name in the database
	 * 
	 * @return A String, e.G. "t_object"
	 */
	public String getTableName() {
		return tableName;
	}

	/**
	 * Returns the mappend entity name in Hibernate
	 * 
	 * @return A String, e.G. "Element"
	 */
	public String getEntityName() {
		return entityName;
	}

	/**
	 * Returns the name of the primary key column in the database
	 * 
	 * @return A String, e.G. "Object_ID"
	 */
	public String getIdentifierColumn() {
		return identifierColumn;
	}

	/**
	 * Returns the name of the mapped identifier property in Hibernate
	 * 
	 * @return A String, e.G. "ElementID"
	 */
	public String getIdentifierProperty() {
		return identifierProperty;
	}

}
