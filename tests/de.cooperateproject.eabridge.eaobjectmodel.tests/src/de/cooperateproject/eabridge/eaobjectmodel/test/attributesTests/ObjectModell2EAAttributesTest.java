package de.cooperateproject.eabridge.eaobjectmodel.test.attributesTests;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collection;

import javax.xml.parsers.ParserConfigurationException;

import org.apache.commons.io.IOUtils;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;
import org.xmlunit.diff.Diff;

import de.cooperateproject.eabridge.eaobjectmodel.Attribute;
import de.cooperateproject.eabridge.eaobjectmodel.Connector;
import de.cooperateproject.eabridge.eaobjectmodel.ConnectorType;
import de.cooperateproject.eabridge.eaobjectmodel.Diagram;
import de.cooperateproject.eabridge.eaobjectmodel.DiagramLink;
import de.cooperateproject.eabridge.eaobjectmodel.DiagramObject;
import de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelFactory;
import de.cooperateproject.eabridge.eaobjectmodel.Element;
import de.cooperateproject.eabridge.eaobjectmodel.ElementType;
import de.cooperateproject.eabridge.eaobjectmodel.Method;
import de.cooperateproject.eabridge.eaobjectmodel.Methodparameter;
import de.cooperateproject.eabridge.eaobjectmodel.Package;
import de.cooperateproject.eabridge.eaobjectmodel.Scope;
import de.cooperateproject.eabridge.eaobjectmodel.TypeReference;
import de.cooperateproject.eabridge.eaobjectmodel.test.util.NodeParserUtil;
import de.cooperateproject.eabridge.eaobjectmodel.test.util.ObjectModelHelper;
import de.cooperateproject.eabridge.eaobjectmodel.test.util.XMLParser;
import de.cooperateproject.eabridge.tests.common.TeneoParameterizedBaseTest;
import de.cooperateproject.eabridge.tests.common.util.TestResource;


/**
 * 
 * @author turki
 * 
 */
@RunWith(Parameterized.class)
public class ObjectModell2EAAttributesTest  extends TeneoParameterizedBaseTest {
   private static String content;
   private static String compareContent;
   private String attribute;
   private Node node;
   private final static TestResource logPath = TestResource.bigModel;
   /**
    * 
    * @throws Exception
    * @author turki
    * @Trows Exception ds
    * this Methode is used to:
    * initialize the connection with the database. 
    * create an Object-Model instance for the test.
    * fetch the saved desired logs from a saved file.
    * generate a log from the created ObjectModel
    * 
    */
   @BeforeClass
   public static void initialize() throws Exception {
	    initTestDb(TestResource.EASchemaChangelog);
		Session session = getTestDb().getDataStore().getSessionFactory().openSession();
		Transaction trans = session.getTransaction();
		Package objectModel = initObjectModel();
		trans.begin();
		session.save(objectModel);
		trans.commit();
		compareContent = logPath.getContent();
		content = getTestDb().generateChangelog();
   }
   
