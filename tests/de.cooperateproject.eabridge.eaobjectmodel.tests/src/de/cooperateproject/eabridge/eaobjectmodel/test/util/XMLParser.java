package de.cooperateproject.eabridge.eaobjectmodel.test.util;

import java.io.IOException;
import java.io.InputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 * 
 * @author turki
 *
 */
public class XMLParser {
	/**
	 * 
	 * @param nList
	 * @return the number of nodes with type Element_Node.
	 */
	public static int getElementNodeNumber(NodeList nList) {
		int result = 0;
		for (int temp = 0; temp < nList.getLength(); temp++) {
			Node nNode = (Node) nList.item(temp);
			if (nNode.getNodeType() == Node.ELEMENT_NODE) {
				result++;
			}
		}
		return result;
	}

	public static Object[][] XMLtoNodes(InputStream is) throws ParserConfigurationException, SAXException, IOException {
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		DocumentBuilder db = dbf.newDocumentBuilder();
		Document doc = db.parse(is);
		doc.getDocumentElement().normalize();
		NodeList nodeList = doc.getElementsByTagName("column");
		Object[][] result = new Object[nodeList.getLength()][2];
		for (int i = 0; i < nodeList.getLength(); i++) {
			result[i][0] = nodeList.item(i).getAttributes().item(0).getNodeValue();
			result[i][1] = nodeList.item(i);
		}
		return result;
	}

}