/**
 */
package metamodeloEnorm.impl;

import java.util.Collection;

import metamodeloEnorm.Attribute;
import metamodeloEnorm.Conditions;
import metamodeloEnorm.MetamodeloEnormPackage;
import metamodeloEnorm.Notification;
import metamodeloEnorm.NotificationProtocol;

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
 * An implementation of the model object '<em><b>Notification Protocol</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link metamodeloEnorm.impl.NotificationProtocolImpl#getName <em>Name</em>}</li>
 *   <li>{@link metamodeloEnorm.impl.NotificationProtocolImpl#getHasNotification <em>Has Notification</em>}</li>
 *   <li>{@link metamodeloEnorm.impl.NotificationProtocolImpl#getHasAttribute <em>Has Attribute</em>}</li>
 *   <li>{@link metamodeloEnorm.impl.NotificationProtocolImpl#getFollowsConditions <em>Follows Conditions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NotificationProtocolImpl extends MinimalEObjectImpl.Container implements NotificationProtocol {
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
	 * The cached value of the '{@link #getHasNotification() <em>Has Notification</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasNotification()
	 * @generated
	 * @ordered
	 */
	protected EList<Notification> hasNotification;

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
	protected NotificationProtocolImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetamodeloEnormPackage.Literals.NOTIFICATION_PROTOCOL;
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
			eNotify(new ENotificationImpl(this, org.eclipse.emf.common.notify.Notification.SET,
					MetamodeloEnormPackage.NOTIFICATION_PROTOCOL__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Notification> getHasNotification() {
		if (hasNotification == null) {
			hasNotification = new EObjectContainmentEList<Notification>(Notification.class, this,
					MetamodeloEnormPackage.NOTIFICATION_PROTOCOL__HAS_NOTIFICATION);
		}
		return hasNotification;
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
					MetamodeloEnormPackage.NOTIFICATION_PROTOCOL__HAS_ATTRIBUTE);
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
					MetamodeloEnormPackage.NOTIFICATION_PROTOCOL__FOLLOWS_CONDITIONS);
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
		case MetamodeloEnormPackage.NOTIFICATION_PROTOCOL__HAS_NOTIFICATION:
			return ((InternalEList<?>) getHasNotification()).basicRemove(otherEnd, msgs);
		case MetamodeloEnormPackage.NOTIFICATION_PROTOCOL__HAS_ATTRIBUTE:
			return ((InternalEList<?>) getHasAttribute()).basicRemove(otherEnd, msgs);
		case MetamodeloEnormPackage.NOTIFICATION_PROTOCOL__FOLLOWS_CONDITIONS:
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
		case MetamodeloEnormPackage.NOTIFICATION_PROTOCOL__NAME:
			return getName();
		case MetamodeloEnormPackage.NOTIFICATION_PROTOCOL__HAS_NOTIFICATION:
			return getHasNotification();
		case MetamodeloEnormPackage.NOTIFICATION_PROTOCOL__HAS_ATTRIBUTE:
			return getHasAttribute();
		case MetamodeloEnormPackage.NOTIFICATION_PROTOCOL__FOLLOWS_CONDITIONS:
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
		case MetamodeloEnormPackage.NOTIFICATION_PROTOCOL__NAME:
			setName((String) newValue);
			return;
		case MetamodeloEnormPackage.NOTIFICATION_PROTOCOL__HAS_NOTIFICATION:
			getHasNotification().clear();
			getHasNotification().addAll((Collection<? extends Notification>) newValue);
			return;
		case MetamodeloEnormPackage.NOTIFICATION_PROTOCOL__HAS_ATTRIBUTE:
			getHasAttribute().clear();
			getHasAttribute().addAll((Collection<? extends Attribute>) newValue);
			return;
		case MetamodeloEnormPackage.NOTIFICATION_PROTOCOL__FOLLOWS_CONDITIONS:
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
		case MetamodeloEnormPackage.NOTIFICATION_PROTOCOL__NAME:
			setName(NAME_EDEFAULT);
			return;
		case MetamodeloEnormPackage.NOTIFICATION_PROTOCOL__HAS_NOTIFICATION:
			getHasNotification().clear();
			return;
		case MetamodeloEnormPackage.NOTIFICATION_PROTOCOL__HAS_ATTRIBUTE:
			getHasAttribute().clear();
			return;
		case MetamodeloEnormPackage.NOTIFICATION_PROTOCOL__FOLLOWS_CONDITIONS:
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
		case MetamodeloEnormPackage.NOTIFICATION_PROTOCOL__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case MetamodeloEnormPackage.NOTIFICATION_PROTOCOL__HAS_NOTIFICATION:
			return hasNotification != null && !hasNotification.isEmpty();
		case MetamodeloEnormPackage.NOTIFICATION_PROTOCOL__HAS_ATTRIBUTE:
			return hasAttribute != null && !hasAttribute.isEmpty();
		case MetamodeloEnormPackage.NOTIFICATION_PROTOCOL__FOLLOWS_CONDITIONS:
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

} //NotificationProtocolImpl
