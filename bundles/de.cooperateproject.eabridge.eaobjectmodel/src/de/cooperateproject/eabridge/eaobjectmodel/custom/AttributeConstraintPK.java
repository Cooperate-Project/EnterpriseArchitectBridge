package de.cooperateproject.eabridge.eaobjectmodel.custom;

import java.io.Serializable;

/**
 * The id class used in the composite id test case
 *  
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.4 $
*/
public class AttributeConstraintPK implements Serializable {

	private static final long serialVersionUID = 3307987927496437247L;
	private static String delimiter = "__;__";
	
	private String constraint;
	private long attributeID;
	
	@Override
	public int hashCode() {
	    return (int) (constraint.hashCode() + attributeID);
	}

	@Override
	public String toString() {
		return constraint + delimiter + attributeID;
	}

	@Override
	public boolean equals(Object other)	{
	    if (other != null && (other instanceof AttributeConstraintPK)) {
	        AttributeConstraintPK p = (AttributeConstraintPK)other;
	        return p.constraint.equals(constraint) && p.attributeID == attributeID;
	    }
	    return false;
	}

	/**
	 * @return the Constraint
	 */
	public String getConstraint() {
		return constraint;
	}

	/**
	 * @param Constraint the Constraint to set
	 */
	public void setConstraint(String constraint) {
		this.constraint = constraint;
	}

	/**
	 * @return the Attribute
	 */
	public long getAttributeID() {
		return attributeID;
	}

	/**
	 * @param Attribute the Attribute to set
	 */
	public void setAttribute(long attributeID) {
		this.attributeID = attributeID;
	}
}
