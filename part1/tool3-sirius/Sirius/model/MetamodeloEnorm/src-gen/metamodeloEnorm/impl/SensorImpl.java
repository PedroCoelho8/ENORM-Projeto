/**
 */
package metamodeloEnorm.impl;

import java.util.Collection;

import metamodeloEnorm.Attribute;
import metamodeloEnorm.Conditions;
import metamodeloEnorm.DataMapping;
import metamodeloEnorm.MetamodeloEnormPackage;
import metamodeloEnorm.Sensor;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sensor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link metamodeloEnorm.impl.SensorImpl#getName <em>Name</em>}</li>
 *   <li>{@link metamodeloEnorm.impl.SensorImpl#getMapsThroughDataMapping <em>Maps Through Data Mapping</em>}</li>
 *   <li>{@link metamodeloEnorm.impl.SensorImpl#getHasAttribute <em>Has Attribute</em>}</li>
 *   <li>{@link metamodeloEnorm.impl.SensorImpl#getFollowsConditions <em>Follows Conditions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SensorImpl extends MinimalEObjectImpl.Container implements Sensor {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMapsThroughDataMapping() <em>Maps Through Data Mapping</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMapsThroughDataMapping()
	 * @generated
	 * @ordered
	 */
	protected DataMapping mapsThroughDataMapping;

	/**
	 * The cached value of the '{@link #getHasAttribute() <em>Has Attribute</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasAttribute()
	 * @generated
	 * @ordered
	 */
	protected EList<Attribute> hasAttribute;

	/**
	 * The cached value of the '{@link #getFollowsConditions() <em>Follows Conditions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFollowsConditions()
	 * @generated
	 * @ordered
	 */
	protected EList<Conditions> followsConditions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SensorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetamodeloEnormPackage.Literals.SENSOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodeloEnormPackage.SENSOR__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataMapping getMapsThroughDataMapping() {
		return mapsThroughDataMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMapsThroughDataMapping(DataMapping newMapsThroughDataMapping,
			NotificationChain msgs) {
		DataMapping oldMapsThroughDataMapping = mapsThroughDataMapping;
		mapsThroughDataMapping = newMapsThroughDataMapping;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					MetamodeloEnormPackage.SENSOR__MAPS_THROUGH_DATA_MAPPING, oldMapsThroughDataMapping,
					newMapsThroughDataMapping);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMapsThroughDataMapping(DataMapping newMapsThroughDataMapping) {
		if (newMapsThroughDataMapping != mapsThroughDataMapping) {
			NotificationChain msgs = null;
			if (mapsThroughDataMapping != null)
				msgs = ((InternalEObject) mapsThroughDataMapping).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - MetamodeloEnormPackage.SENSOR__MAPS_THROUGH_DATA_MAPPING, null, msgs);
			if (newMapsThroughDataMapping != null)
				msgs = ((InternalEObject) newMapsThroughDataMapping).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - MetamodeloEnormPackage.SENSOR__MAPS_THROUGH_DATA_MAPPING, null, msgs);
			msgs = basicSetMapsThroughDataMapping(newMapsThroughDataMapping, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					MetamodeloEnormPackage.SENSOR__MAPS_THROUGH_DATA_MAPPING, newMapsThroughDataMapping,
					newMapsThroughDataMapping));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Attribute> getHasAttribute() {
		if (hasAttribute == null) {
			hasAttribute = new EObjectContainmentEList<Attribute>(Attribute.class, this,
					MetamodeloEnormPackage.SENSOR__HAS_ATTRIBUTE);
		}
		return hasAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Conditions> getFollowsConditions() {
		if (followsConditions == null) {
			followsConditions = new EObjectContainmentEList<Conditions>(Conditions.class, this,
					MetamodeloEnormPackage.SENSOR__FOLLOWS_CONDITIONS);
		}
		return followsConditions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MetamodeloEnormPackage.SENSOR__MAPS_THROUGH_DATA_MAPPING:
			return basicSetMapsThroughDataMapping(null, msgs);
		case MetamodeloEnormPackage.SENSOR__HAS_ATTRIBUTE:
			return ((InternalEList<?>) getHasAttribute()).basicRemove(otherEnd, msgs);
		case MetamodeloEnormPackage.SENSOR__FOLLOWS_CONDITIONS:
			return ((InternalEList<?>) getFollowsConditions()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MetamodeloEnormPackage.SENSOR__NAME:
			return getName();
		case MetamodeloEnormPackage.SENSOR__MAPS_THROUGH_DATA_MAPPING:
			return getMapsThroughDataMapping();
		case MetamodeloEnormPackage.SENSOR__HAS_ATTRIBUTE:
			return getHasAttribute();
		case MetamodeloEnormPackage.SENSOR__FOLLOWS_CONDITIONS:
			return getFollowsConditions();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case MetamodeloEnormPackage.SENSOR__NAME:
			setName((String) newValue);
			return;
		case MetamodeloEnormPackage.SENSOR__MAPS_THROUGH_DATA_MAPPING:
			setMapsThroughDataMapping((DataMapping) newValue);
			return;
		case MetamodeloEnormPackage.SENSOR__HAS_ATTRIBUTE:
			getHasAttribute().clear();
			getHasAttribute().addAll((Collection<? extends Attribute>) newValue);
			return;
		case MetamodeloEnormPackage.SENSOR__FOLLOWS_CONDITIONS:
			getFollowsConditions().clear();
			getFollowsConditions().addAll((Collection<? extends Conditions>) newValue);
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
		case MetamodeloEnormPackage.SENSOR__NAME:
			setName(NAME_EDEFAULT);
			return;
		case MetamodeloEnormPackage.SENSOR__MAPS_THROUGH_DATA_MAPPING:
			setMapsThroughDataMapping((DataMapping) null);
			return;
		case MetamodeloEnormPackage.SENSOR__HAS_ATTRIBUTE:
			getHasAttribute().clear();
			return;
		case MetamodeloEnormPackage.SENSOR__FOLLOWS_CONDITIONS:
			getFollowsConditions().clear();
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
		case MetamodeloEnormPackage.SENSOR__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case MetamodeloEnormPackage.SENSOR__MAPS_THROUGH_DATA_MAPPING:
			return mapsThroughDataMapping != null;
		case MetamodeloEnormPackage.SENSOR__HAS_ATTRIBUTE:
			return hasAttribute != null && !hasAttribute.isEmpty();
		case MetamodeloEnormPackage.SENSOR__FOLLOWS_CONDITIONS:
			return followsConditions != null && !followsConditions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //SensorImpl
