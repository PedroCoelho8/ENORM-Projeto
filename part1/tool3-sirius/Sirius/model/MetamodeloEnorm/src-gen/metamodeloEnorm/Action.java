/**
 */
package metamodeloEnorm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link metamodeloEnorm.Action#getName <em>Name</em>}</li>
 *   <li>{@link metamodeloEnorm.Action#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link metamodeloEnorm.Action#getBody <em>Body</em>}</li>
 *   <li>{@link metamodeloEnorm.Action#getActsOnActuator <em>Acts On Actuator</em>}</li>
 *   <li>{@link metamodeloEnorm.Action#getMaySendNotification <em>May Send Notification</em>}</li>
 *   <li>{@link metamodeloEnorm.Action#getHasAttributes <em>Has Attributes</em>}</li>
 * </ul>
 *
 * @see metamodeloEnorm.MetamodeloEnormPackage#getAction()
 * @model
 * @generated
 */
public interface Action extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see metamodeloEnorm.MetamodeloEnormPackage#getAction_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link metamodeloEnorm.Action#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Return Type</b></em>' attribute.
	 * The literals are from the enumeration {@link metamodeloEnorm.DataType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Type</em>' attribute.
	 * @see metamodeloEnorm.DataType
	 * @see #setReturnType(DataType)
	 * @see metamodeloEnorm.MetamodeloEnormPackage#getAction_ReturnType()
	 * @model
	 * @generated
	 */
	DataType getReturnType();

	/**
	 * Sets the value of the '{@link metamodeloEnorm.Action#getReturnType <em>Return Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Type</em>' attribute.
	 * @see metamodeloEnorm.DataType
	 * @see #getReturnType()
	 * @generated
	 */
	void setReturnType(DataType value);

	/**
	 * Returns the value of the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' attribute.
	 * @see #setBody(String)
	 * @see metamodeloEnorm.MetamodeloEnormPackage#getAction_Body()
	 * @model
	 * @generated
	 */
	String getBody();

	/**
	 * Sets the value of the '{@link metamodeloEnorm.Action#getBody <em>Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' attribute.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(String value);

	/**
	 * Returns the value of the '<em><b>Acts On Actuator</b></em>' containment reference list.
	 * The list contents are of type {@link metamodeloEnorm.Actuator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Acts On Actuator</em>' containment reference list.
	 * @see metamodeloEnorm.MetamodeloEnormPackage#getAction_ActsOnActuator()
	 * @model containment="true"
	 * @generated
	 */
	EList<Actuator> getActsOnActuator();

	/**
	 * Returns the value of the '<em><b>May Send Notification</b></em>' containment reference list.
	 * The list contents are of type {@link metamodeloEnorm.Notification}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>May Send Notification</em>' containment reference list.
	 * @see metamodeloEnorm.MetamodeloEnormPackage#getAction_MaySendNotification()
	 * @model containment="true"
	 * @generated
	 */
	EList<Notification> getMaySendNotification();

	/**
	 * Returns the value of the '<em><b>Has Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link metamodeloEnorm.Attribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Attributes</em>' containment reference list.
	 * @see metamodeloEnorm.MetamodeloEnormPackage#getAction_HasAttributes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Attribute> getHasAttributes();

} // Action
