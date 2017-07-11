/**
 */
package de.cooperateproject.eabridge.eaobjectmodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diagram Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.DiagramLink#getConnector <em>Connector</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.DiagramLink#getDiagram <em>Diagram</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.DiagramLink#getGeometry <em>Geometry</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.DiagramLink#getInstanceID <em>Instance ID</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.DiagramLink#getHidden <em>Hidden</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.DiagramLink#getPath <em>Path</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.DiagramLink#getStyle <em>Style</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.DiagramLink#getSX <em>SX</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.DiagramLink#getSY <em>SY</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.DiagramLink#getEX <em>EX</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.DiagramLink#getEY <em>EY</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.DiagramLink#getLLBCX <em>LLBCX</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.DiagramLink#getLLBCY <em>LLBCY</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.DiagramLink#getLLBOX <em>LLBOX</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.DiagramLink#getLLBOY <em>LLBOY</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.DiagramLink#getLLTCX <em>LLTCX</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.DiagramLink#getLLTCY <em>LLTCY</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.DiagramLink#getLLTOX <em>LLTOX</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.DiagramLink#getLLTOY <em>LLTOY</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.DiagramLink#getLRBCX <em>LRBCX</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.DiagramLink#getLRBCY <em>LRBCY</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.DiagramLink#getLRBOX <em>LRBOX</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.DiagramLink#getLRBOY <em>LRBOY</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.DiagramLink#getLRTCX <em>LRTCX</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.DiagramLink#getLRTCY <em>LRTCY</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.DiagramLink#getLRTOX <em>LRTOX</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.DiagramLink#getLRTOY <em>LRTOY</em>}</li>
 * </ul>
 *
 * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getDiagramLink()
 * @model
 * @generated
 */
public interface DiagramLink extends EObject {
	/**
	 * Returns the value of the '<em><b>Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connector</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connector</em>' reference.
	 * @see #setConnector(Connector)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getDiagramLink_Connector()
	 * @model
	 * @generated
	 */
	Connector getConnector();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.DiagramLink#getConnector <em>Connector</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connector</em>' reference.
	 * @see #getConnector()
	 * @generated
	 */
	void setConnector(Connector value);

	/**
	 * Returns the value of the '<em><b>Diagram</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.cooperateproject.eabridge.eaobjectmodel.Diagram#getDiagramLinks <em>Diagram Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diagram</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diagram</em>' container reference.
	 * @see #setDiagram(Diagram)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getDiagramLink_Diagram()
	 * @see de.cooperateproject.eabridge.eaobjectmodel.Diagram#getDiagramLinks
	 * @model opposite="DiagramLinks" transient="false"
	 * @generated
	 */
	Diagram getDiagram();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.DiagramLink#getDiagram <em>Diagram</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diagram</em>' container reference.
	 * @see #getDiagram()
	 * @generated
	 */
	void setDiagram(Diagram value);

	/**
	 * Returns the value of the '<em><b>Geometry</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Geometry</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Geometry</em>' attribute.
	 * @see #setGeometry(String)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getDiagramLink_Geometry()
	 * @model unique="false"
	 * @generated
	 */
	String getGeometry();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.DiagramLink#getGeometry <em>Geometry</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geometry</em>' attribute.
	 * @see #getGeometry()
	 * @generated
	 */
	void setGeometry(String value);

	/**
	 * Returns the value of the '<em><b>Instance ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instance ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance ID</em>' attribute.
	 * @see #setInstanceID(Long)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getDiagramLink_InstanceID()
	 * @model unique="false"
	 * @generated
	 */
	Long getInstanceID();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.DiagramLink#getInstanceID <em>Instance ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instance ID</em>' attribute.
	 * @see #getInstanceID()
	 * @generated
	 */
	void setInstanceID(Long value);

