package de.cooperateproject.eabridge.eaobjectmodel.custom;

import java.io.Serializable;
import de.cooperateproject.eabridge.eaobjectmodel.Method;

public class MethodParameterPK implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 272235228898926803L;
	private static String delimiter = "__;__";

	public String Name;
	public Method Method;
	
	public MethodParameterPK() {
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Method == null) ? 0 : Method.hashCode());
		result = prime * result + ((Name == null) ? 0 : Name.hashCode());
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
		MethodParameterPK other = (MethodParameterPK) obj;
		if (Method == null) {
			if (other.Method != null)
				return false;
		} else if (!Method.equals(other.Method))
			return false;
		if (Name == null) {
			if (other.Name != null)
				return false;
		} else if (!Name.equals(other.Name))
			return false;
		return true;
	}

	public static String getDelimiter() {
		return delimiter;
	}

	public static void setDelimiter(String delimiter) {
		MethodParameterPK.delimiter = delimiter;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public Method getMethod() {
		return Method;
	}

	public void setMethod(Method method) {
		Method = method;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
}
