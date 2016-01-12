package de.cooperateproject.eabridge.eaobjectmodel.custom;

import java.io.Serializable;

import de.cooperateproject.eabridge.eaobjectmodel.xcore.Attribute;

public class AttributeConstraintID implements Serializable {

	private static final long serialVersionUID = 5110908598285180430L;
	
	public String getConstraint() {
		return constraint;
	}

	public void setConstraint(String constraint) {
		this.constraint = constraint;
	}

	public Attribute getAttribute() {
		return attribute;
	}

	public void setAttribute(Attribute attribute) {
		this.attribute = attribute;
	}

	protected String constraint;
    protected Attribute attribute;

    public AttributeConstraintID() {}

    public AttributeConstraintID(String constraint, Attribute attribute) {
        this.constraint = constraint;
        this.attribute = attribute;
    }
    // equals, hashCode
}