	/**
	 * Returns the value of the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hidden</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hidden</em>' attribute.
	 * @see #setHidden(Boolean)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getDiagramLink_Hidden()
	 * @model unique="false"
	 * @generated
	 */
	Boolean getHidden();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.DiagramLink#getHidden <em>Hidden</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hidden</em>' attribute.
	 * @see #getHidden()
	 * @generated
	 */
	void setHidden(Boolean value);

	/**
	 * Returns the value of the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path</em>' attribute.
	 * @see #setPath(String)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getDiagramLink_Path()
	 * @model unique="false"
	 * @generated
	 */
	String getPath();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.DiagramLink#getPath <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' attribute.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(String value);

	/**
	 * Returns the value of the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Style</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style</em>' attribute.
	 * @see #setStyle(String)
	 * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getDiagramLink_Style()
	 * @model unique="false"
	 * @generated
	 */
	String getStyle();

	/**
	 * Sets the value of the '{@link de.cooperateproject.eabridge.eaobjectmodel.DiagramLink#getStyle <em>Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style</em>' attribute.
	 * @see #getStyle()
	 * @generated
	 */
	void setStyle(String value);

	/**
	 * Returns the value of the '<em><b>SX</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SX</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SX</em>' attribute.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getDiagramLink_SX()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='&lt;%java.lang.String%&gt; _geometry = this.getGeometry();\r\nfinal &lt;%de.cooperateproject.eabridge.eaobjectmodel.util.Geometry%&gt; map = new &lt;%de.cooperateproject.eabridge.eaobjectmodel.util.Geometry%&gt;(_geometry);\r\n&lt;%java.lang.Integer%&gt; _get = map.hashInt.get(\"SX\");\r\nreturn _get;'"
	 * @generated
	 */
	int getSX();

	/**
	 * Returns the value of the '<em><b>SY</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SY</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SY</em>' attribute.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getDiagramLink_SY()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='&lt;%java.lang.String%&gt; _geometry = this.getGeometry();\r\nfinal &lt;%de.cooperateproject.eabridge.eaobjectmodel.util.Geometry%&gt; map = new &lt;%de.cooperateproject.eabridge.eaobjectmodel.util.Geometry%&gt;(_geometry);\r\n&lt;%java.lang.Integer%&gt; _get = map.hashInt.get(\"SY\");\r\nreturn _get;'"
	 * @generated
	 */
	int getSY();

	/**
	 * Returns the value of the '<em><b>EX</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EX</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EX</em>' attribute.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getDiagramLink_EX()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='&lt;%java.lang.String%&gt; _geometry = this.getGeometry();\r\nfinal &lt;%de.cooperateproject.eabridge.eaobjectmodel.util.Geometry%&gt; map = new &lt;%de.cooperateproject.eabridge.eaobjectmodel.util.Geometry%&gt;(_geometry);\r\n&lt;%java.lang.Integer%&gt; _get = map.hashInt.get(\"EX\");\r\nreturn _get;'"
	 * @generated
	 */
	int getEX();

	/**
	 * Returns the value of the '<em><b>EY</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EY</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EY</em>' attribute.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getDiagramLink_EY()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='&lt;%java.lang.String%&gt; _geometry = this.getGeometry();\r\nfinal &lt;%de.cooperateproject.eabridge.eaobjectmodel.util.Geometry%&gt; map = new &lt;%de.cooperateproject.eabridge.eaobjectmodel.util.Geometry%&gt;(_geometry);\r\n&lt;%java.lang.Integer%&gt; _get = map.hashInt.get(\"EY\");\r\nreturn _get;'"
	 * @generated
	 */
	int getEY();

	/**
	 * Returns the value of the '<em><b>LLBCX</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>LLBCX</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>LLBCX</em>' attribute.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getDiagramLink_LLBCX()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='&lt;%java.lang.String%&gt; _geometry = this.getGeometry();\r\nfinal &lt;%de.cooperateproject.eabridge.eaobjectmodel.util.Geometry%&gt; map = new &lt;%de.cooperateproject.eabridge.eaobjectmodel.util.Geometry%&gt;(_geometry);\r\n&lt;%java.lang.Integer%&gt; _get = map.hashNode.get(\"$LLB\").get(\"CX\");\r\nreturn _get;'"
	 * @generated
	 */
	int getLLBCX();

