package de.cooperateproject.eabridge.eaobjectmodel.database.impl;

/**
 * @author schick
 * Needed for manipulation of the hibernate config file for the containment workaround in the Constraint elements
 */
public class XMLModifier {
	
	public static String modifyXML(String xml) {
		xml = xml.replaceAll("foreign-key=\"Attribute_Constraints_key\" ", "");
//		xml = xml.replaceAll("Attribute_Constraints_AttributeID", "ID")
		xml = xml.replaceAll("foreign-key=\"Method_Parameters_key\" ", "");
		return xml;
		
	}

}
