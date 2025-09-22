/**
 */
package metamodeloEnorm.impl;

import java.util.Collection;

import metamodeloEnorm.Actuator;
import metamodeloEnorm.Attribute;
import metamodeloEnorm.Conditions;
import metamodeloEnorm.MetamodeloEnormPackage;
import metamodeloEnorm.NotificationProtocol;
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
 * An implementation of the model object '<em><b>Actuator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link metamodeloEnorm.impl.ActuatorImpl#getName <em>Name</em>}</li>
 *   <li>{@link metamodeloEnorm.impl.ActuatorImpl#getIsConnectedTo <em>Is Connected To</em>}</li>
 *   <li>{@link metamodeloEnorm.impl.ActuatorImpl#getFollowsConditions <em>Follows Conditions</em>}</li>
 *   <li>{@link metamodeloEnorm.impl.ActuatorImpl#getFollowsNotificationProtocol <em>Follows Notification Protocol</em>}</li>
 *   <li>{@link metamodeloEnorm.impl.ActuatorImpl#getHasAttributes <em>Has Attributes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActuatorImpl extends MinimalEObjectImpl.Container implements Actuator {
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
	 * The cached value of the '{@link #getIsConnectedTo() <em>Is Connected To</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsConnectedTo()
	 * @generated
	 * @ordered
	 */
	protected EList<Sensor> isConnectedTo;

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
	 * The cached value of the '{@link #getFollowsNotificationProtocol() <em>Follows Notification Protocol</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFollowsNotificationProtocol()
	 * @generated
	 * @ordered
	 */
	protected NotificationProtocol followsNotificationProtocol;

	/**
	 * The cached value of the '{@link #getHasAttributes() <em>Has Attributes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<Attribute> hasAttributes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActuatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetamodeloEnormPackage.Literals.ACTUATOR;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodeloEnormPackage.ACTUATOR__NAME, oldName,
					name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Sensor> getIsConnectedTo() {
		if (isConnectedTo == null) {
			isConnectedTo = new EObjectContainmentEList<Sensor>(Sensor.class, this,
					MetamodeloEnormPackage.ACTUATOR__IS_CONNECTED_TO);
		}
		return isConnectedTo;
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
					MetamodeloEnormPackage.ACTUATOR__FOLLOWS_CONDITIONS);
		}
		return followsConditions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationProtocol getFollowsNotificationProtocol() {
		return followsNotificationProtocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFollowsNotificationProtocol(NotificationProtocol newFollowsNotificationProtocol,
			NotificationChain msgs) {
		NotificationProtocol oldFollowsNotificationProtocol = followsNotificationProtocol;
		followsNotificationProtocol = newFollowsNotificationProtocol;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					MetamodeloEnormPackage.ACTUATOR__FOLLOWS_NOTIFICATION_PROTOCOL, oldFollowsNotificationProtocol,
					newFollowsNotificationProtocol);
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
	public void setFollowsNotificationProtocol(NotificationProtocol newFollowsNotificationProtocol) {
		if (newFollowsNotificationProtocol != followsNotificationProtocol) {
			NotificationChain msgs = null;
			if (followsNotificationProtocol != null)
				msgs = ((InternalEObject) followsNotificationProtocol).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - MetamodeloEnormPackage.ACTUATOR__FOLLOWS_NOTIFICATION_PROTOCOL, null,
						msgs);
			if (newFollowsNotificationProtocol != null)
				msgs = ((InternalEObject) newFollowsNotificationProtocol).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - MetamodeloEnormPackage.ACTUATOR__FOLLOWS_NOTIFICATION_PROTOCOL, null,
						msgs);
			msgs = basicSetFollowsNotificationProtocol(newFollowsNotificationProtocol, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					MetamodeloEnormPackage.ACTUATOR__FOLLOWS_NOTIFICATION_PROTOCOL, newFollowsNotificationProtocol,
					newFollowsNotificationProtocol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Attribute> getHasAttributes() {
		if (hasAttributes == null) {
			hasAttributes = new EObjectContainmentEList<Attribute>(Attribute.class, this,
					MetamodeloEnormPackage.ACTUATOR__HAS_ATTRIBUTES);
		}
		return hasAttributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MetamodeloEnormPackage.ACTUATOR__IS_CONNECTED_TO:
			return ((InternalEList<?>) getIsConnectedTo()).basicRemove(otherEnd, msgs);
		case MetamodeloEnormPackage.ACTUATOR__FOLLOWS_CONDITIONS:
			return ((InternalEList<?>) getFollowsConditions()).basicRemove(otherEnd, msgs);
		case MetamodeloEnormPackage.ACTUATOR__FOLLOWS_NOTIFICATION_PROTOCOL:
			return basicSetFollowsNotificationProtocol(null, msgs);
		case MetamodeloEnormPackage.ACTUATOR__HAS_ATTRIBUTES:
			return ((InternalEList<?>) getHasAttributes()).basicRemove(otherEnd, msgs);
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
		case MetamodeloEnormPackage.ACTUATOR__NAME:
			return getName();
		case MetamodeloEnormPackage.ACTUATOR__IS_CONNECTED_TO:
			return getIsConnectedTo();
		case MetamodeloEnormPackage.ACTUATOR__FOLLOWS_CONDITIONS:
			return getFollowsConditions();
		case MetamodeloEnormPackage.ACTUATOR__FOLLOWS_NOTIFICATION_PROTOCOL:
			return getFollowsNotificationProtocol();
		case MetamodeloEnormPackage.ACTUATOR__HAS_ATTRIBUTES:
			return getHasAttributes();
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
		case MetamodeloEnormPackage.ACTUATOR__NAME:
			setName((String) newValue);
			return;
		case MetamodeloEnormPackage.ACTUATOR__IS_CONNECTED_TO:
			getIsConnectedTo().clear();
			getIsConnectedTo().addAll((Collection<? extends Sensor>) newValue);
			return;
		case MetamodeloEnormPackage.ACTUATOR__FOLLOWS_CONDITIONS:
			getFollowsConditions().clear();
			getFollowsConditions().addAll((Collection<? extends Conditions>) newValue);
			return;
		case MetamodeloEnormPackage.ACTUATOR__FOLLOWS_NOTIFICATION_PROTOCOL:
			setFollowsNotificationProtocol((NotificationProtocol) newValue);
			return;
		case MetamodeloEnormPackage.ACTUATOR__HAS_ATTRIBUTES:
			getHasAttributes().clear();
			getHasAttributes().addAll((Collection<? extends Attribute>) newValue);
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
		case MetamodeloEnormPackage.ACTUATOR__NAME:
			setName(NAME_EDEFAULT);
			return;
		case MetamodeloEnormPackage.ACTUATOR__IS_CONNECTED_TO:
			getIsConnectedTo().clear();
			return;
		case MetamodeloEnormPackage.ACTUATOR__FOLLOWS_CONDITIONS:
			getFollowsConditions().clear();
			return;
		case MetamodeloEnormPackage.ACTUATOR__FOLLOWS_NOTIFICATION_PROTOCOL:
			setFollowsNotificationProtocol((NotificationProtocol) null);
			return;
		case MetamodeloEnormPackage.ACTUATOR__HAS_ATTRIBUTES:
			getHasAttributes().clear();
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
		case MetamodeloEnormPackage.ACTUATOR__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case MetamodeloEnormPackage.ACTUATOR__IS_CONNECTED_TO:
			return isConnectedTo != null && !isConnectedTo.isEmpty();
		case MetamodeloEnormPackage.ACTUATOR__FOLLOWS_CONDITIONS:
			return followsConditions != null && !followsConditions.isEmpty();
		case MetamodeloEnormPackage.ACTUATOR__FOLLOWS_NOTIFICATION_PROTOCOL:
			return followsNotificationProtocol != null;
		case MetamodeloEnormPackage.ACTUATOR__HAS_ATTRIBUTES:
			return hasAttributes != null && !hasAttributes.isEmpty();
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

} //ActuatorImpl