	/**
	 * Returns the value of the '<em><b>LLBCY</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>LLBCY</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>LLBCY</em>' attribute.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getDiagramLink_LLBCY()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='&lt;%java.lang.String%&gt; _geometry = this.getGeometry();\r\nfinal &lt;%de.cooperateproject.eabridge.eaobjectmodel.util.Geometry%&gt; map = new &lt;%de.cooperateproject.eabridge.eaobjectmodel.util.Geometry%&gt;(_geometry);\r\n&lt;%java.lang.Integer%&gt; _get = map.hashNode.get(\"$LLB\").get(\"CY\");\r\nreturn _get;'"
	 * @generated
	 */
	int getLLBCY();

	/**
	 * Returns the value of the '<em><b>LLBOX</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>LLBOX</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>LLBOX</em>' attribute.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getDiagramLink_LLBOX()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='&lt;%java.lang.String%&gt; _geometry = this.getGeometry();\r\nfinal &lt;%de.cooperateproject.eabridge.eaobjectmodel.util.Geometry%&gt; map = new &lt;%de.cooperateproject.eabridge.eaobjectmodel.util.Geometry%&gt;(_geometry);\r\n&lt;%java.lang.Integer%&gt; _get = map.hashNode.get(\"$LLB\").get(\"OX\");\r\nreturn _get;'"
	 * @generated
	 */
	int getLLBOX();

	/**
	 * Returns the value of the '<em><b>LLBOY</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>LLBOY</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>LLBOY</em>' attribute.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getDiagramLink_LLBOY()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='&lt;%java.lang.String%&gt; _geometry = this.getGeometry();\r\nfinal &lt;%de.cooperateproject.eabridge.eaobjectmodel.util.Geometry%&gt; map = new &lt;%de.cooperateproject.eabridge.eaobjectmodel.util.Geometry%&gt;(_geometry);\r\n&lt;%java.lang.Integer%&gt; _get = map.hashNode.get(\"$LLB\").get(\"OY\");\r\nreturn _get;'"
	 * @generated
	 */
	int getLLBOY();

	/**
	 * Returns the value of the '<em><b>LLTCX</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>LLTCX</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>LLTCX</em>' attribute.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getDiagramLink_LLTCX()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='&lt;%java.lang.String%&gt; _geometry = this.getGeometry();\r\nfinal &lt;%de.cooperateproject.eabridge.eaobjectmodel.util.Geometry%&gt; map = new &lt;%de.cooperateproject.eabridge.eaobjectmodel.util.Geometry%&gt;(_geometry);\r\n&lt;%java.lang.Integer%&gt; _get = map.hashNode.get(\"LLT\").get(\"CX\");\r\nreturn _get;'"
	 * @generated
	 */
	int getLLTCX();

	/**
	 * Returns the value of the '<em><b>LLTCY</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>LLTCY</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>LLTCY</em>' attribute.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getDiagramLink_LLTCY()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='&lt;%java.lang.String%&gt; _geometry = this.getGeometry();\r\nfinal &lt;%de.cooperateproject.eabridge.eaobjectmodel.util.Geometry%&gt; map = new &lt;%de.cooperateproject.eabridge.eaobjectmodel.util.Geometry%&gt;(_geometry);\r\n&lt;%java.lang.Integer%&gt; _get = map.hashNode.get(\"LLT\").get(\"CY\");\r\nreturn _get;'"
	 * @generated
	 */
	int getLLTCY();

