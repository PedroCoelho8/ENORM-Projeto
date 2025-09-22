/**
 */
package metamodeloEnorm.impl;

import java.util.Collection;

import metamodeloEnorm.Actuator;
import metamodeloEnorm.Attribute;
import metamodeloEnorm.MetamodeloEnormPackage;
import metamodeloEnorm.Scenario;

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
 * An implementation of the model object '<em><b>Scenario</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link metamodeloEnorm.impl.ScenarioImpl#getName <em>Name</em>}</li>
 *   <li>{@link metamodeloEnorm.impl.ScenarioImpl#getHasActuator <em>Has Actuator</em>}</li>
 *   <li>{@link metamodeloEnorm.impl.ScenarioImpl#getHasAttributes <em>Has Attributes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScenarioImpl extends MinimalEObjectImpl.Container implements Scenario {
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
	 * The cached value of the '{@link #getHasActuator() <em>Has Actuator</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasActuator()
	 * @generated
	 * @ordered
	 */
	protected EList<Actuator> hasActuator;

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
	protected ScenarioImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetamodeloEnormPackage.Literals.SCENARIO;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodeloEnormPackage.SCENARIO__NAME, oldName,
					name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Actuator> getHasActuator() {
		if (hasActuator == null) {
			hasActuator = new EObjectContainmentEList<Actuator>(Actuator.class, this,
					MetamodeloEnormPackage.SCENARIO__HAS_ACTUATOR);
		}
		return hasActuator;
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
					MetamodeloEnormPackage.SCENARIO__HAS_ATTRIBUTES);
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
		case MetamodeloEnormPackage.SCENARIO__HAS_ACTUATOR:
			return ((InternalEList<?>) getHasActuator()).basicRemove(otherEnd, msgs);
		case MetamodeloEnormPackage.SCENARIO__HAS_ATTRIBUTES:
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
		case MetamodeloEnormPackage.SCENARIO__NAME:
			return getName();
		case MetamodeloEnormPackage.SCENARIO__HAS_ACTUATOR:
			return getHasActuator();
		case MetamodeloEnormPackage.SCENARIO__HAS_ATTRIBUTES:
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
		case MetamodeloEnormPackage.SCENARIO__NAME:
			setName((String) newValue);
			return;
		case MetamodeloEnormPackage.SCENARIO__HAS_ACTUATOR:
			getHasActuator().clear();
			getHasActuator().addAll((Collection<? extends Actuator>) newValue);
			return;
		case MetamodeloEnormPackage.SCENARIO__HAS_ATTRIBUTES:
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
		case MetamodeloEnormPackage.SCENARIO__NAME:
			setName(NAME_EDEFAULT);
			return;
		case MetamodeloEnormPackage.SCENARIO__HAS_ACTUATOR:
			getHasActuator().clear();
			return;
		case MetamodeloEnormPackage.SCENARIO__HAS_ATTRIBUTES:
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
		case MetamodeloEnormPackage.SCENARIO__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case MetamodeloEnormPackage.SCENARIO__HAS_ACTUATOR:
			return hasActuator != null && !hasActuator.isEmpty();
		case MetamodeloEnormPackage.SCENARIO__HAS_ATTRIBUTES:
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

} //ScenarioImpl
