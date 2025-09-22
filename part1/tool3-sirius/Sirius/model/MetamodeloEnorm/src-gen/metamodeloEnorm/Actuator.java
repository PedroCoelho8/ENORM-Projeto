/**
 */
package metamodeloEnorm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Actuator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link metamodeloEnorm.Actuator#getName <em>Name</em>}</li>
 *   <li>{@link metamodeloEnorm.Actuator#getIsConnectedTo <em>Is Connected To</em>}</li>
 *   <li>{@link metamodeloEnorm.Actuator#getFollowsConditions <em>Follows Conditions</em>}</li>
 *   <li>{@link metamodeloEnorm.Actuator#getFollowsNotificationProtocol <em>Follows Notification Protocol</em>}</li>
 *   <li>{@link metamodeloEnorm.Actuator#getHasAttributes <em>Has Attributes</em>}</li>
 * </ul>
 *
 * @see metamodeloEnorm.MetamodeloEnormPackage#getActuator()
 * @model
 * @generated
 */
public interface Actuator extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see metamodeloEnorm.MetamodeloEnormPackage#getActuator_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link metamodeloEnorm.Actuator#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Is Connected To</b></em>' containment reference list.
	 * The list contents are of type {@link metamodeloEnorm.Sensor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Connected To</em>' containment reference list.
	 * @see metamodeloEnorm.MetamodeloEnormPackage#getActuator_IsConnectedTo()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Sensor> getIsConnectedTo();

	/**
	 * Returns the value of the '<em><b>Follows Conditions</b></em>' containment reference list.
	 * The list contents are of type {@link metamodeloEnorm.Conditions}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Follows Conditions</em>' containment reference list.
	 * @see metamodeloEnorm.MetamodeloEnormPackage#getActuator_FollowsConditions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Conditions> getFollowsConditions();

	/**
	 * Returns the value of the '<em><b>Follows Notification Protocol</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Follows Notification Protocol</em>' containment reference.
	 * @see #setFollowsNotificationProtocol(NotificationProtocol)
	 * @see metamodeloEnorm.MetamodeloEnormPackage#getActuator_FollowsNotificationProtocol()
	 * @model containment="true" required="true"
	 * @generated
	 */
	NotificationProtocol getFollowsNotificationProtocol();

	/**
	 * Sets the value of the '{@link metamodeloEnorm.Actuator#getFollowsNotificationProtocol <em>Follows Notification Protocol</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Follows Notification Protocol</em>' containment reference.
	 * @see #getFollowsNotificationProtocol()
	 * @generated
	 */
	void setFollowsNotificationProtocol(NotificationProtocol value);

	/**
	 * Returns the value of the '<em><b>Has Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link metamodeloEnorm.Attribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Attributes</em>' containment reference list.
	 * @see metamodeloEnorm.MetamodeloEnormPackage#getActuator_HasAttributes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Attribute> getHasAttributes();

} // Actuator