	/**
	 * Returns the value of the '<em><b>LLTOX</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>LLTOX</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>LLTOX</em>' attribute.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getDiagramLink_LLTOX()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='&lt;%java.lang.String%&gt; _geometry = this.getGeometry();\r\nfinal &lt;%de.cooperateproject.eabridge.eaobjectmodel.util.Geometry%&gt; map = new &lt;%de.cooperateproject.eabridge.eaobjectmodel.util.Geometry%&gt;(_geometry);\r\n&lt;%java.lang.Integer%&gt; _get = map.hashNode.get(\"LLT\").get(\"OX\");\r\nreturn _get;'"
	 * @generated
	 */
	int getLLTOX();

	/**
	 * Returns the value of the '<em><b>LLTOY</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>LLTOY</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>LLTOY</em>' attribute.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getDiagramLink_LLTOY()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='&lt;%java.lang.String%&gt; _geometry = this.getGeometry();\r\nfinal &lt;%de.cooperateproject.eabridge.eaobjectmodel.util.Geometry%&gt; map = new &lt;%de.cooperateproject.eabridge.eaobjectmodel.util.Geometry%&gt;(_geometry);\r\n&lt;%java.lang.Integer%&gt; _get = map.hashNode.get(\"LLT\").get(\"OY\");\r\nreturn _get;'"
	 * @generated
	 */
	int getLLTOY();

	/**
	 * Returns the value of the '<em><b>LRBCX</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>LRBCX</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>LRBCX</em>' attribute.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getDiagramLink_LRBCX()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='&lt;%java.lang.String%&gt; _geometry = this.getGeometry();\r\nfinal &lt;%de.cooperateproject.eabridge.eaobjectmodel.util.Geometry%&gt; map = new &lt;%de.cooperateproject.eabridge.eaobjectmodel.util.Geometry%&gt;(_geometry);\r\n&lt;%java.lang.Integer%&gt; _get = map.hashNode.get(\"LRB\").get(\"CX\");\r\nreturn _get;'"
	 * @generated
	 */
	int getLRBCX();

	/**
	 * Returns the value of the '<em><b>LRBCY</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>LRBCY</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>LRBCY</em>' attribute.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getDiagramLink_LRBCY()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='&lt;%java.lang.String%&gt; _geometry = this.getGeometry();\r\nfinal &lt;%de.cooperateproject.eabridge.eaobjectmodel.util.Geometry%&gt; map = new &lt;%de.cooperateproject.eabridge.eaobjectmodel.util.Geometry%&gt;(_geometry);\r\n&lt;%java.lang.Integer%&gt; _get = map.hashNode.get(\"LRB\").get(\"CY\");\r\nreturn _get;'"
	 * @generated
	 */
	int getLRBCY();

	/**
	 * Returns the value of the '<em><b>LRBOX</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>LRBOX</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>LRBOX</em>' attribute.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getDiagramLink_LRBOX()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='&lt;%java.lang.String%&gt; _geometry = this.getGeometry();\r\nfinal &lt;%de.cooperateproject.eabridge.eaobjectmodel.util.Geometry%&gt; map = new &lt;%de.cooperateproject.eabridge.eaobjectmodel.util.Geometry%&gt;(_geometry);\r\n&lt;%java.lang.Integer%&gt; _get = map.hashNode.get(\"LRB\").get(\"OX\");\r\nreturn _get;'"
	 * @generated
	 */
	int getLRBOX();

	/**
	 * Returns the value of the '<em><b>LRBOY</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>LRBOY</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>LRBOY</em>' attribute.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getDiagramLink_LRBOY()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='&lt;%java.lang.String%&gt; _geometry = this.getGeometry();\r\nfinal &lt;%de.cooperateproject.eabridge.eaobjectmodel.util.Geometry%&gt; map = new &lt;%de.cooperateproject.eabridge.eaobjectmodel.util.Geometry%&gt;(_geometry);\r\n&lt;%java.lang.Integer%&gt; _get = map.hashNode.get(\"LRB\").get(\"OY\");\r\nreturn _get;'"
	 * @generated
	 */
	int getLRBOY();

