package de.cooperateproject.eabridge.eaobjectmodel.test.attributesTests;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.apache.commons.lang.StringUtils;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xmlunit.diff.Diff;
import org.xmlunit.diff.Difference;

import com.google.common.base.Optional;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;

import de.cooperateproject.eabridge.eaobjectmodel.Connector;
import de.cooperateproject.eabridge.eaobjectmodel.ConnectorType;
import de.cooperateproject.eabridge.eaobjectmodel.Diagram;
import de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelFactory;
import de.cooperateproject.eabridge.eaobjectmodel.Element;
import de.cooperateproject.eabridge.eaobjectmodel.ElementType;
import de.cooperateproject.eabridge.eaobjectmodel.Method;
import de.cooperateproject.eabridge.eaobjectmodel.Methodparameter;
import de.cooperateproject.eabridge.eaobjectmodel.Package;
import de.cooperateproject.eabridge.eaobjectmodel.Scope;
import de.cooperateproject.eabridge.eaobjectmodel.TypeReference;
import de.cooperateproject.eabridge.eaobjectmodel.test.util.DetailedComparisonFormatter;
import de.cooperateproject.eabridge.eaobjectmodel.test.util.NodeParserUtil;
import de.cooperateproject.eabridge.eaobjectmodel.test.util.ObjectModelHelper;
import de.cooperateproject.eabridge.tests.common.TeneoParameterizedBaseTest;
import de.cooperateproject.eabridge.tests.common.util.TestResource;

/**
 * 
 * @author turki
 * 
 */
@RunWith(Parameterized.class)
public class ObjectModell2EAAttributesTest extends TeneoParameterizedBaseTest {
	
	private static final TestResource logPath = TestResource.bigModel;
	private Node node;
	private Collection<Difference> comparisonResult;

	/**
	 * 
	 * @param attribute
	 *            is a column attribute in Enterprise Architect database. this value
	 *            is used for showing the name of the tested attribute in a Junit
	 *            test case.
	 * @param node
	 *            is the whole XML node for a given attribute. this attribute is
	 *            used from XMLUnit to compare the state of a save node with the
	 *            state of the tested node.
	 */
	public ObjectModell2EAAttributesTest(String testName, Node node, Collection<Difference> comparisonResult) {
		this.node = node;
		this.comparisonResult = comparisonResult;
	}

	/**
	 * this method calls the class constructor to set the values of attribute and
	 * node for each test case.
	 * 
	 * @return array of all pairs attribute and node that sould be tested.
	 * @throws Exception
	 */
	@Parameters(name = "Test for attribute: {0}")
	public static Collection<Object[]> setParameters() throws Exception {
		initTestDb(TestResource.EASchemaChangelog);
		Session session = getTestDb().getDataStore().getSessionFactory().openSession();
		Transaction trans = session.getTransaction();
		Package objectModel = initObjectModel();
		trans.begin();
		session.save(objectModel);
		trans.commit();

		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		DocumentBuilder db = dbf.newDocumentBuilder();

		Document compareDocument;
		Collection<Difference> comparisonResult = new ArrayList<>();
		try (InputStream contentStream = new ByteArrayInputStream(getTestDb().generateChangelog().getBytes())) {
			compareDocument = db.parse(logPath.getInputStream());
			Document contentDocument = db.parse(contentStream);
			Diff diffBuilder = NodeParserUtil.createDiffBuilder(contentDocument, compareDocument).build();
			diffBuilder.getDifferences().forEach(comparisonResult::add);
		}

		NodeList nodes = compareDocument.getElementsByTagName("column");
		Collection<Object[]> resultingParameters = new ArrayList<>(nodes.getLength());
		for (int i = 0; i < nodes.getLength(); ++i) {
			Node currentNode = nodes.item(i);
			String nodeName = currentNode.getAttributes().getNamedItem("name").getNodeValue();
			String parentName = currentNode.getParentNode().getAttributes().getNamedItem("tableName").getNodeValue();
			String changeSetId = currentNode.getParentNode().getParentNode().getAttributes().getNamedItem("id")
					.getNodeValue();
			String testName = String.format("%s - %s - %s", nodeName, parentName, changeSetId);
			resultingParameters.add(new Object[] { testName, currentNode, comparisonResult });
		}
		
		deinitialize();
		
		return resultingParameters;
	}

	/**
	 * this methode starts the test. it uses the diffBuilder to compare the created
	 * logs with the desired logs value.
	 */
	@Test
	public void testAttribute() {
		Optional<Difference> matchingDiff = Iterables.tryFind(comparisonResult, diff -> matches(diff, node));
		if (matchingDiff.isPresent()) {
			assertFail(matchingDiff.get());
		}
	}

	private static boolean matches(Difference diff, Node node) {
		String xPathWithDiff = createXPath(diff.getComparison().getControlDetails().getTarget());
		String xPathParent = createXPath(node);
		return xPathWithDiff.startsWith(xPathParent);
	}

