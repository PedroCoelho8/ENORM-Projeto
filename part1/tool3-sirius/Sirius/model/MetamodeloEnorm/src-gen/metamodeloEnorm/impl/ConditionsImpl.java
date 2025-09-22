/**
 */
package metamodeloEnorm.impl;

import java.util.Collection;

import metamodeloEnorm.Action;
import metamodeloEnorm.Attribute;
import metamodeloEnorm.Conditions;
import metamodeloEnorm.DataType;
import metamodeloEnorm.Datacore;
import metamodeloEnorm.MetamodeloEnormPackage;

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
 * An implementation of the model object '<em><b>Conditions</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link metamodeloEnorm.impl.ConditionsImpl#getName <em>Name</em>}</li>
 *   <li>{@link metamodeloEnorm.impl.ConditionsImpl#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link metamodeloEnorm.impl.ConditionsImpl#getBody <em>Body</em>}</li>
 *   <li>{@link metamodeloEnorm.impl.ConditionsImpl#getMonitorsDataCore <em>Monitors Data Core</em>}</li>
 *   <li>{@link metamodeloEnorm.impl.ConditionsImpl#getHasAttributes <em>Has Attributes</em>}</li>
 *   <li>{@link metamodeloEnorm.impl.ConditionsImpl#getTriggersActions <em>Triggers Actions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConditionsImpl extends MinimalEObjectImpl.Container implements Conditions {
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
	 * The cached value of the '{@link #getMonitorsDataCore() <em>Monitors Data Core</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonitorsDataCore()
	 * @generated
	 * @ordered
	 */
	protected EList<Datacore> monitorsDataCore;

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
	 * The cached value of the '{@link #getTriggersActions() <em>Triggers Actions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTriggersActions()
	 * @generated
	 * @ordered
	 */
	protected EList<Action> triggersActions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConditionsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetamodeloEnormPackage.Literals.CONDITIONS;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodeloEnormPackage.CONDITIONS__NAME, oldName,
					name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodeloEnormPackage.CONDITIONS__RETURN_TYPE,
					oldReturnType, returnType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodeloEnormPackage.CONDITIONS__BODY, oldBody,
					body));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Datacore> getMonitorsDataCore() {
		if (monitorsDataCore == null) {
			monitorsDataCore = new EObjectContainmentEList<Datacore>(Datacore.class, this,
					MetamodeloEnormPackage.CONDITIONS__MONITORS_DATA_CORE);
		}
		return monitorsDataCore;
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
					MetamodeloEnormPackage.CONDITIONS__HAS_ATTRIBUTES);
		}
		return hasAttributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Action> getTriggersActions() {
		if (triggersActions == null) {
			triggersActions = new EObjectContainmentEList<Action>(Action.class, this,
					MetamodeloEnormPackage.CONDITIONS__TRIGGERS_ACTIONS);
		}
		return triggersActions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MetamodeloEnormPackage.CONDITIONS__MONITORS_DATA_CORE:
			return ((InternalEList<?>) getMonitorsDataCore()).basicRemove(otherEnd, msgs);
		case MetamodeloEnormPackage.CONDITIONS__HAS_ATTRIBUTES:
			return ((InternalEList<?>) getHasAttributes()).basicRemove(otherEnd, msgs);
		case MetamodeloEnormPackage.CONDITIONS__TRIGGERS_ACTIONS:
			return ((InternalEList<?>) getTriggersActions()).basicRemove(otherEnd, msgs);
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
		case MetamodeloEnormPackage.CONDITIONS__NAME:
			return getName();
		case MetamodeloEnormPackage.CONDITIONS__RETURN_TYPE:
			return getReturnType();
		case MetamodeloEnormPackage.CONDITIONS__BODY:
			return getBody();
		case MetamodeloEnormPackage.CONDITIONS__MONITORS_DATA_CORE:
			return getMonitorsDataCore();
		case MetamodeloEnormPackage.CONDITIONS__HAS_ATTRIBUTES:
			return getHasAttributes();
		case MetamodeloEnormPackage.CONDITIONS__TRIGGERS_ACTIONS:
			return getTriggersActions();
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
		case MetamodeloEnormPackage.CONDITIONS__NAME:
			setName((String) newValue);
			return;
		case MetamodeloEnormPackage.CONDITIONS__RETURN_TYPE:
			setReturnType((DataType) newValue);
			return;
		case MetamodeloEnormPackage.CONDITIONS__BODY:
			setBody((String) newValue);
			return;
		case MetamodeloEnormPackage.CONDITIONS__MONITORS_DATA_CORE:
			getMonitorsDataCore().clear();
			getMonitorsDataCore().addAll((Collection<? extends Datacore>) newValue);
			return;
		case MetamodeloEnormPackage.CONDITIONS__HAS_ATTRIBUTES:
			getHasAttributes().clear();
			getHasAttributes().addAll((Collection<? extends Attribute>) newValue);
			return;
		case MetamodeloEnormPackage.CONDITIONS__TRIGGERS_ACTIONS:
			getTriggersActions().clear();
			getTriggersActions().addAll((Collection<? extends Action>) newValue);
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
		case MetamodeloEnormPackage.CONDITIONS__NAME:
			setName(NAME_EDEFAULT);
			return;
		case MetamodeloEnormPackage.CONDITIONS__RETURN_TYPE:
			setReturnType(RETURN_TYPE_EDEFAULT);
			return;
		case MetamodeloEnormPackage.CONDITIONS__BODY:
			setBody(BODY_EDEFAULT);
			return;
		case MetamodeloEnormPackage.CONDITIONS__MONITORS_DATA_CORE:
			getMonitorsDataCore().clear();
			return;
		case MetamodeloEnormPackage.CONDITIONS__HAS_ATTRIBUTES:
			getHasAttributes().clear();
			return;
		case MetamodeloEnormPackage.CONDITIONS__TRIGGERS_ACTIONS:
			getTriggersActions().clear();
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
		case MetamodeloEnormPackage.CONDITIONS__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case MetamodeloEnormPackage.CONDITIONS__RETURN_TYPE:
			return returnType != RETURN_TYPE_EDEFAULT;
		case MetamodeloEnormPackage.CONDITIONS__BODY:
			return BODY_EDEFAULT == null ? body != null : !BODY_EDEFAULT.equals(body);
		case MetamodeloEnormPackage.CONDITIONS__MONITORS_DATA_CORE:
			return monitorsDataCore != null && !monitorsDataCore.isEmpty();
		case MetamodeloEnormPackage.CONDITIONS__HAS_ATTRIBUTES:
			return hasAttributes != null && !hasAttributes.isEmpty();
		case MetamodeloEnormPackage.CONDITIONS__TRIGGERS_ACTIONS:
			return triggersActions != null && !triggersActions.isEmpty();
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

} //ConditionsImpl
