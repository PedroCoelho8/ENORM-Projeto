/**
 */
package metamodeloEnorm.impl;

import metamodeloEnorm.DataMapping;
import metamodeloEnorm.Datacore;
import metamodeloEnorm.MetamodeloEnormPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link metamodeloEnorm.impl.DataMappingImpl#getName <em>Name</em>}</li>
 *   <li>{@link metamodeloEnorm.impl.DataMappingImpl#getStoresDatainDataCore <em>Stores Datain Data Core</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataMappingImpl extends MinimalEObjectImpl.Container implements DataMapping {
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
	 * The cached value of the '{@link #getStoresDatainDataCore() <em>Stores Datain Data Core</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStoresDatainDataCore()
	 * @generated
	 * @ordered
	 */
	protected Datacore storesDatainDataCore;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataMappingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetamodeloEnormPackage.Literals.DATA_MAPPING;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodeloEnormPackage.DATA_MAPPING__NAME, oldName,
					name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Datacore getStoresDatainDataCore() {
		return storesDatainDataCore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStoresDatainDataCore(Datacore newStoresDatainDataCore, NotificationChain msgs) {
		Datacore oldStoresDatainDataCore = storesDatainDataCore;
		storesDatainDataCore = newStoresDatainDataCore;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					MetamodeloEnormPackage.DATA_MAPPING__STORES_DATAIN_DATA_CORE, oldStoresDatainDataCore,
					newStoresDatainDataCore);
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
	public void setStoresDatainDataCore(Datacore newStoresDatainDataCore) {
		if (newStoresDatainDataCore != storesDatainDataCore) {
			NotificationChain msgs = null;
			if (storesDatainDataCore != null)
				msgs = ((InternalEObject) storesDatainDataCore).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - MetamodeloEnormPackage.DATA_MAPPING__STORES_DATAIN_DATA_CORE, null,
						msgs);
			if (newStoresDatainDataCore != null)
				msgs = ((InternalEObject) newStoresDatainDataCore).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - MetamodeloEnormPackage.DATA_MAPPING__STORES_DATAIN_DATA_CORE, null,
						msgs);
			msgs = basicSetStoresDatainDataCore(newStoresDatainDataCore, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					MetamodeloEnormPackage.DATA_MAPPING__STORES_DATAIN_DATA_CORE, newStoresDatainDataCore,
					newStoresDatainDataCore));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MetamodeloEnormPackage.DATA_MAPPING__STORES_DATAIN_DATA_CORE:
			return basicSetStoresDatainDataCore(null, msgs);
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
		case MetamodeloEnormPackage.DATA_MAPPING__NAME:
			return getName();
		case MetamodeloEnormPackage.DATA_MAPPING__STORES_DATAIN_DATA_CORE:
			return getStoresDatainDataCore();
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
		case MetamodeloEnormPackage.DATA_MAPPING__NAME:
			setName((String) newValue);
			return;
		case MetamodeloEnormPackage.DATA_MAPPING__STORES_DATAIN_DATA_CORE:
			setStoresDatainDataCore((Datacore) newValue);
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
		case MetamodeloEnormPackage.DATA_MAPPING__NAME:
			setName(NAME_EDEFAULT);
			return;
		case MetamodeloEnormPackage.DATA_MAPPING__STORES_DATAIN_DATA_CORE:
			setStoresDatainDataCore((Datacore) null);
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
		case MetamodeloEnormPackage.DATA_MAPPING__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case MetamodeloEnormPackage.DATA_MAPPING__STORES_DATAIN_DATA_CORE:
			return storesDatainDataCore != null;
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

} //DataMappingImpl
