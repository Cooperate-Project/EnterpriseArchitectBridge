/**
 */
package de.cooperateproject.eabridge.eaobjectmodel;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.TypeReference#getClassifier <em>Classifier</em>}</li>
 * </ul>
 *
 * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getTypeReference()
 * @model features="typeName" 
 *        typeNameUnique="false" typeNameDataType="org.eclipse.emf.ecore.EString" typeNameSuppressedGetVisibility="true" typeNameSuppressedSetVisibility="true"
 *        typeNameAnnotation="http://www.eclipse.org/emf/2002/Ecore constraints='matchesClassifierName'"
 * @generated
 */
public interface TypeReference extends EObject {
	/**
	 * Returns the value of the '<em><b>Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classifier</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classifier</em>' reference.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getTypeReference_Classifier()
	 * @model suppressedSetVisibility="true"
	 * @generated
	 */
	Element getClassifier();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model classifierUnique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%org.eclipse.emf.ecore.EClass%> _eClass = this.eClass();\n<%org.eclipse.emf.common.util.EList%><<%org.eclipse.emf.ecore.EStructuralFeature%>> _eAllStructuralFeatures = _eClass.getEAllStructuralFeatures();\nfinal <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%org.eclipse.emf.ecore.EStructuralFeature%>, <%java.lang.Boolean%>> _function = new <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%org.eclipse.emf.ecore.EStructuralFeature%>, <%java.lang.Boolean%>>()\n{\n\tpublic <%java.lang.Boolean%> apply(final <%org.eclipse.emf.ecore.EStructuralFeature%> it)\n\t{\n\t\t<%java.lang.String%> _name = it.getName();\n\t\treturn <%java.lang.Boolean%>.valueOf(<%com.google.common.base.Objects%>.equal(_name, \"classifier\"));\n\t}\n};\nfinal <%org.eclipse.emf.ecore.EStructuralFeature%> classifierFeature = <%org.eclipse.xtext.xbase.lib.IterableExtensions%>.<<%org.eclipse.emf.ecore.EStructuralFeature%>>findFirst(_eAllStructuralFeatures, _function);\n<%org.eclipse.emf.ecore.EClass%> _eClass_1 = this.eClass();\n<%org.eclipse.emf.common.util.EList%><<%org.eclipse.emf.ecore.EStructuralFeature%>> _eAllStructuralFeatures_1 = _eClass_1.getEAllStructuralFeatures();\nfinal <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%org.eclipse.emf.ecore.EStructuralFeature%>, <%java.lang.Boolean%>> _function_1 = new <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%org.eclipse.emf.ecore.EStructuralFeature%>, <%java.lang.Boolean%>>()\n{\n\tpublic <%java.lang.Boolean%> apply(final <%org.eclipse.emf.ecore.EStructuralFeature%> it)\n\t{\n\t\t<%java.lang.String%> _name = it.getName();\n\t\treturn <%java.lang.Boolean%>.valueOf(<%com.google.common.base.Objects%>.equal(_name, \"typeName\"));\n\t}\n};\nfinal <%org.eclipse.emf.ecore.EStructuralFeature%> typeNameFeature = <%org.eclipse.xtext.xbase.lib.IterableExtensions%>.<<%org.eclipse.emf.ecore.EStructuralFeature%>>findFirst(_eAllStructuralFeatures_1, _function_1);\n<%java.lang.Object%> _eGet = this.eGet(classifierFeature);\nfinal <%de.cooperateproject.eabridge.eaobjectmodel.Element%> oldClassifier = ((<%de.cooperateproject.eabridge.eaobjectmodel.Element%>) _eGet);\nif (((!<%com.google.common.base.Objects%>.equal(oldClassifier, null)) && (!<%com.google.common.base.Objects%>.equal(<%org.eclipse.emf.ecore.util.EcoreUtil%>.getID(oldClassifier), <%org.eclipse.emf.ecore.util.EcoreUtil%>.getID(classifier)))))\n{\n\t<%org.eclipse.emf.common.util.EList%><<%org.eclipse.emf.common.notify.Adapter%>> _eAdapters = oldClassifier.eAdapters();\n\tfinal <%java.util.function.Predicate%><<%org.eclipse.emf.common.notify.Adapter%>> _function_2 = new <%java.util.function.Predicate%><<%org.eclipse.emf.common.notify.Adapter%>>()\n\t{\n\t\tpublic boolean test(final <%org.eclipse.emf.common.notify.Adapter%> a)\n\t\t{\n\t\t\treturn (a instanceof <%de.cooperateproject.eabridge.eaobjectmodel.util.TypeReferenceClassifierNameRefresher%>);\n\t\t}\n\t};\n\t_eAdapters.removeIf(_function_2);\n}\nboolean _notEquals = (!<%com.google.common.base.Objects%>.equal(classifier, null));\nif (_notEquals)\n{\n\t<%org.eclipse.emf.common.util.EList%><<%org.eclipse.emf.common.notify.Adapter%>> _eAdapters_1 = classifier.eAdapters();\n\tboolean _isEmpty = _eAdapters_1.isEmpty();\n\tif (_isEmpty)\n\t{\n\t\tfinal <%de.cooperateproject.eabridge.eaobjectmodel.util.TypeReferenceClassifierNameRefresher%> refreshAdapter = new <%de.cooperateproject.eabridge.eaobjectmodel.util.TypeReferenceClassifierNameRefresher%>(this);\n\t\t<%org.eclipse.emf.common.util.EList%><<%org.eclipse.emf.common.notify.Adapter%>> _eAdapters_2 = classifier.eAdapters();\n\t\t_eAdapters_2.add(refreshAdapter);\n\t}\n\t<%java.lang.String%> _name = classifier.getName();\n\tthis.eSet(typeNameFeature, _name);\n}\nelse\n{\n\tthis.eSet(typeNameFeature, null);\n}\nthis.eSet(classifierFeature, classifier);'"
	 * @generated
	 */
	void setType(Element classifier);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model primitiveTypeUnique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%org.eclipse.emf.ecore.EClass%> _eClass = this.eClass();\n<%org.eclipse.emf.common.util.EList%><<%org.eclipse.emf.ecore.EStructuralFeature%>> _eAllStructuralFeatures = _eClass.getEAllStructuralFeatures();\nfinal <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%org.eclipse.emf.ecore.EStructuralFeature%>, <%java.lang.Boolean%>> _function = new <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%org.eclipse.emf.ecore.EStructuralFeature%>, <%java.lang.Boolean%>>()\n{\n\tpublic <%java.lang.Boolean%> apply(final <%org.eclipse.emf.ecore.EStructuralFeature%> it)\n\t{\n\t\t<%java.lang.String%> _name = it.getName();\n\t\treturn <%java.lang.Boolean%>.valueOf(<%com.google.common.base.Objects%>.equal(_name, \"classifier\"));\n\t}\n};\nfinal <%org.eclipse.emf.ecore.EStructuralFeature%> classifierFeature = <%org.eclipse.xtext.xbase.lib.IterableExtensions%>.<<%org.eclipse.emf.ecore.EStructuralFeature%>>findFirst(_eAllStructuralFeatures, _function);\n<%org.eclipse.emf.ecore.EClass%> _eClass_1 = this.eClass();\n<%org.eclipse.emf.common.util.EList%><<%org.eclipse.emf.ecore.EStructuralFeature%>> _eAllStructuralFeatures_1 = _eClass_1.getEAllStructuralFeatures();\nfinal <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%org.eclipse.emf.ecore.EStructuralFeature%>, <%java.lang.Boolean%>> _function_1 = new <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%org.eclipse.emf.ecore.EStructuralFeature%>, <%java.lang.Boolean%>>()\n{\n\tpublic <%java.lang.Boolean%> apply(final <%org.eclipse.emf.ecore.EStructuralFeature%> it)\n\t{\n\t\t<%java.lang.String%> _name = it.getName();\n\t\treturn <%java.lang.Boolean%>.valueOf(<%com.google.common.base.Objects%>.equal(_name, \"typeName\"));\n\t}\n};\nfinal <%org.eclipse.emf.ecore.EStructuralFeature%> typeNameFeature = <%org.eclipse.xtext.xbase.lib.IterableExtensions%>.<<%org.eclipse.emf.ecore.EStructuralFeature%>>findFirst(_eAllStructuralFeatures_1, _function_1);\n<%java.lang.Object%> _eGet = this.eGet(classifierFeature);\nfinal <%de.cooperateproject.eabridge.eaobjectmodel.Element%> oldClassifier = ((<%de.cooperateproject.eabridge.eaobjectmodel.Element%>) _eGet);\nboolean _notEquals = (!<%com.google.common.base.Objects%>.equal(oldClassifier, null));\nif (_notEquals)\n{\n\t<%org.eclipse.emf.common.util.EList%><<%org.eclipse.emf.common.notify.Adapter%>> _eAdapters = oldClassifier.eAdapters();\n\tfinal <%java.util.function.Predicate%><<%org.eclipse.emf.common.notify.Adapter%>> _function_2 = new <%java.util.function.Predicate%><<%org.eclipse.emf.common.notify.Adapter%>>()\n\t{\n\t\tpublic boolean test(final <%org.eclipse.emf.common.notify.Adapter%> a)\n\t\t{\n\t\t\treturn (a instanceof <%de.cooperateproject.eabridge.eaobjectmodel.util.TypeReferenceClassifierNameRefresher%>);\n\t\t}\n\t};\n\t_eAdapters.removeIf(_function_2);\n}\nboolean _notEquals_1 = (!<%com.google.common.base.Objects%>.equal(primitiveType, null));\nif (_notEquals_1)\n{\n\t<%java.lang.String%> _name = primitiveType.getName();\n\tthis.eSet(typeNameFeature, _name);\n}\nelse\n{\n\tthis.eSet(typeNameFeature, null);\n}\nthis.eSet(classifierFeature, null);'"
	 * @generated
	 */
	void setType(PrimitiveType primitiveType);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model notExistentTypeUnique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%org.eclipse.emf.ecore.EClass%> _eClass = this.eClass();\n<%org.eclipse.emf.common.util.EList%><<%org.eclipse.emf.ecore.EStructuralFeature%>> _eAllStructuralFeatures = _eClass.getEAllStructuralFeatures();\nfinal <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%org.eclipse.emf.ecore.EStructuralFeature%>, <%java.lang.Boolean%>> _function = new <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%org.eclipse.emf.ecore.EStructuralFeature%>, <%java.lang.Boolean%>>()\n{\n\tpublic <%java.lang.Boolean%> apply(final <%org.eclipse.emf.ecore.EStructuralFeature%> it)\n\t{\n\t\t<%java.lang.String%> _name = it.getName();\n\t\treturn <%java.lang.Boolean%>.valueOf(<%com.google.common.base.Objects%>.equal(_name, \"classifier\"));\n\t}\n};\nfinal <%org.eclipse.emf.ecore.EStructuralFeature%> classifierFeature = <%org.eclipse.xtext.xbase.lib.IterableExtensions%>.<<%org.eclipse.emf.ecore.EStructuralFeature%>>findFirst(_eAllStructuralFeatures, _function);\n<%org.eclipse.emf.ecore.EClass%> _eClass_1 = this.eClass();\n<%org.eclipse.emf.common.util.EList%><<%org.eclipse.emf.ecore.EStructuralFeature%>> _eAllStructuralFeatures_1 = _eClass_1.getEAllStructuralFeatures();\nfinal <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%org.eclipse.emf.ecore.EStructuralFeature%>, <%java.lang.Boolean%>> _function_1 = new <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%org.eclipse.emf.ecore.EStructuralFeature%>, <%java.lang.Boolean%>>()\n{\n\tpublic <%java.lang.Boolean%> apply(final <%org.eclipse.emf.ecore.EStructuralFeature%> it)\n\t{\n\t\t<%java.lang.String%> _name = it.getName();\n\t\treturn <%java.lang.Boolean%>.valueOf(<%com.google.common.base.Objects%>.equal(_name, \"typeName\"));\n\t}\n};\nfinal <%org.eclipse.emf.ecore.EStructuralFeature%> typeNameFeature = <%org.eclipse.xtext.xbase.lib.IterableExtensions%>.<<%org.eclipse.emf.ecore.EStructuralFeature%>>findFirst(_eAllStructuralFeatures_1, _function_1);\n<%java.lang.Object%> _eGet = this.eGet(classifierFeature);\nfinal <%de.cooperateproject.eabridge.eaobjectmodel.Element%> oldClassifier = ((<%de.cooperateproject.eabridge.eaobjectmodel.Element%>) _eGet);\nboolean _notEquals = (!<%com.google.common.base.Objects%>.equal(oldClassifier, null));\nif (_notEquals)\n{\n\t<%org.eclipse.emf.common.util.EList%><<%org.eclipse.emf.common.notify.Adapter%>> _eAdapters = oldClassifier.eAdapters();\n\tfinal <%java.util.function.Predicate%><<%org.eclipse.emf.common.notify.Adapter%>> _function_2 = new <%java.util.function.Predicate%><<%org.eclipse.emf.common.notify.Adapter%>>()\n\t{\n\t\tpublic boolean test(final <%org.eclipse.emf.common.notify.Adapter%> a)\n\t\t{\n\t\t\treturn (a instanceof <%de.cooperateproject.eabridge.eaobjectmodel.util.TypeReferenceClassifierNameRefresher%>);\n\t\t}\n\t};\n\t_eAdapters.removeIf(_function_2);\n}\nthis.eSet(typeNameFeature, notExistentType);\nthis.eSet(classifierFeature, null);'"
	 * @generated
	 */
	void setType(String notExistentType);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='Optional<PrimitiveType> primitive = PrimitiveType.VALUES\r\n\t\t.stream()\r\n\t\t.filter(prim -> prim.toString().equalsIgnoreCase(typeName))\r\n\t\t.findFirst();\r\n\r\nif (primitive.isPresent()) {\r\n\treturn primitive.get();\r\n} else {\r\n\treturn null;\r\n}'"
	 * @generated
	 */
	PrimitiveType getPrimitiveType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%org.eclipse.emf.ecore.EClass%> _eClass = this.eClass();\n<%org.eclipse.emf.common.util.EList%><<%org.eclipse.emf.ecore.EStructuralFeature%>> _eAllStructuralFeatures = _eClass.getEAllStructuralFeatures();\nfinal <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%org.eclipse.emf.ecore.EStructuralFeature%>, <%java.lang.Boolean%>> _function = new <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%org.eclipse.emf.ecore.EStructuralFeature%>, <%java.lang.Boolean%>>()\n{\n\tpublic <%java.lang.Boolean%> apply(final <%org.eclipse.emf.ecore.EStructuralFeature%> it)\n\t{\n\t\t<%java.lang.String%> _name = it.getName();\n\t\treturn <%java.lang.Boolean%>.valueOf(<%com.google.common.base.Objects%>.equal(_name, \"typeName\"));\n\t}\n};\n<%org.eclipse.emf.ecore.EStructuralFeature%> _findFirst = <%org.eclipse.xtext.xbase.lib.IterableExtensions%>.<<%org.eclipse.emf.ecore.EStructuralFeature%>>findFirst(_eAllStructuralFeatures, _function);\n<%java.lang.Object%> _eGet = this.eGet(_findFirst);\nfinal <%java.lang.String%> typeName = ((<%java.lang.String%>) _eGet);\nreturn typeName;'"
	 * @generated
	 */
	String getType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" diagnosticsUnique="false" contextUnique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%org.eclipse.emf.ecore.EClass%> _eClass = this.eClass();\n<%org.eclipse.emf.common.util.EList%><<%org.eclipse.emf.ecore.EStructuralFeature%>> _eAllStructuralFeatures = _eClass.getEAllStructuralFeatures();\nfinal <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%org.eclipse.emf.ecore.EStructuralFeature%>, <%java.lang.Boolean%>> _function = new <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%org.eclipse.emf.ecore.EStructuralFeature%>, <%java.lang.Boolean%>>()\n{\n\tpublic <%java.lang.Boolean%> apply(final <%org.eclipse.emf.ecore.EStructuralFeature%> it)\n\t{\n\t\t<%java.lang.String%> _name = it.getName();\n\t\treturn <%java.lang.Boolean%>.valueOf(<%com.google.common.base.Objects%>.equal(_name, \"classifier\"));\n\t}\n};\n<%org.eclipse.emf.ecore.EStructuralFeature%> _findFirst = <%org.eclipse.xtext.xbase.lib.IterableExtensions%>.<<%org.eclipse.emf.ecore.EStructuralFeature%>>findFirst(_eAllStructuralFeatures, _function);\n<%java.lang.Object%> _eGet = this.eGet(_findFirst);\nfinal <%de.cooperateproject.eabridge.eaobjectmodel.Element%> classifierTmp = ((<%de.cooperateproject.eabridge.eaobjectmodel.Element%>) _eGet);\n<%org.eclipse.emf.ecore.EClass%> _eClass_1 = this.eClass();\n<%org.eclipse.emf.common.util.EList%><<%org.eclipse.emf.ecore.EStructuralFeature%>> _eAllStructuralFeatures_1 = _eClass_1.getEAllStructuralFeatures();\nfinal <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%org.eclipse.emf.ecore.EStructuralFeature%>, <%java.lang.Boolean%>> _function_1 = new <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%org.eclipse.emf.ecore.EStructuralFeature%>, <%java.lang.Boolean%>>()\n{\n\tpublic <%java.lang.Boolean%> apply(final <%org.eclipse.emf.ecore.EStructuralFeature%> it)\n\t{\n\t\t<%java.lang.String%> _name = it.getName();\n\t\treturn <%java.lang.Boolean%>.valueOf(<%com.google.common.base.Objects%>.equal(_name, \"typeName\"));\n\t}\n};\n<%org.eclipse.emf.ecore.EStructuralFeature%> _findFirst_1 = <%org.eclipse.xtext.xbase.lib.IterableExtensions%>.<<%org.eclipse.emf.ecore.EStructuralFeature%>>findFirst(_eAllStructuralFeatures_1, _function_1);\n<%java.lang.Object%> _eGet_1 = this.eGet(_findFirst_1);\nfinal <%java.lang.String%> typeName = ((<%java.lang.String%>) _eGet_1);\nif (((<%com.google.common.base.Objects%>.equal(classifierTmp, null) || <%com.google.common.base.Strings%>.isNullOrEmpty(classifierTmp.getName())) || classifierTmp.getName().equals(typeName)))\n{\n\treturn true;\n}\nelse\n{\n\treturn false;\n}'"
	 * @generated
	 */
	boolean hasmatchesClassifierName(DiagnosticChain diagnostics, Map<Object, Object> context);

} // TypeReference
