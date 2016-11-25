/**
 */
package de.cooperateproject.eabridge.eaobjectmodel.impl;

import com.google.common.base.Objects;
import com.google.common.base.Strings;

import de.cooperateproject.eabridge.eaobjectmodel.EaobjectmodelPackage;
import de.cooperateproject.eabridge.eaobjectmodel.Element;
import de.cooperateproject.eabridge.eaobjectmodel.PrimitiveType;
import de.cooperateproject.eabridge.eaobjectmodel.TypeReference;

import de.cooperateproject.eabridge.eaobjectmodel.util.TypeReferenceClassifierNameRefresher;

import java.lang.Iterable;

import java.lang.reflect.InvocationTargetException;

import java.util.Map;

import java.util.function.Predicate;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import org.eclipse.xtext.xbase.lib.Functions.Function1;

import org.eclipse.xtext.xbase.lib.IterableExtensions;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.TypeReferenceImpl#getClassifier <em>Classifier</em>}</li>
 *   <li>{@link de.cooperateproject.eabridge.eaobjectmodel.impl.TypeReferenceImpl#getTypeName <em>Type Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TypeReferenceImpl extends MinimalEObjectImpl.Container implements TypeReference {
	/**
	 * The cached value of the '{@link #getClassifier() <em>Classifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassifier()
	 * @generated
	 * @ordered
	 */
	protected Element classifier;

	/**
	 * The default value of the '{@link #getTypeName() <em>Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeName()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTypeName() <em>Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeName()
	 * @generated
	 * @ordered
	 */
	protected String typeName = TYPE_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EaobjectmodelPackage.Literals.TYPE_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element getClassifier() {
		if (classifier != null && classifier.eIsProxy()) {
			InternalEObject oldClassifier = (InternalEObject)classifier;
			classifier = (Element)eResolveProxy(oldClassifier);
			if (classifier != oldClassifier) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EaobjectmodelPackage.TYPE_REFERENCE__CLASSIFIER, oldClassifier, classifier));
			}
		}
		return classifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element basicGetClassifier() {
		return classifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassifier(Element newClassifier) {
		Element oldClassifier = classifier;
		classifier = newClassifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaobjectmodelPackage.TYPE_REFERENCE__CLASSIFIER, oldClassifier, classifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTypeName() {
		return typeName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeName(String newTypeName) {
		String oldTypeName = typeName;
		typeName = newTypeName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaobjectmodelPackage.TYPE_REFERENCE__TYPE_NAME, oldTypeName, typeName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(final Element classifier) {
		EClass _eClass = this.eClass();
		EList<EStructuralFeature> _eAllStructuralFeatures = _eClass.getEAllStructuralFeatures();
		final Function1<EStructuralFeature, Boolean> _function = new Function1<EStructuralFeature, Boolean>() {
			public Boolean apply(final EStructuralFeature it) {
				String _name = it.getName();
				return Boolean.valueOf(Objects.equal(_name, "classifier"));
			}
		};
		final EStructuralFeature classifierFeature = IterableExtensions.<EStructuralFeature>findFirst(_eAllStructuralFeatures, _function);
		EClass _eClass_1 = this.eClass();
		EList<EStructuralFeature> _eAllStructuralFeatures_1 = _eClass_1.getEAllStructuralFeatures();
		final Function1<EStructuralFeature, Boolean> _function_1 = new Function1<EStructuralFeature, Boolean>() {
			public Boolean apply(final EStructuralFeature it) {
				String _name = it.getName();
				return Boolean.valueOf(Objects.equal(_name, "typeName"));
			}
		};
		final EStructuralFeature typeNameFeature = IterableExtensions.<EStructuralFeature>findFirst(_eAllStructuralFeatures_1, _function_1);
		Object _eGet = this.eGet(classifierFeature);
		final Element oldClassifier = ((Element) _eGet);
		if (((!Objects.equal(oldClassifier, null)) && (!Objects.equal(EcoreUtil.getID(oldClassifier), EcoreUtil.getID(classifier))))) {
			EList<Adapter> _eAdapters = oldClassifier.eAdapters();
			final Predicate<Adapter> _function_2 = new Predicate<Adapter>() {
				public boolean test(final Adapter a) {
					return (a instanceof TypeReferenceClassifierNameRefresher);
				}
			};
			_eAdapters.removeIf(_function_2);
		}
		boolean _notEquals = (!Objects.equal(classifier, null));
		if (_notEquals) {
			EList<Adapter> _eAdapters_1 = classifier.eAdapters();
			boolean _isEmpty = _eAdapters_1.isEmpty();
			if (_isEmpty) {
				final TypeReferenceClassifierNameRefresher refreshAdapter = new TypeReferenceClassifierNameRefresher(this);
				EList<Adapter> _eAdapters_2 = classifier.eAdapters();
				_eAdapters_2.add(refreshAdapter);
			}
			String _name = classifier.getName();
			this.eSet(typeNameFeature, _name);
		}
		else {
			this.eSet(typeNameFeature, null);
		}
		this.eSet(classifierFeature, classifier);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(final PrimitiveType primitiveType) {
		EClass _eClass = this.eClass();
		EList<EStructuralFeature> _eAllStructuralFeatures = _eClass.getEAllStructuralFeatures();
		final Function1<EStructuralFeature, Boolean> _function = new Function1<EStructuralFeature, Boolean>() {
			public Boolean apply(final EStructuralFeature it) {
				String _name = it.getName();
				return Boolean.valueOf(Objects.equal(_name, "classifier"));
			}
		};
		final EStructuralFeature classifierFeature = IterableExtensions.<EStructuralFeature>findFirst(_eAllStructuralFeatures, _function);
		EClass _eClass_1 = this.eClass();
		EList<EStructuralFeature> _eAllStructuralFeatures_1 = _eClass_1.getEAllStructuralFeatures();
		final Function1<EStructuralFeature, Boolean> _function_1 = new Function1<EStructuralFeature, Boolean>() {
			public Boolean apply(final EStructuralFeature it) {
				String _name = it.getName();
				return Boolean.valueOf(Objects.equal(_name, "typeName"));
			}
		};
		final EStructuralFeature typeNameFeature = IterableExtensions.<EStructuralFeature>findFirst(_eAllStructuralFeatures_1, _function_1);
		Object _eGet = this.eGet(classifierFeature);
		final Element oldClassifier = ((Element) _eGet);
		boolean _notEquals = (!Objects.equal(oldClassifier, null));
		if (_notEquals) {
			EList<Adapter> _eAdapters = oldClassifier.eAdapters();
			final Predicate<Adapter> _function_2 = new Predicate<Adapter>() {
				public boolean test(final Adapter a) {
					return (a instanceof TypeReferenceClassifierNameRefresher);
				}
			};
			_eAdapters.removeIf(_function_2);
		}
		boolean _notEquals_1 = (!Objects.equal(primitiveType, null));
		if (_notEquals_1) {
			String _name = primitiveType.getName();
			this.eSet(typeNameFeature, _name);
		}
		else {
			this.eSet(typeNameFeature, null);
		}
		this.eSet(classifierFeature, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(final String notExistentType) {
		EClass _eClass = this.eClass();
		EList<EStructuralFeature> _eAllStructuralFeatures = _eClass.getEAllStructuralFeatures();
		final Function1<EStructuralFeature, Boolean> _function = new Function1<EStructuralFeature, Boolean>() {
			public Boolean apply(final EStructuralFeature it) {
				String _name = it.getName();
				return Boolean.valueOf(Objects.equal(_name, "classifier"));
			}
		};
		final EStructuralFeature classifierFeature = IterableExtensions.<EStructuralFeature>findFirst(_eAllStructuralFeatures, _function);
		EClass _eClass_1 = this.eClass();
		EList<EStructuralFeature> _eAllStructuralFeatures_1 = _eClass_1.getEAllStructuralFeatures();
		final Function1<EStructuralFeature, Boolean> _function_1 = new Function1<EStructuralFeature, Boolean>() {
			public Boolean apply(final EStructuralFeature it) {
				String _name = it.getName();
				return Boolean.valueOf(Objects.equal(_name, "typeName"));
			}
		};
		final EStructuralFeature typeNameFeature = IterableExtensions.<EStructuralFeature>findFirst(_eAllStructuralFeatures_1, _function_1);
		Object _eGet = this.eGet(classifierFeature);
		final Element oldClassifier = ((Element) _eGet);
		boolean _notEquals = (!Objects.equal(oldClassifier, null));
		if (_notEquals) {
			EList<Adapter> _eAdapters = oldClassifier.eAdapters();
			final Predicate<Adapter> _function_2 = new Predicate<Adapter>() {
				public boolean test(final Adapter a) {
					return (a instanceof TypeReferenceClassifierNameRefresher);
				}
			};
			_eAdapters.removeIf(_function_2);
		}
		this.eSet(typeNameFeature, notExistentType);
		this.eSet(classifierFeature, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveType getPrimitiveType() {
		EClass _eClass = this.eClass();
		EList<EStructuralFeature> _eAllStructuralFeatures = _eClass.getEAllStructuralFeatures();
		final Function1<EStructuralFeature, Boolean> _function = new Function1<EStructuralFeature, Boolean>() {
			public Boolean apply(final EStructuralFeature it) {
				String _name = it.getName();
				return Boolean.valueOf(Objects.equal(_name, "typeName"));
			}
		};
		EStructuralFeature _findFirst = IterableExtensions.<EStructuralFeature>findFirst(_eAllStructuralFeatures, _function);
		final Object typeName = this.eGet(_findFirst);
		boolean _equals = Objects.equal(typeName, null);
		if (_equals) {
			return null;
		}
		PrimitiveType[] _enumConstants = PrimitiveType.class.getEnumConstants();
		final Function1<PrimitiveType, Boolean> _function_1 = new Function1<PrimitiveType, Boolean>() {
			public Boolean apply(final PrimitiveType c) {
				String _name = c.getName();
				return Boolean.valueOf(((String) typeName).equals(_name));
			}
		};
		return IterableExtensions.<PrimitiveType>findFirst(((Iterable<PrimitiveType>)org.eclipse.xtext.xbase.lib.Conversions.doWrapArray(_enumConstants)), _function_1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		EClass _eClass = this.eClass();
		EList<EStructuralFeature> _eAllStructuralFeatures = _eClass.getEAllStructuralFeatures();
		final Function1<EStructuralFeature, Boolean> _function = new Function1<EStructuralFeature, Boolean>() {
			public Boolean apply(final EStructuralFeature it) {
				String _name = it.getName();
				return Boolean.valueOf(Objects.equal(_name, "typeName"));
			}
		};
		EStructuralFeature _findFirst = IterableExtensions.<EStructuralFeature>findFirst(_eAllStructuralFeatures, _function);
		Object _eGet = this.eGet(_findFirst);
		final String typeName = ((String) _eGet);
		return typeName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean hasmatchesClassifierName(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		EClass _eClass = this.eClass();
		EList<EStructuralFeature> _eAllStructuralFeatures = _eClass.getEAllStructuralFeatures();
		final Function1<EStructuralFeature, Boolean> _function = new Function1<EStructuralFeature, Boolean>() {
			public Boolean apply(final EStructuralFeature it) {
				String _name = it.getName();
				return Boolean.valueOf(Objects.equal(_name, "classifier"));
			}
		};
		EStructuralFeature _findFirst = IterableExtensions.<EStructuralFeature>findFirst(_eAllStructuralFeatures, _function);
		Object _eGet = this.eGet(_findFirst);
		final Element classifierTmp = ((Element) _eGet);
		EClass _eClass_1 = this.eClass();
		EList<EStructuralFeature> _eAllStructuralFeatures_1 = _eClass_1.getEAllStructuralFeatures();
		final Function1<EStructuralFeature, Boolean> _function_1 = new Function1<EStructuralFeature, Boolean>() {
			public Boolean apply(final EStructuralFeature it) {
				String _name = it.getName();
				return Boolean.valueOf(Objects.equal(_name, "typeName"));
			}
		};
		EStructuralFeature _findFirst_1 = IterableExtensions.<EStructuralFeature>findFirst(_eAllStructuralFeatures_1, _function_1);
		Object _eGet_1 = this.eGet(_findFirst_1);
		final String typeName = ((String) _eGet_1);
		if (((Objects.equal(classifierTmp, null) || Strings.isNullOrEmpty(classifierTmp.getName())) || classifierTmp.getName().equals(typeName))) {
			return true;
		}
		else {
			return false;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EaobjectmodelPackage.TYPE_REFERENCE__CLASSIFIER:
				if (resolve) return getClassifier();
				return basicGetClassifier();
			case EaobjectmodelPackage.TYPE_REFERENCE__TYPE_NAME:
				return getTypeName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EaobjectmodelPackage.TYPE_REFERENCE__CLASSIFIER:
				setClassifier((Element)newValue);
				return;
			case EaobjectmodelPackage.TYPE_REFERENCE__TYPE_NAME:
				setTypeName((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case EaobjectmodelPackage.TYPE_REFERENCE__CLASSIFIER:
				setClassifier((Element)null);
				return;
			case EaobjectmodelPackage.TYPE_REFERENCE__TYPE_NAME:
				setTypeName(TYPE_NAME_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case EaobjectmodelPackage.TYPE_REFERENCE__CLASSIFIER:
				return classifier != null;
			case EaobjectmodelPackage.TYPE_REFERENCE__TYPE_NAME:
				return TYPE_NAME_EDEFAULT == null ? typeName != null : !TYPE_NAME_EDEFAULT.equals(typeName);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case EaobjectmodelPackage.TYPE_REFERENCE___SET_TYPE__ELEMENT:
				setType((Element)arguments.get(0));
				return null;
			case EaobjectmodelPackage.TYPE_REFERENCE___SET_TYPE__PRIMITIVETYPE:
				setType((PrimitiveType)arguments.get(0));
				return null;
			case EaobjectmodelPackage.TYPE_REFERENCE___SET_TYPE__STRING:
				setType((String)arguments.get(0));
				return null;
			case EaobjectmodelPackage.TYPE_REFERENCE___GET_PRIMITIVE_TYPE:
				return getPrimitiveType();
			case EaobjectmodelPackage.TYPE_REFERENCE___GET_TYPE:
				return getType();
			case EaobjectmodelPackage.TYPE_REFERENCE___HASMATCHES_CLASSIFIER_NAME__DIAGNOSTICCHAIN_MAP:
				return hasmatchesClassifierName((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (typeName: ");
		result.append(typeName);
		result.append(')');
		return result.toString();
	}

} //TypeReferenceImpl
