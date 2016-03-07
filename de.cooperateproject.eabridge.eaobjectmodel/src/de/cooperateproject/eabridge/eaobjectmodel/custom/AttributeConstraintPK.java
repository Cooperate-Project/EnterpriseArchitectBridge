package de.cooperateproject.eabridge.eaobjectmodel.custom;

import java.io.Serializable;

import de.cooperateproject.eabridge.eaobjectmodel.Attribute;

/**
 * The id class used in the composite id test case
 *  
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.4 $
*/
public class AttributeConstraintPK implements Serializable {
	
	private static String delimiter = "__;__";
	
	public String Constraint;
	public Attribute Attribute;
	
	/** No-arg constructor */
	public AttributeConstraintPK() {}
	
	public int hashCode() {
	    return Constraint.hashCode() + Attribute.hashCode();
	}

	public String toString() {
		return Constraint + delimiter + Attribute;
	}

	public boolean equals(Object other)	{
	    if (other != null && (other instanceof AttributeConstraintPK)) {
	        AttributeConstraintPK p = (AttributeConstraintPK)other;
	        return p.Constraint.equals(Constraint) && p.Attribute.equals(Attribute);
	    }
	    return false;
	}

	/**
	 * @return the Constraint
	 */
	public String getConstraint() {
		return Constraint;
	}

	/**
	 * @param Constraint the Constraint to set
	 */
	public void setConstraint(String Constraint) {
		this.Constraint = Constraint;
	}

	/**
	 * @return the Attribute
	 */
	public Attribute getAttribute() {
		return Attribute;
	}

	/**
	 * @param Attribute the Attribute to set
	 */
	public void setAttribute(Attribute Attribute) {
		this.Attribute = Attribute;
	}
}