	/**
	 * Returns the value of the '<em><b>LRTCX</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>LRTCX</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>LRTCX</em>' attribute.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getDiagramLink_LRTCX()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='&lt;%java.lang.String%&gt; _geometry = this.getGeometry();\r\nfinal &lt;%de.cooperateproject.eabridge.eaobjectmodel.util.Geometry%&gt; map = new &lt;%de.cooperateproject.eabridge.eaobjectmodel.util.Geometry%&gt;(_geometry);\r\n&lt;%java.lang.Integer%&gt; _get = map.hashNode.get(\"LRT\").get(\"CX\");\r\nreturn _get;'"
	 * @generated
	 */
	int getLRTCX();

	/**
	 * Returns the value of the '<em><b>LRTCY</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>LRTCY</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>LRTCY</em>' attribute.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getDiagramLink_LRTCY()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='&lt;%java.lang.String%&gt; _geometry = this.getGeometry();\r\nfinal &lt;%de.cooperateproject.eabridge.eaobjectmodel.util.Geometry%&gt; map = new &lt;%de.cooperateproject.eabridge.eaobjectmodel.util.Geometry%&gt;(_geometry);\r\n&lt;%java.lang.Integer%&gt; _get = map.hashNode.get(\"LRT\").get(\"CY\");\r\nreturn _get;'"
	 * @generated
	 */
	int getLRTCY();

	/**
	 * Returns the value of the '<em><b>LRTOX</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>LRTOX</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>LRTOX</em>' attribute.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getDiagramLink_LRTOX()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='&lt;%java.lang.String%&gt; _geometry = this.getGeometry();\r\nfinal &lt;%de.cooperateproject.eabridge.eaobjectmodel.util.Geometry%&gt; map = new &lt;%de.cooperateproject.eabridge.eaobjectmodel.util.Geometry%&gt;(_geometry);\r\n&lt;%java.lang.Integer%&gt; _get = map.hashNode.get(\"LRT\").get(\"OX\");\r\nreturn _get;'"
	 * @generated
	 */
	int getLRTOX();

	/**
	 * Returns the value of the '<em><b>LRTOY</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>LRTOY</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>LRTOY</em>' attribute.
	 * @see de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage#getDiagramLink_LRTOY()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='&lt;%java.lang.String%&gt; _geometry = this.getGeometry();\r\nfinal &lt;%de.cooperateproject.eabridge.eaobjectmodel.util.Geometry%&gt; map = new &lt;%de.cooperateproject.eabridge.eaobjectmodel.util.Geometry%&gt;(_geometry);\r\n&lt;%java.lang.Integer%&gt; _get = map.hashNode.get(\"LRT\").get(\"OY\");\r\nreturn _get;'"
	 * @generated
	 */
	int getLRTOY();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='&lt;%java.lang.String%&gt; _geometry = this.getGeometry();\r\nfinal Geometry map = new Geometry(_geometry);\r\nmap.hashInt.put(\"SX\", newSX);\r\nthis.setGeometry(map.toString());'"
	 * @generated
	 */
	void setSX(Integer newSX);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='&lt;%java.lang.String%&gt; _geometry = this.getGeometry();\r\nfinal Geometry map = new Geometry(_geometry);\r\nmap.hashInt.put(\"SY\", newSY);\r\nthis.setGeometry(map.toString());'"
	 * @generated
	 */
	void setSY(Integer newSY);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='&lt;%java.lang.String%&gt; _geometry = this.getGeometry();\r\nfinal Geometry map = new Geometry(_geometry);\r\nmap.hashInt.put(\"EX\", newEX);\r\nthis.setGeometry(map.toString());'"
	 * @generated
	 */
	void setEX(Integer newEX);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='&lt;%java.lang.String%&gt; _geometry = this.getGeometry();\r\nfinal Geometry map = new Geometry(_geometry);\r\nmap.hashInt.put(\"EY\", newEY);\r\nthis.setGeometry(map.toString());'"
	 * @generated
	 */
	void setEY(Integer newEY);

} // DiagramLink
