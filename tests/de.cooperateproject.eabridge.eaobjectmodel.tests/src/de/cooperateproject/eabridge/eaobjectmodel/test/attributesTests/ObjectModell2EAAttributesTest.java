package de.cooperateproject.eabridge.eaobjectmodel.test.attributesTests;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;

import javax.xml.parsers.ParserConfigurationException;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Assert;
import org.junit.BeforeClass;
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
import de.cooperateproject.eabridge.eaobjectmodel.Method;
import de.cooperateproject.eabridge.eaobjectmodel.Methodparameter;
import de.cooperateproject.eabridge.eaobjectmodel.Package;
import de.cooperateproject.eabridge.eaobjectmodel.Scope;
import de.cooperateproject.eabridge.eaobjectmodel.TypeReference;
import de.cooperateproject.eabridge.eaobjectmodel.test.TeneoParameterizedBaseTest;
import de.cooperateproject.eabridge.eaobjectmodel.test.util.NodeParserUtil;
import de.cooperateproject.eabridge.eaobjectmodel.test.util.ObjectModelHelper;
import de.cooperateproject.eabridge.eaobjectmodel.test.util.TestResource;
import de.cooperateproject.eabridge.eaobjectmodel.test.util.XMLParser;


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
   private final static File logPath = TestResource.bigModel.getFile();
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
		compareContent = readFile(logPath, Charset.defaultCharset());
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
		Element car = diagramHelper.createElement(2, subPackage, "car", "Class");
		Attribute att = diagramHelper.createElementAttr(5, car, "attribute2", Scope.PUBLIC, "double");
		Method run = diagramHelper.createElementMethode(car, "run", "int", Scope.PUBLIC, 4);
		Methodparameter firstParam = EaobjectmodelFactory.eINSTANCE.createMethodparameter();
		firstParam.setMethodID(run.getMethodID());
		
		TypeReference t = EaobjectmodelFactory.eINSTANCE.createTypeReference();
		t.setType("int");
		firstParam.setParameterType(t);
		Method stop = diagramHelper.createElementMethode(car, "stop", "none", Scope.PRIVATE, 2);
		Element car1 = diagramHelper.createElement(3, subPackage, "Car1", "class");
		Method run1 = diagramHelper.createElementMethode(car1, "run", "int",Scope.PUBLIC, 19);
		Methodparameter firstParam1 = EaobjectmodelFactory.eINSTANCE.createMethodparameter();
		firstParam1.setMethodID(run1.getMethodID());
		Element car2 = diagramHelper.createElement(5, subPackage, "Car2", "Class");
		Method run2 = diagramHelper.createElementMethode(car2, "run", "int", Scope.PUBLIC, 20);
		Methodparameter firstParam2 = EaobjectmodelFactory.eINSTANCE.createMethodparameter();
		firstParam1.setMethodID(run2.getMethodID());
		firstParam2.setParameterType(t);
		Element rad = diagramHelper.createElement(9, subPackage, "rad", "Class");
		Element door = diagramHelper.createElement(16, subPackage, "door", "Class");
		Element carInterface = diagramHelper.createElement(17, subPackage, "carInterface", "Interface");
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
		DiagramObject do1 = diagramHelper.createDiagrammObject(d, car, 356L, 467L, -93L, -189L);
		DiagramObject do2 = diagramHelper.createDiagrammObject(d, car1, 161L, 280L, -310L, -418L);
		DiagramObject do3 = diagramHelper.createDiagrammObject(d, car2, 584L, 689L, -349L, -419L);
		DiagramObject do4 = diagramHelper.createDiagrammObject(d, carInterface, 600L, 690L, -85L, -175L);
		DiagramObject do5 = diagramHelper.createDiagrammObject(d, rad, 454L, 544L, -552L, -622L);
		DiagramObject do6 = diagramHelper.createDiagrammObject(d, door, 701L, 791L, -544L, -614L);
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
      return Arrays.asList(XMLParser.XMLtoNodes(TestResource.bigModel.getFile().getAbsolutePath()));
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

