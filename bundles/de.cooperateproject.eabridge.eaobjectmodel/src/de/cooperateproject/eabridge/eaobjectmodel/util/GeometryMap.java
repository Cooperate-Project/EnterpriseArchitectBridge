package de.cooperateproject.eabridge.eaobjectmodel.util;
import java.util.HashMap;

public class GeometryMap extends HashMap<String, Integer>  {	
	private static final long serialVersionUID = 1L;
	public GeometryMap(String geometry) {
		if(geometry == null) {
			geometry = "SX=0;SY=0;EX=0;EY=0;EDGE=0;$LLB=0;LLT=0;LMT=0;LMB=0;LRT=0;LRB=0;IRHS=0;ILHS=0";
		}
		 String[] attributes = geometry.split(";");
		for (String attribute: attributes) {
			 String key = attribute.split("=")[0];
			 String value = attribute.split("=")[1];
			this.put(key, Integer.parseInt(value));
		}
	}
	@Override
	public String toString() {
		String result = "";
		for(String currentKey : super.keySet()){
			result += currentKey + "=" + super.get(currentKey) + ';';
		}
		return result;
	}
}
