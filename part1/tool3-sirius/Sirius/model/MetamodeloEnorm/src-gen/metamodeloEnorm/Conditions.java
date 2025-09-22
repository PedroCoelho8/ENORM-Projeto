/**
 */
package metamodeloEnorm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conditions</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link metamodeloEnorm.Conditions#getName <em>Name</em>}</li>
 *   <li>{@link metamodeloEnorm.Conditions#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link metamodeloEnorm.Conditions#getBody <em>Body</em>}</li>
 *   <li>{@link metamodeloEnorm.Conditions#getMonitorsDataCore <em>Monitors Data Core</em>}</li>
 *   <li>{@link metamodeloEnorm.Conditions#getHasAttributes <em>Has Attributes</em>}</li>
 *   <li>{@link metamodeloEnorm.Conditions#getTriggersActions <em>Triggers Actions</em>}</li>
 * </ul>
 *
 * @see metamodeloEnorm.MetamodeloEnormPackage#getConditions()
 * @model
 * @generated
 */
public interface Conditions extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see metamodeloEnorm.MetamodeloEnormPackage#getConditions_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link metamodeloEnorm.Conditions#getName <em>Name</em>}' attribute.
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
	 * @see metamodeloEnorm.MetamodeloEnormPackage#getConditions_ReturnType()
	 * @model
	 * @generated
	 */
	DataType getReturnType();

	/**
	 * Sets the value of the '{@link metamodeloEnorm.Conditions#getReturnType <em>Return Type</em>}' attribute.
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
	 * @see metamodeloEnorm.MetamodeloEnormPackage#getConditions_Body()
	 * @model
	 * @generated
	 */
	String getBody();

	/**
	 * Sets the value of the '{@link metamodeloEnorm.Conditions#getBody <em>Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' attribute.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(String value);

	/**
	 * Returns the value of the '<em><b>Monitors Data Core</b></em>' containment reference list.
	 * The list contents are of type {@link metamodeloEnorm.Datacore}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Monitors Data Core</em>' containment reference list.
	 * @see metamodeloEnorm.MetamodeloEnormPackage#getConditions_MonitorsDataCore()
	 * @model containment="true"
	 * @generated
	 */
	EList<Datacore> getMonitorsDataCore();

	/**
	 * Returns the value of the '<em><b>Has Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link metamodeloEnorm.Attribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Attributes</em>' containment reference list.
	 * @see metamodeloEnorm.MetamodeloEnormPackage#getConditions_HasAttributes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Attribute> getHasAttributes();

	/**
	 * Returns the value of the '<em><b>Triggers Actions</b></em>' containment reference list.
	 * The list contents are of type {@link metamodeloEnorm.Action}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Triggers Actions</em>' containment reference list.
	 * @see metamodeloEnorm.MetamodeloEnormPackage#getConditions_TriggersActions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Action> getTriggersActions();

} // Conditions
