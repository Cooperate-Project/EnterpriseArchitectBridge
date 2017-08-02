package de.cooperateproject.eabridge.eaobjectmodel.test.util;

import java.util.Collection;

import org.w3c.dom.Attr;
import org.w3c.dom.Node;
import org.xmlunit.builder.DiffBuilder;
import org.xmlunit.diff.Comparison;
import org.xmlunit.diff.ComparisonResult;
import org.xmlunit.diff.ComparisonType;
import org.xmlunit.diff.DifferenceEvaluator;
import org.xmlunit.diff.DifferenceEvaluators;
import org.xmlunit.util.Predicate;

import com.google.common.collect.Lists;

public final class ChangeLogComparator {

	public static DiffBuilder createDiffBuilder(String expected, String actual) {
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
