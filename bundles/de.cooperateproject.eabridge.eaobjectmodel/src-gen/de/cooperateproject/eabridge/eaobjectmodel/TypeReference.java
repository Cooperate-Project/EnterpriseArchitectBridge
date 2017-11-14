/**
 */
package de.cooperateproject.eabridge.eaobjectmodel;

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
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.TypeReference#getTypeName <em>Type Name</em>}</li>
 * </ul>
 *
 * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getTypeReference()
 * @model
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
     * Returns the value of the '<em><b>Type Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Type Name</em>' attribute.
     * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getTypeReference_TypeName()
     * @model unique="false" suppressedSetVisibility="true"
     *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='matchesClassifierName'"
     * @generated
     */
	String getTypeName();

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @model classifierUnique="false"
     *        annotation="http://www.eclipse.org/emf/2002/GenModel body='&lt;%org.eclipse.emf.ecore.EClass%&gt; _eClass = this.eClass();\n&lt;%org.eclipse.emf.common.util.EList%&gt;&lt;&lt;%org.eclipse.emf.ecore.EStructuralFeature%&gt;&gt; _eAllStructuralFeatures = _eClass.getEAllStructuralFeatures();\nfinal &lt;%org.eclipse.xtext.xbase.lib.Functions.Function1%&gt;&lt;&lt;%org.eclipse.emf.ecore.EStructuralFeature%&gt;, &lt;%java.lang.Boolean%&gt;&gt; _function = new &lt;%org.eclipse.xtext.xbase.lib.Functions.Function1%&gt;&lt;&lt;%org.eclipse.emf.ecore.EStructuralFeature%&gt;, &lt;%java.lang.Boolean%&gt;&gt;()\n{\n\tpublic &lt;%java.lang.Boolean%&gt; apply(final &lt;%org.eclipse.emf.ecore.EStructuralFeature%&gt; it)\n\t{\n\t\t&lt;%java.lang.String%&gt; _name = it.getName();\n\t\treturn &lt;%java.lang.Boolean%&gt;.valueOf(&lt;%com.google.common.base.Objects%&gt;.equal(_name, \"classifier\"));\n\t}\n};\nfinal &lt;%org.eclipse.emf.ecore.EStructuralFeature%&gt; classifierFeature = &lt;%org.eclipse.xtext.xbase.lib.IterableExtensions%&gt;.&lt;&lt;%org.eclipse.emf.ecore.EStructuralFeature%&gt;&gt;findFirst(_eAllStructuralFeatures, _function);\n&lt;%org.eclipse.emf.ecore.EClass%&gt; _eClass_1 = this.eClass();\n&lt;%org.eclipse.emf.common.util.EList%&gt;&lt;&lt;%org.eclipse.emf.ecore.EStructuralFeature%&gt;&gt; _eAllStructuralFeatures_1 = _eClass_1.getEAllStructuralFeatures();\nfinal &lt;%org.eclipse.xtext.xbase.lib.Functions.Function1%&gt;&lt;&lt;%org.eclipse.emf.ecore.EStructuralFeature%&gt;, &lt;%java.lang.Boolean%&gt;&gt; _function_1 = new &lt;%org.eclipse.xtext.xbase.lib.Functions.Function1%&gt;&lt;&lt;%org.eclipse.emf.ecore.EStructuralFeature%&gt;, &lt;%java.lang.Boolean%&gt;&gt;()\n{\n\tpublic &lt;%java.lang.Boolean%&gt; apply(final &lt;%org.eclipse.emf.ecore.EStructuralFeature%&gt; it)\n\t{\n\t\t&lt;%java.lang.String%&gt; _name = it.getName();\n\t\treturn &lt;%java.lang.Boolean%&gt;.valueOf(&lt;%com.google.common.base.Objects%&gt;.equal(_name, \"typeName\"));\n\t}\n};\nfinal &lt;%org.eclipse.emf.ecore.EStructuralFeature%&gt; typeNameFeature = &lt;%org.eclipse.xtext.xbase.lib.IterableExtensions%&gt;.&lt;&lt;%org.eclipse.emf.ecore.EStructuralFeature%&gt;&gt;findFirst(_eAllStructuralFeatures_1, _function_1);\n&lt;%java.lang.Object%&gt; _eGet = this.eGet(classifierFeature);\nfinal &lt;%de.cooperateproject.eabridge.eaobjectmodel.Element%&gt; oldClassifier = ((&lt;%de.cooperateproject.eabridge.eaobjectmodel.Element%&gt;) _eGet);\nif (((!&lt;%com.google.common.base.Objects%&gt;.equal(oldClassifier, null)) &amp;&amp; (!&lt;%com.google.common.base.Objects%&gt;.equal(&lt;%org.eclipse.emf.ecore.util.EcoreUtil%&gt;.getID(oldClassifier), &lt;%org.eclipse.emf.ecore.util.EcoreUtil%&gt;.getID(classifier)))))\n{\n\t&lt;%org.eclipse.emf.common.util.EList%&gt;&lt;&lt;%org.eclipse.emf.common.notify.Adapter%&gt;&gt; _eAdapters = oldClassifier.eAdapters();\n\tfinal &lt;%java.util.function.Predicate%&gt;&lt;&lt;%org.eclipse.emf.common.notify.Adapter%&gt;&gt; _function_2 = new &lt;%java.util.function.Predicate%&gt;&lt;&lt;%org.eclipse.emf.common.notify.Adapter%&gt;&gt;()\n\t{\n\t\tpublic boolean test(final &lt;%org.eclipse.emf.common.notify.Adapter%&gt; a)\n\t\t{\n\t\t\treturn (a instanceof &lt;%de.cooperateproject.eabridge.eaobjectmodel.util.TypeReferenceClassifierNameRefresher%&gt;);\n\t\t}\n\t};\n\t_eAdapters.removeIf(_function_2);\n}\nboolean _notEquals = (!&lt;%com.google.common.base.Objects%&gt;.equal(classifier, null));\nif (_notEquals)\n{\n\t&lt;%org.eclipse.emf.common.util.EList%&gt;&lt;&lt;%org.eclipse.emf.common.notify.Adapter%&gt;&gt; _eAdapters_1 = classifier.eAdapters();\n\tboolean _isEmpty = _eAdapters_1.isEmpty();\n\tif (_isEmpty)\n\t{\n\t\tfinal &lt;%de.cooperateproject.eabridge.eaobjectmodel.util.TypeReferenceClassifierNameRefresher%&gt; refreshAdapter = new &lt;%de.cooperateproject.eabridge.eaobjectmodel.util.TypeReferenceClassifierNameRefresher%&gt;(this);\n\t\t&lt;%org.eclipse.emf.common.util.EList%&gt;&lt;&lt;%org.eclipse.emf.common.notify.Adapter%&gt;&gt; _eAdapters_2 = classifier.eAdapters();\n\t\t_eAdapters_2.add(refreshAdapter);\n\t}\n\t&lt;%java.lang.String%&gt; _name = classifier.getName();\n\tthis.eSet(typeNameFeature, _name);\n}\nelse\n{\n\tthis.eSet(typeNameFeature, null);\n}\nthis.eSet(classifierFeature, classifier);'"
     * @generated
     */
	void setType(Element classifier);

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @model primitiveTypeUnique="false"
     *        annotation="http://www.eclipse.org/emf/2002/GenModel body='&lt;%org.eclipse.emf.ecore.EClass%&gt; _eClass = this.eClass();\n&lt;%org.eclipse.emf.common.util.EList%&gt;&lt;&lt;%org.eclipse.emf.ecore.EStructuralFeature%&gt;&gt; _eAllStructuralFeatures = _eClass.getEAllStructuralFeatures();\nfinal &lt;%org.eclipse.xtext.xbase.lib.Functions.Function1%&gt;&lt;&lt;%org.eclipse.emf.ecore.EStructuralFeature%&gt;, &lt;%java.lang.Boolean%&gt;&gt; _function = new &lt;%org.eclipse.xtext.xbase.lib.Functions.Function1%&gt;&lt;&lt;%org.eclipse.emf.ecore.EStructuralFeature%&gt;, &lt;%java.lang.Boolean%&gt;&gt;()\n{\n\tpublic &lt;%java.lang.Boolean%&gt; apply(final &lt;%org.eclipse.emf.ecore.EStructuralFeature%&gt; it)\n\t{\n\t\t&lt;%java.lang.String%&gt; _name = it.getName();\n\t\treturn &lt;%java.lang.Boolean%&gt;.valueOf(&lt;%com.google.common.base.Objects%&gt;.equal(_name, \"classifier\"));\n\t}\n};\nfinal &lt;%org.eclipse.emf.ecore.EStructuralFeature%&gt; classifierFeature = &lt;%org.eclipse.xtext.xbase.lib.IterableExtensions%&gt;.&lt;&lt;%org.eclipse.emf.ecore.EStructuralFeature%&gt;&gt;findFirst(_eAllStructuralFeatures, _function);\n&lt;%org.eclipse.emf.ecore.EClass%&gt; _eClass_1 = this.eClass();\n&lt;%org.eclipse.emf.common.util.EList%&gt;&lt;&lt;%org.eclipse.emf.ecore.EStructuralFeature%&gt;&gt; _eAllStructuralFeatures_1 = _eClass_1.getEAllStructuralFeatures();\nfinal &lt;%org.eclipse.xtext.xbase.lib.Functions.Function1%&gt;&lt;&lt;%org.eclipse.emf.ecore.EStructuralFeature%&gt;, &lt;%java.lang.Boolean%&gt;&gt; _function_1 = new &lt;%org.eclipse.xtext.xbase.lib.Functions.Function1%&gt;&lt;&lt;%org.eclipse.emf.ecore.EStructuralFeature%&gt;, &lt;%java.lang.Boolean%&gt;&gt;()\n{\n\tpublic &lt;%java.lang.Boolean%&gt; apply(final &lt;%org.eclipse.emf.ecore.EStructuralFeature%&gt; it)\n\t{\n\t\t&lt;%java.lang.String%&gt; _name = it.getName();\n\t\treturn &lt;%java.lang.Boolean%&gt;.valueOf(&lt;%com.google.common.base.Objects%&gt;.equal(_name, \"typeName\"));\n\t}\n};\nfinal &lt;%org.eclipse.emf.ecore.EStructuralFeature%&gt; typeNameFeature = &lt;%org.eclipse.xtext.xbase.lib.IterableExtensions%&gt;.&lt;&lt;%org.eclipse.emf.ecore.EStructuralFeature%&gt;&gt;findFirst(_eAllStructuralFeatures_1, _function_1);\n&lt;%java.lang.Object%&gt; _eGet = this.eGet(classifierFeature);\nfinal &lt;%de.cooperateproject.eabridge.eaobjectmodel.Element%&gt; oldClassifier = ((&lt;%de.cooperateproject.eabridge.eaobjectmodel.Element%&gt;) _eGet);\nboolean _notEquals = (!&lt;%com.google.common.base.Objects%&gt;.equal(oldClassifier, null));\nif (_notEquals)\n{\n\t&lt;%org.eclipse.emf.common.util.EList%&gt;&lt;&lt;%org.eclipse.emf.common.notify.Adapter%&gt;&gt; _eAdapters = oldClassifier.eAdapters();\n\tfinal &lt;%java.util.function.Predicate%&gt;&lt;&lt;%org.eclipse.emf.common.notify.Adapter%&gt;&gt; _function_2 = new &lt;%java.util.function.Predicate%&gt;&lt;&lt;%org.eclipse.emf.common.notify.Adapter%&gt;&gt;()\n\t{\n\t\tpublic boolean test(final &lt;%org.eclipse.emf.common.notify.Adapter%&gt; a)\n\t\t{\n\t\t\treturn (a instanceof &lt;%de.cooperateproject.eabridge.eaobjectmodel.util.TypeReferenceClassifierNameRefresher%&gt;);\n\t\t}\n\t};\n\t_eAdapters.removeIf(_function_2);\n}\nboolean _notEquals_1 = (!&lt;%com.google.common.base.Objects%&gt;.equal(primitiveType, null));\nif (_notEquals_1)\n{\n\t&lt;%java.lang.String%&gt; _name = primitiveType.getName();\n\tthis.eSet(typeNameFeature, _name);\n}\nelse\n{\n\tthis.eSet(typeNameFeature, null);\n}\nthis.eSet(classifierFeature, null);'"
     * @generated
     */
	void setType(PrimitiveType primitiveType);

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @model notExistentTypeUnique="false"
     *        annotation="http://www.eclipse.org/emf/2002/GenModel body='&lt;%org.eclipse.emf.ecore.EClass%&gt; _eClass = this.eClass();\n&lt;%org.eclipse.emf.common.util.EList%&gt;&lt;&lt;%org.eclipse.emf.ecore.EStructuralFeature%&gt;&gt; _eAllStructuralFeatures = _eClass.getEAllStructuralFeatures();\nfinal &lt;%org.eclipse.xtext.xbase.lib.Functions.Function1%&gt;&lt;&lt;%org.eclipse.emf.ecore.EStructuralFeature%&gt;, &lt;%java.lang.Boolean%&gt;&gt; _function = new &lt;%org.eclipse.xtext.xbase.lib.Functions.Function1%&gt;&lt;&lt;%org.eclipse.emf.ecore.EStructuralFeature%&gt;, &lt;%java.lang.Boolean%&gt;&gt;()\n{\n\tpublic &lt;%java.lang.Boolean%&gt; apply(final &lt;%org.eclipse.emf.ecore.EStructuralFeature%&gt; it)\n\t{\n\t\t&lt;%java.lang.String%&gt; _name = it.getName();\n\t\treturn &lt;%java.lang.Boolean%&gt;.valueOf(&lt;%com.google.common.base.Objects%&gt;.equal(_name, \"classifier\"));\n\t}\n};\nfinal &lt;%org.eclipse.emf.ecore.EStructuralFeature%&gt; classifierFeature = &lt;%org.eclipse.xtext.xbase.lib.IterableExtensions%&gt;.&lt;&lt;%org.eclipse.emf.ecore.EStructuralFeature%&gt;&gt;findFirst(_eAllStructuralFeatures, _function);\n&lt;%org.eclipse.emf.ecore.EClass%&gt; _eClass_1 = this.eClass();\n&lt;%org.eclipse.emf.common.util.EList%&gt;&lt;&lt;%org.eclipse.emf.ecore.EStructuralFeature%&gt;&gt; _eAllStructuralFeatures_1 = _eClass_1.getEAllStructuralFeatures();\nfinal &lt;%org.eclipse.xtext.xbase.lib.Functions.Function1%&gt;&lt;&lt;%org.eclipse.emf.ecore.EStructuralFeature%&gt;, &lt;%java.lang.Boolean%&gt;&gt; _function_1 = new &lt;%org.eclipse.xtext.xbase.lib.Functions.Function1%&gt;&lt;&lt;%org.eclipse.emf.ecore.EStructuralFeature%&gt;, &lt;%java.lang.Boolean%&gt;&gt;()\n{\n\tpublic &lt;%java.lang.Boolean%&gt; apply(final &lt;%org.eclipse.emf.ecore.EStructuralFeature%&gt; it)\n\t{\n\t\t&lt;%java.lang.String%&gt; _name = it.getName();\n\t\treturn &lt;%java.lang.Boolean%&gt;.valueOf(&lt;%com.google.common.base.Objects%&gt;.equal(_name, \"typeName\"));\n\t}\n};\nfinal &lt;%org.eclipse.emf.ecore.EStructuralFeature%&gt; typeNameFeature = &lt;%org.eclipse.xtext.xbase.lib.IterableExtensions%&gt;.&lt;&lt;%org.eclipse.emf.ecore.EStructuralFeature%&gt;&gt;findFirst(_eAllStructuralFeatures_1, _function_1);\n&lt;%java.lang.Object%&gt; _eGet = this.eGet(classifierFeature);\nfinal &lt;%de.cooperateproject.eabridge.eaobjectmodel.Element%&gt; oldClassifier = ((&lt;%de.cooperateproject.eabridge.eaobjectmodel.Element%&gt;) _eGet);\nboolean _notEquals = (!&lt;%com.google.common.base.Objects%&gt;.equal(oldClassifier, null));\nif (_notEquals)\n{\n\t&lt;%org.eclipse.emf.common.util.EList%&gt;&lt;&lt;%org.eclipse.emf.common.notify.Adapter%&gt;&gt; _eAdapters = oldClassifier.eAdapters();\n\tfinal &lt;%java.util.function.Predicate%&gt;&lt;&lt;%org.eclipse.emf.common.notify.Adapter%&gt;&gt; _function_2 = new &lt;%java.util.function.Predicate%&gt;&lt;&lt;%org.eclipse.emf.common.notify.Adapter%&gt;&gt;()\n\t{\n\t\tpublic boolean test(final &lt;%org.eclipse.emf.common.notify.Adapter%&gt; a)\n\t\t{\n\t\t\treturn (a instanceof &lt;%de.cooperateproject.eabridge.eaobjectmodel.util.TypeReferenceClassifierNameRefresher%&gt;);\n\t\t}\n\t};\n\t_eAdapters.removeIf(_function_2);\n}\nthis.eSet(typeNameFeature, notExistentType);\nthis.eSet(classifierFeature, null);'"
     * @generated
     */
	void setType(String notExistentType);

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @model kind="operation" unique="false"
     *        annotation="http://www.eclipse.org/emf/2002/GenModel body='Optional&lt;PrimitiveType&gt; primitive = PrimitiveType.VALUES\r\n\t\t.stream()\r\n\t\t.filter(prim -&gt; prim.toString().equalsIgnoreCase(getTypeName()))\r\n\t\t.findFirst();\r\n\r\nif (primitive.isPresent()) {\r\n\treturn primitive.get();\r\n} else {\r\n\treturn null;\r\n}'"
     * @generated
     */
	PrimitiveType getPrimitiveType();

} // TypeReference
