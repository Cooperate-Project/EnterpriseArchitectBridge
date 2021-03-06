package de.cooperateproject.eabridge.eaobjectmodel.util;

import java.util.Arrays;
import java.util.HashMap;

public class Geometry {

	public HashMap<String, Integer> hashInt = new HashMap<String, Integer>();
	public HashMap<String, Node> hashNode = new HashMap<String, Node>();
	
	// Used to store unused rest
	private String second;

	public Geometry(String geometry) {
		if (geometry == null) {
			geometry = "SX=0;SY=0;EX=0;EY=0;EDGE=0;$LLB=;LLT=;LMT=;LMB=;LRT=;LRB=;IRHS=;ILHS=";
		}
		String[] attributes = geometry.split(";");
		for (String attribute : attributes) {
			String[] infos = attribute.split("=");
			String key = infos[0];
			if (infos.length > 1) {
				String value = infos[1];
				if (value.matches("-?[0-9]+")) {
					hashInt.put(key, Integer.parseInt(value));
				} else {
//					infos = Arrays.copyOfRange(infos, 1, infos.length);
//					hashNode.put(key, new Node(String.join("=", infos)));
				}
			}
		}
		
		second = "$LLB" + geometry.split("LLB")[1];
	}

	// Used to parse inner Nodes
	// currently not in use
	public static class Node extends HashMap<String, Integer> {

		public Node() {
			this(null);
		}
		
		public Node(String node) {
			if (node != null) {
				String[] attributes = node.split(":");
				for (String attribute : attributes) {
					String key = attribute.split("=")[0];
					String value = attribute.split("=")[1];
					this.put(key, Integer.parseInt(value));
				}
			}
		}
	}

	@Override
	public String toString() {
		String first = String.format("SX=%d;SY=%d;EX=%d;EY=%d;EDGE=%d;", hashInt.get("SX"), hashInt.get("SY"), hashInt.get("EX"),
				hashInt.get("EY"), hashInt.get("EDGE"));
		return first + second;
	}
}
