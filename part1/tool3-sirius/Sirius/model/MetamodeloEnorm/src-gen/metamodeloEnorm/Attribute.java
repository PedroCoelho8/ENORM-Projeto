/**
 */
package metamodeloEnorm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link metamodeloEnorm.Attribute#getName <em>Name</em>}</li>
 *   <li>{@link metamodeloEnorm.Attribute#getType <em>Type</em>}</li>
 *   <li>{@link metamodeloEnorm.Attribute#getValue <em>Value</em>}</li>
 *   <li>{@link metamodeloEnorm.Attribute#getHasConditions <em>Has Conditions</em>}</li>
 * </ul>
 *
 * @see metamodeloEnorm.MetamodeloEnormPackage#getAttribute()
 * @model
 * @generated
 */
public interface Attribute extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see metamodeloEnorm.MetamodeloEnormPackage#getAttribute_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link metamodeloEnorm.Attribute#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link metamodeloEnorm.DataType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see metamodeloEnorm.DataType
	 * @see #setType(DataType)
	 * @see metamodeloEnorm.MetamodeloEnormPackage#getAttribute_Type()
	 * @model
	 * @generated
	 */
	DataType getType();

	/**
	 * Sets the value of the '{@link metamodeloEnorm.Attribute#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see metamodeloEnorm.DataType
	 * @see #getType()
	 * @generated
	 */
	void setType(DataType value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see metamodeloEnorm.MetamodeloEnormPackage#getAttribute_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link metamodeloEnorm.Attribute#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Has Conditions</b></em>' containment reference list.
	 * The list contents are of type {@link metamodeloEnorm.Conditions}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Conditions</em>' containment reference list.
	 * @see metamodeloEnorm.MetamodeloEnormPackage#getAttribute_HasConditions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Conditions> getHasConditions();

} // Attribute
