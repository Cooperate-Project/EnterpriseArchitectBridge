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


public class NodeParserUtil {
	 
	   public static boolean isDataBaseChangeLogNode(Node n) { 
		   return n.getNodeName().equals("databaseChangeLog");
	   }
	   public static boolean isChangeSetNode(Node n) { 
		   return n.getNodeName().equals("changeSet");
	   }
	   public static boolean isInsertNode(Node n) { 
		   return n.getNodeName().equals("insert");
	   }
	   public static boolean isColumnNode(Node n) { 
		   return n.getNodeName().equals("column");
	   }
	   public static String getColumnName(Node node) {
		   return node.getAttributes().item(0).getNodeValue();
	   }
	   public static boolean NodesHaveSameName(Node savedNode, Node readedNode) { 
		   String savedColumnName = getColumnName(savedNode);
		   String readedColumnName =  getColumnName(readedNode);
		   return savedColumnName.equals(readedColumnName);
	   }
	 
	   public static String getColumnParentName(Node node) {
		   return node.getParentNode().getAttributes().item(2).getNodeValue();
	   }
	   public static boolean NodesHaveSameParent(Node savedNode, Node readedNode) { 
		   String savedColumnParentName = getColumnParentName(savedNode);
		   String readedColumnParentName =  getColumnParentName(readedNode);
		   return savedColumnParentName.equals(readedColumnParentName);
	   }

	   public static DiffBuilder createDiffBuilder(String expected, String actual, Node node) {
			return DiffBuilder.compare(actual).withTest(expected)
					.withNodeFilter(NodeFilterBuilder.create()
							.add(n -> !n.getNodeName().equals("include"))
							.add(n -> isDataBaseChangeLogNode(n) || isChangeSetNode(n) || isInsertNode(n) 
								|| (isColumnNode(n) && NodesHaveSameName(n, node) && NodesHaveSameParent(n, node)))
							.build())
					.withAttributeFilter(AttributeFilterBuilder.create()
							.add(a -> !a.getName().equals("author") || !a.getOwnerElement().getNodeName().equals("changeSet"))
							.add(a -> !a.getName().equals("id") || !a.getOwnerElement().getNodeName().equals("changeSet"))
							.add(a -> !a.getName().equals("catalogName") || !a.getOwnerElement().getNodeName().equals("insert"))
							.add(a -> !a.getName().equals("schemaName") || !a.getOwnerElement().getNodeName().equals("insert"))
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
