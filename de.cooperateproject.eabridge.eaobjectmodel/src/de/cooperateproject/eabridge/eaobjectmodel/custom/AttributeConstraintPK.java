package de.cooperateproject.eabridge.eaobjectmodel.custom;

import java.io.Serializable;

public class AttributeConstraintPK implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6403908284592273608L;
	
	protected String Constraint;
	
    protected Long Attribute;

	public AttributeConstraintPK(String constraint, Long attribute) {
		super();
		Constraint = constraint;
		Attribute = attribute;
	}

	public AttributeConstraintPK() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Attribute == null) ? 0 : Attribute.hashCode());
		result = prime * result + ((Constraint == null) ? 0 : Constraint.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AttributeConstraintPK other = (AttributeConstraintPK) obj;
		if (Attribute == null) {
			if (other.Attribute != null)
				return false;
		} else if (!Attribute.equals(other.Attribute))
			return false;
		if (Constraint == null) {
			if (other.Constraint != null)
				return false;
		} else if (!Constraint.equals(other.Constraint))
			return false;
		return true;
	}

	public String getConstraint() {
		return Constraint;
	}

	public void setConstraint(String constraint) {
		Constraint = constraint;
	}

	public Long getAttribute() {
		return Attribute;
	}

	public void setAttribute(Long attribute) {
		Attribute = attribute;
	}
	
}
