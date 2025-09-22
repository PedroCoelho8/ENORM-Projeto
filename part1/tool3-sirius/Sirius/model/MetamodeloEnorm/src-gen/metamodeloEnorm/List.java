/**
 */
package metamodeloEnorm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link metamodeloEnorm.List#getName <em>Name</em>}</li>
 *   <li>{@link metamodeloEnorm.List#getType <em>Type</em>}</li>
 *   <li>{@link metamodeloEnorm.List#getHasAttributes <em>Has Attributes</em>}</li>
 * </ul>
 *
 * @see metamodeloEnorm.MetamodeloEnormPackage#getList()
 * @model
 * @generated
 */
public interface List extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see metamodeloEnorm.MetamodeloEnormPackage#getList_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link metamodeloEnorm.List#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link metamodeloEnorm.ListDataType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see metamodeloEnorm.ListDataType
	 * @see #setType(ListDataType)
	 * @see metamodeloEnorm.MetamodeloEnormPackage#getList_Type()
	 * @model
	 * @generated
	 */
	ListDataType getType();

	/**
	 * Sets the value of the '{@link metamodeloEnorm.List#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see metamodeloEnorm.ListDataType
	 * @see #getType()
	 * @generated
	 */
	void setType(ListDataType value);

	/**
	 * Returns the value of the '<em><b>Has Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link metamodeloEnorm.Attribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Attributes</em>' containment reference list.
	 * @see metamodeloEnorm.MetamodeloEnormPackage#getList_HasAttributes()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Attribute> getHasAttributes();

} // List