	private static String createXPath(Node node) {
		List<String> segments = new ArrayList<>();

		Node currentNode = node;
		while (currentNode != null) {
			if (currentNode instanceof org.w3c.dom.Element) {
				org.w3c.dom.Element currentElement = (org.w3c.dom.Element) currentNode;
				String tagName = currentElement.getTagName();
				Node currentParentNode = currentElement.getParentNode();
				if (currentParentNode instanceof Document) {
					segments.add(String.format("/%s", tagName));
					currentNode = null;
				} else {
					NodeList siblings = ((org.w3c.dom.Element) currentElement.getParentNode())
							.getElementsByTagName(tagName);
					int index = 0;
					for (index = 0; index < siblings.getLength(); ++index) {
						if (siblings.item(index) == currentElement) {
							index++;
							break;
						}
					}
					segments.add(String.format("%s[%d]", tagName, index));
					currentNode = currentNode.getParentNode();
				}
			} else if (currentNode instanceof Attr) {
				segments.add("@" + ((Attr) currentNode).getName());
				currentNode = ((Attr) currentNode).getOwnerElement();
			}
		}

		return StringUtils.join(Lists.reverse(segments), "/");
	}

	private static void assertFail(Difference diff) {
		DetailedComparisonFormatter formatter = new DetailedComparisonFormatter();
		String shortDescription = formatter.getDescription(diff.getComparison());
		String expectedDescription = formatter.getDetails(diff.getComparison().getControlDetails(),
				diff.getComparison().getType(), true);
		String actualDescription = formatter.getDetails(diff.getComparison().getTestDetails(),
				diff.getComparison().getType(), true);
		String message = String.format("%s\n\texpected: %s\n\tactual: %s", shortDescription, expectedDescription,
				actualDescription);
		Assert.fail(message);
	}
	
	/**
	 * this Methode is used to initialize a class diagramm to save it in the
	 * In-Memory H2 Database.
	 * 
	 * @return
	 */
	private static Package initObjectModel() {
		ObjectModelHelper diagramHelper = new ObjectModelHelper();
		Package root = diagramHelper.createRootPackage("root");
		Package subPackage = diagramHelper.createSubPackage(root);
		Element car = diagramHelper.createElement(2, subPackage, "car", ElementType.CLASS);
		diagramHelper.createElementAttr(5, car, "attribute2", Scope.PUBLIC, "double", 1);
		Method run = diagramHelper.createElementMethode(car, "run", "int", Scope.PUBLIC, 4, 1);
		Methodparameter firstParam = EaobjectmodelFactory.eINSTANCE.createMethodparameter();
		firstParam.setMethod(run);
		firstParam.setPosition(1);

		TypeReference t = EaobjectmodelFactory.eINSTANCE.createTypeReference();
		t.setType("int");
		firstParam.setParameterType(t);
		diagramHelper.createElementMethode(car, "stop", "none", Scope.PRIVATE, 2, 2);
		Element car1 = diagramHelper.createElement(3, subPackage, "Car1", ElementType.CLASS);
		Method run1 = diagramHelper.createElementMethode(car1, "run", "int", Scope.PUBLIC, 19, 1);
		Methodparameter firstParam1 = EaobjectmodelFactory.eINSTANCE.createMethodparameter();
		firstParam1.setMethod(run1);
		firstParam1.setPosition(1);
		Element car2 = diagramHelper.createElement(5, subPackage, "Car2", ElementType.CLASS);
		Method run2 = diagramHelper.createElementMethode(car2, "run", "int", Scope.PUBLIC, 20, 1);
		Methodparameter firstParam2 = EaobjectmodelFactory.eINSTANCE.createMethodparameter();
		firstParam1.setMethod(run2);
		firstParam2.setParameterType(t);
		firstParam2.setPosition(2);
		Element rad = diagramHelper.createElement(9, subPackage, "rad", ElementType.CLASS);
		Element door = diagramHelper.createElement(16, subPackage, "door", ElementType.CLASS);
		Element carInterface = diagramHelper.createElement(17, subPackage, "carInterface", ElementType.INTERFACE);
		Connector c1 = diagramHelper.createConnector(30, car1, car, ConnectorType.GENERALIZATION, null,
				null);
		Connector c2 = diagramHelper.createConnector(31, car2, car, ConnectorType.GENERALIZATION, null,
				null);
		Connector c3 = diagramHelper.createConnector(32, car2, carInterface, ConnectorType.REALISATION,
				null, null);
		Connector c4 = diagramHelper.createConnector(33, rad, car2, ConnectorType.ASSOCIATION, null,
				null);
		diagramHelper.createConnector(34, car2, door, ConnectorType.ASSOCIATION, "1",
				"1..4");
		Diagram d = diagramHelper.createDiagram(40, subPackage, "Logical", "firtDiagramm");
		diagramHelper.createDiagramLink(51, d, c1);
		diagramHelper.createDiagramLink(52, d, c2);
		diagramHelper.createDiagramLink(53, d, c3);
		diagramHelper.createDiagramLink(54, d, c4);
		diagramHelper.createDiagrammObject(d, car, 356, 467, -93, -189, 1);
		diagramHelper.createDiagrammObject(d, car1, 161, 280, -310, -418, 2);
		diagramHelper.createDiagrammObject(d, car2, 584, 689, -349, -419, 3);
		diagramHelper.createDiagrammObject(d, carInterface, 600, 690, -85, -175, 4);
		diagramHelper.createDiagrammObject(d, rad, 454, 544, -552, -622, 5);
		diagramHelper.createDiagrammObject(d, door, 701, 791, -544, -614, 6);
		return root;
	}

}