   /**
    * this Methode is used to initialize a class diagramm to save it in the In-Memory H2 Database.
    * @return 
    */
   public static Package initObjectModel() {
		ObjectModelHelper diagramHelper = new ObjectModelHelper();
		Package root = diagramHelper.createRootPackage("root");
		Package subPackage = diagramHelper.createSubPackage(root);
		Element car = diagramHelper.createElement(2, subPackage, "car", ElementType.CLASS);
		Attribute att = diagramHelper.createElementAttr(5, car, "attribute2", Scope.PUBLIC, "double");
		Method run = diagramHelper.createElementMethode(car, "run", "int", Scope.PUBLIC, 4);
		Methodparameter firstParam = EaobjectmodelFactory.eINSTANCE.createMethodparameter();
		firstParam.setMethod(run);
		
		TypeReference t = EaobjectmodelFactory.eINSTANCE.createTypeReference();
		t.setType("int");
		firstParam.setParameterType(t);
		Method stop = diagramHelper.createElementMethode(car, "stop", "none", Scope.PRIVATE, 2);
		Element car1 = diagramHelper.createElement(3, subPackage, "Car1", ElementType.CLASS);
		Method run1 = diagramHelper.createElementMethode(car1, "run", "int",Scope.PUBLIC, 19);
		Methodparameter firstParam1 = EaobjectmodelFactory.eINSTANCE.createMethodparameter();
		firstParam1.setMethod(run1);
		Element car2 = diagramHelper.createElement(5, subPackage, "Car2", ElementType.CLASS);
		Method run2 = diagramHelper.createElementMethode(car2, "run", "int", Scope.PUBLIC, 20);
		Methodparameter firstParam2 = EaobjectmodelFactory.eINSTANCE.createMethodparameter();
		firstParam1.setMethod(run2);
		firstParam2.setParameterType(t);
		Element rad = diagramHelper.createElement(9, subPackage, "rad", ElementType.CLASS);
		Element door = diagramHelper.createElement(16, subPackage, "door", ElementType.CLASS);
		Element carInterface = diagramHelper.createElement(17, subPackage, "carInterface", ElementType.INTERFACE);
		Connector c1 = diagramHelper.createConnector(30, car1, car, ConnectorType.CONNECTOR_TYPE.GENERALIZATION, null, null);
		Connector c2 = diagramHelper.createConnector(31, car2, car, ConnectorType.CONNECTOR_TYPE.GENERALIZATION, null, null);
		Connector c3 = diagramHelper.createConnector(32, car2, carInterface, ConnectorType.CONNECTOR_TYPE.REALISATION, null, null);
		Connector c4 = diagramHelper.createConnector(33, rad, car2, ConnectorType.CONNECTOR_TYPE.ASSOCIATION, null, null);
		Connector c5 = diagramHelper.createConnector(34, car2, door, ConnectorType.CONNECTOR_TYPE.ASSOCIATION, "1", "1..4");
		Diagram d = diagramHelper.createDiagram(40, subPackage, "Logical", "firtDiagramm");
		DiagramLink dl1 = diagramHelper.createDiagramLink(51, d, c1, 0, 0, 0, 0);
		DiagramLink dl2 = diagramHelper.createDiagramLink(52, d, c2, 0, 0, 0, 0);
		DiagramLink dl3 = diagramHelper.createDiagramLink(53, d, c3, 0, 0, 0, 0);
		DiagramLink dl4 = diagramHelper.createDiagramLink(54, d, c4, 0, 0, 0, 0);
		DiagramObject do1 = diagramHelper.createDiagrammObject(d, car, 356, 467, -93, -189);
		DiagramObject do2 = diagramHelper.createDiagrammObject(d, car1, 161, 280, -310, -418);
		DiagramObject do3 = diagramHelper.createDiagrammObject(d, car2, 584, 689, -349, -419);
		DiagramObject do4 = diagramHelper.createDiagrammObject(d, carInterface, 600, 690, -85, -175);
		DiagramObject do5 = diagramHelper.createDiagrammObject(d, rad, 454, 544, -552, -622);
		DiagramObject do6 = diagramHelper.createDiagrammObject(d, door, 701, 791, -544, -614);
	    return root;
   }
   /**
    * 
    * @param attribute is a column attribute in Enterprise Architect database. this value is used for showing the name of the tested attribute in a Junit test case.
    * @param node is the whole XML node for a given attribute. this attribute is used from XMLUnit to compare the state of a save node with the state of the tested node.
    */
   public ObjectModell2EAAttributesTest(String attribute, Node node) {
	  this.attribute = attribute;
      this.node = node;
   }
   /**
    * this method calls the class constructor to set the values of attribute and node for each test case. 
    * @return array of all pairs attribute and node that sould be tested.
    */
   @Parameters(name = "Test for attribute: {0}")
   public static Collection<Object[]> setParameters() throws ParserConfigurationException, SAXException, IOException {
	   InputStream is = TestResource.bigModel.getInputStream();
	   try {
		   return Arrays.asList(XMLParser.XMLtoNodes(is));		   
	   } finally {
		   IOUtils.closeQuietly(is);
	   }
   }
   /**
    * this methode starts the test. it uses the diffBuilder to compare the created logs with the desired logs value.
    */
   @Test
   public void testAttribute() {
	    Diff db = NodeParserUtil.createDiffBuilder(content, compareContent, node).build();
		Assert.assertFalse(db.toString(), db.hasDifferences());
   }
  
}

