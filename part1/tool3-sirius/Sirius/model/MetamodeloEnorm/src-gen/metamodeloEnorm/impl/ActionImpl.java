/**
 */
package metamodeloEnorm.impl;

import java.util.Collection;

import metamodeloEnorm.Action;
import metamodeloEnorm.Actuator;
import metamodeloEnorm.Attribute;
import metamodeloEnorm.DataType;
import metamodeloEnorm.MetamodeloEnormPackage;
import metamodeloEnorm.Notification;

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
 * An implementation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link metamodeloEnorm.impl.ActionImpl#getName <em>Name</em>}</li>
 *   <li>{@link metamodeloEnorm.impl.ActionImpl#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link metamodeloEnorm.impl.ActionImpl#getBody <em>Body</em>}</li>
 *   <li>{@link metamodeloEnorm.impl.ActionImpl#getActsOnActuator <em>Acts On Actuator</em>}</li>
 *   <li>{@link metamodeloEnorm.impl.ActionImpl#getMaySendNotification <em>May Send Notification</em>}</li>
 *   <li>{@link metamodeloEnorm.impl.ActionImpl#getHasAttributes <em>Has Attributes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActionImpl extends MinimalEObjectImpl.Container implements Action {
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
	 * The default value of the '{@link #getReturnType() <em>Return Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnType()
	 * @generated
	 * @ordered
	 */
	protected static final DataType RETURN_TYPE_EDEFAULT = DataType.STRING;

	/**
	 * The cached value of the '{@link #getReturnType() <em>Return Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnType()
	 * @generated
	 * @ordered
	 */
	protected DataType returnType = RETURN_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getBody() <em>Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBody()
	 * @generated
	 * @ordered
	 */
	protected static final String BODY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBody() <em>Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBody()
	 * @generated
	 * @ordered
	 */
	protected String body = BODY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getActsOnActuator() <em>Acts On Actuator</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActsOnActuator()
	 * @generated
	 * @ordered
	 */
	protected EList<Actuator> actsOnActuator;

	/**
	 * The cached value of the '{@link #getMaySendNotification() <em>May Send Notification</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaySendNotification()
	 * @generated
	 * @ordered
	 */
	protected EList<Notification> maySendNotification;

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
	protected ActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetamodeloEnormPackage.Literals.ACTION;
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
					MetamodeloEnormPackage.ACTION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataType getReturnType() {
		return returnType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReturnType(DataType newReturnType) {
		DataType oldReturnType = returnType;
		returnType = newReturnType == null ? RETURN_TYPE_EDEFAULT : newReturnType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, org.eclipse.emf.common.notify.Notification.SET,
					MetamodeloEnormPackage.ACTION__RETURN_TYPE, oldReturnType, returnType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBody() {
		return body;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBody(String newBody) {
		String oldBody = body;
		body = newBody;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, org.eclipse.emf.common.notify.Notification.SET,
					MetamodeloEnormPackage.ACTION__BODY, oldBody, body));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Actuator> getActsOnActuator() {
		if (actsOnActuator == null) {
			actsOnActuator = new EObjectContainmentEList<Actuator>(Actuator.class, this,
					MetamodeloEnormPackage.ACTION__ACTS_ON_ACTUATOR);
		}
		return actsOnActuator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Notification> getMaySendNotification() {
		if (maySendNotification == null) {
			maySendNotification = new EObjectContainmentEList<Notification>(Notification.class, this,
					MetamodeloEnormPackage.ACTION__MAY_SEND_NOTIFICATION);
		}
		return maySendNotification;
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
					MetamodeloEnormPackage.ACTION__HAS_ATTRIBUTES);
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
		case MetamodeloEnormPackage.ACTION__ACTS_ON_ACTUATOR:
			return ((InternalEList<?>) getActsOnActuator()).basicRemove(otherEnd, msgs);
		case MetamodeloEnormPackage.ACTION__MAY_SEND_NOTIFICATION:
			return ((InternalEList<?>) getMaySendNotification()).basicRemove(otherEnd, msgs);
		case MetamodeloEnormPackage.ACTION__HAS_ATTRIBUTES:
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
		case MetamodeloEnormPackage.ACTION__NAME:
			return getName();
		case MetamodeloEnormPackage.ACTION__RETURN_TYPE:
			return getReturnType();
		case MetamodeloEnormPackage.ACTION__BODY:
			return getBody();
		case MetamodeloEnormPackage.ACTION__ACTS_ON_ACTUATOR:
			return getActsOnActuator();
		case MetamodeloEnormPackage.ACTION__MAY_SEND_NOTIFICATION:
			return getMaySendNotification();
		case MetamodeloEnormPackage.ACTION__HAS_ATTRIBUTES:
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
		case MetamodeloEnormPackage.ACTION__NAME:
			setName((String) newValue);
			return;
		case MetamodeloEnormPackage.ACTION__RETURN_TYPE:
			setReturnType((DataType) newValue);
			return;
		case MetamodeloEnormPackage.ACTION__BODY:
			setBody((String) newValue);
			return;
		case MetamodeloEnormPackage.ACTION__ACTS_ON_ACTUATOR:
			getActsOnActuator().clear();
			getActsOnActuator().addAll((Collection<? extends Actuator>) newValue);
			return;
		case MetamodeloEnormPackage.ACTION__MAY_SEND_NOTIFICATION:
			getMaySendNotification().clear();
			getMaySendNotification().addAll((Collection<? extends Notification>) newValue);
			return;
		case MetamodeloEnormPackage.ACTION__HAS_ATTRIBUTES:
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
		case MetamodeloEnormPackage.ACTION__NAME:
			setName(NAME_EDEFAULT);
			return;
		case MetamodeloEnormPackage.ACTION__RETURN_TYPE:
			setReturnType(RETURN_TYPE_EDEFAULT);
			return;
		case MetamodeloEnormPackage.ACTION__BODY:
			setBody(BODY_EDEFAULT);
			return;
		case MetamodeloEnormPackage.ACTION__ACTS_ON_ACTUATOR:
			getActsOnActuator().clear();
			return;
		case MetamodeloEnormPackage.ACTION__MAY_SEND_NOTIFICATION:
			getMaySendNotification().clear();
			return;
		case MetamodeloEnormPackage.ACTION__HAS_ATTRIBUTES:
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
		case MetamodeloEnormPackage.ACTION__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case MetamodeloEnormPackage.ACTION__RETURN_TYPE:
			return returnType != RETURN_TYPE_EDEFAULT;
		case MetamodeloEnormPackage.ACTION__BODY:
			return BODY_EDEFAULT == null ? body != null : !BODY_EDEFAULT.equals(body);
		case MetamodeloEnormPackage.ACTION__ACTS_ON_ACTUATOR:
			return actsOnActuator != null && !actsOnActuator.isEmpty();
		case MetamodeloEnormPackage.ACTION__MAY_SEND_NOTIFICATION:
			return maySendNotification != null && !maySendNotification.isEmpty();
		case MetamodeloEnormPackage.ACTION__HAS_ATTRIBUTES:
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
		result.append(", returnType: ");
		result.append(returnType);
		result.append(", body: ");
		result.append(body);
		result.append(')');
		return result.toString();
	}

} //ActionImpl
