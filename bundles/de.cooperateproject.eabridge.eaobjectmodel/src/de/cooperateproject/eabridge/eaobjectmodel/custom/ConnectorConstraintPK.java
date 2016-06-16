package de.cooperateproject.eabridge.eaobjectmodel.custom;

import java.io.Serializable;

public class ConnectorConstraintPK implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6403908284592273608L;

	protected String Constraint;

	protected Long Connector;

	public ConnectorConstraintPK(String constraint, Long Connector) {
		super();
		Constraint = constraint;
		this.Connector = Connector;
	}

	public ConnectorConstraintPK() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Connector == null) ? 0 : Connector.hashCode());
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
		ConnectorConstraintPK other = (ConnectorConstraintPK) obj;
		if (Connector == null) {
			if (other.Connector != null)
				return false;
		} else if (!Connector.equals(other.Connector))
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

	public Long getConnector() {
		return Connector;
	}

	public void setConnector(Long connector) {
		Connector = connector;
	}

}
