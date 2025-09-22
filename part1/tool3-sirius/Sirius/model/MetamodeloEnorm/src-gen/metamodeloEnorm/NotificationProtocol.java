/**
 */
package metamodeloEnorm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Notification Protocol</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link metamodeloEnorm.NotificationProtocol#getName <em>Name</em>}</li>
 *   <li>{@link metamodeloEnorm.NotificationProtocol#getHasNotification <em>Has Notification</em>}</li>
 *   <li>{@link metamodeloEnorm.NotificationProtocol#getHasAttribute <em>Has Attribute</em>}</li>
 *   <li>{@link metamodeloEnorm.NotificationProtocol#getFollowsConditions <em>Follows Conditions</em>}</li>
 * </ul>
 *
 * @see metamodeloEnorm.MetamodeloEnormPackage#getNotificationProtocol()
 * @model
 * @generated
 */
public interface NotificationProtocol extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see metamodeloEnorm.MetamodeloEnormPackage#getNotificationProtocol_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link metamodeloEnorm.NotificationProtocol#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Has Notification</b></em>' containment reference list.
	 * The list contents are of type {@link metamodeloEnorm.Notification}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Notification</em>' containment reference list.
	 * @see metamodeloEnorm.MetamodeloEnormPackage#getNotificationProtocol_HasNotification()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Notification> getHasNotification();

	/**
	 * Returns the value of the '<em><b>Has Attribute</b></em>' containment reference list.
	 * The list contents are of type {@link metamodeloEnorm.Attribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Attribute</em>' containment reference list.
	 * @see metamodeloEnorm.MetamodeloEnormPackage#getNotificationProtocol_HasAttribute()
	 * @model containment="true"
	 * @generated
	 */
	EList<Attribute> getHasAttribute();

	/**
	 * Returns the value of the '<em><b>Follows Conditions</b></em>' containment reference list.
	 * The list contents are of type {@link metamodeloEnorm.Conditions}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Follows Conditions</em>' containment reference list.
	 * @see metamodeloEnorm.MetamodeloEnormPackage#getNotificationProtocol_FollowsConditions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Conditions> getFollowsConditions();

} // NotificationProtocol
