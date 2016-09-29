package de.cooperateproject.eabridge.eaobjectmodel.test;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Assert;
import org.junit.Test;
import org.w3c.dom.Attr;
import org.w3c.dom.Node;
import org.xmlunit.builder.DiffBuilder;
import org.xmlunit.diff.Comparison;
import org.xmlunit.diff.Comparison.Detail;
import org.xmlunit.diff.ComparisonResult;
import org.xmlunit.diff.ComparisonType;
import org.xmlunit.diff.Diff;
import org.xmlunit.diff.DifferenceEvaluator;
import org.xmlunit.diff.DifferenceEvaluators;
import org.xmlunit.util.Predicate;

import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;

import de.cooperateproject.eabridge.eaobjectmodel.Element;
import de.cooperateproject.eabridge.eaobjectmodel.Package;
import de.cooperateproject.eabridge.eaobjectmodel.test.util.TestResource;
import de.cooperateproject.eabridge.eaobjectmodel.util.HibernateUtils;

public class ObjectModel2EAMappingTest extends TeneoMappingBaseTest {

	@Test
	public void testAddModel() throws Exception {
		initTestDb(TestResource.EASchemaChangelog);

		Package loadedPackage = loadModelFromResource(TestResource.SimpleClassModel);
		Session session = getTestDB().getDataStore().getSessionFactory().openSession();
		Transaction trans = session.getTransaction();

		trans.begin();
		session.save(loadedPackage);
		trans.commit();

		String content = getTestDB().generateChangelog();
		String compareContent = readFile(TestResource.SimpleClassModelChangelog.getFile(), Charset.defaultCharset());
		
		Diff myDiff = createDiffBuilder(compareContent, content).build();
		Assert.assertFalse(myDiff.toString(), myDiff.hasDifferences());
	}

	@Test
	public void testWriteModificationDateOfElement() throws Exception {
		initTestDb(TestResource.EASingleClassChangelog);

		Session session = getTestDB().getDataStore().getSessionFactory().openSession();
		Transaction trans = session.beginTransaction();

		Query query = session.createQuery("FROM Element WHERE ElementID = 2");
		List<Element> results = HibernateUtils.getListFromQuery(query, Element.class);
		assertEquals(1, results.size());
		Element actualContent = results.get(0);
		Date newDate = new Calendar.Builder().setDate(1980, 0, 1).build().getTime();
		actualContent.setModifiedDate(newDate);

		trans.commit();
		session.close();

		String changed = getTestDB().generateChangelog();
		String original = readFile(TestResource.EASingleClassChangelog.getFile(), Charset.defaultCharset());
		Diff myDiff = createDiffBuilder(original, changed).build();
		
		assertEquals("Expected one difference, but got more: " + myDiff.toString(),1, Iterables.size(myDiff.getDifferences()));
		Detail targetDetail = Iterables.getFirst(myDiff.getDifferences(), null).getComparison().getTestDetails();
		assertThat(targetDetail.getTarget(), is(instanceOf(Attr.class)));
		assertEquals("valueDate", targetDetail.getTarget().getNodeName());
		assertEquals(new SimpleDateFormat("yyy-MM-dd HH:mm:ss.S").format(newDate), (String)targetDetail.getValue());

	}

	private DiffBuilder createDiffBuilder(String expected, String actual) {
		return DiffBuilder.compare(expected).withTest(actual)
				.withNodeFilter(NodeFilterBuilder.create()
						.add(n -> !n.getNodeName().equals("include"))
						.build())
				.withAttributeFilter(AttributeFilterBuilder.create()
						.add(a -> !a.getName().equals("author") || !a.getOwnerElement().getNodeName().equals("changeSet"))
						.add(a -> !a.getName().equals("id") || !a.getOwnerElement().getNodeName().equals("changeSet"))
						.add(a -> !a.getName().equals("catalogName") || !a.getOwnerElement().getNodeName().equals("insert"))
						.add(a -> !a.getName().equals("schemaName") || !a.getOwnerElement().getNodeName().equals("insert"))
						.build())
				.withDifferenceEvaluator(DifferenceEvaluatorBuilder.create()
						.add(new CaseInsensitiveColumnNameEvaluator())
						.build())
				.ignoreWhitespace()
				.ignoreComments()
				.checkForSimilar();
	}
	
	private static class CaseInsensitiveColumnNameEvaluator implements DifferenceEvaluator {

		@Override
		public ComparisonResult evaluate(Comparison comparison, ComparisonResult outcome) {
			if (outcome == ComparisonResult.EQUAL) {
				return outcome;
			}
			
			if (comparison.getType() != ComparisonType.ATTR_VALUE) {
				return outcome;
			}
			
	        final Node controlNode = comparison.getControlDetails().getTarget();
	        if (controlNode instanceof Attr) {
	            Attr attr = (Attr) controlNode;
	            if (attr.getName().equals("name") && attr.getOwnerElement().getNodeName().equals("column")) {
	            	
	            	String controlValue = attr.getValue();
	            	String testValue = (String)comparison.getTestDetails().getValue();
	            	
	            	if (controlValue.equalsIgnoreCase(testValue)) {
	            		return ComparisonResult.SIMILAR;
	            	}

	            }
	        }
	        return outcome;
		}
		
	}
	
	private static class PredicateFilterBuilder<T> {
		Collection<Predicate<T>> predicates = Lists.newArrayList();
		
		public PredicateFilterBuilder<T> add(Predicate<T> predicate) {
			predicates.add(predicate);
			return this;
		}
		
		public Predicate<T> build() {
			return new Predicate<T>() {
				@Override
				public boolean test(T t) {
					return predicates.stream().allMatch(p -> p.test(t));
				}};
		}
	}
	
	private static class AttributeFilterBuilder extends PredicateFilterBuilder<Attr> {
		public static AttributeFilterBuilder create() {
			return new AttributeFilterBuilder();
		}
	}
	
	private static class NodeFilterBuilder extends PredicateFilterBuilder<Node> {
		public static NodeFilterBuilder create() {
			return new NodeFilterBuilder();
		}
	}
	
	private static class DifferenceEvaluatorBuilder {
		
		private final Collection<DifferenceEvaluator> evaluators = Lists.newArrayList(DifferenceEvaluators.Default);
		
		public static DifferenceEvaluatorBuilder create() {
			return new DifferenceEvaluatorBuilder();
		}
		
		public DifferenceEvaluatorBuilder add(DifferenceEvaluator evaluator) {
			evaluators.add(evaluator);
			return this;
		}
		
		public DifferenceEvaluator build() {
			return DifferenceEvaluators.chain(evaluators.toArray(new DifferenceEvaluator[0]));
		}
	}

}
