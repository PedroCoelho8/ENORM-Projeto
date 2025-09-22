/**
 */
package metamodeloEnorm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Datacore</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link metamodeloEnorm.Datacore#getName <em>Name</em>}</li>
 *   <li>{@link metamodeloEnorm.Datacore#getHasList <em>Has List</em>}</li>
 * </ul>
 *
 * @see metamodeloEnorm.MetamodeloEnormPackage#getDatacore()
 * @model
 * @generated
 */
public interface Datacore extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see metamodeloEnorm.MetamodeloEnormPackage#getDatacore_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link metamodeloEnorm.Datacore#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Has List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has List</em>' containment reference.
	 * @see #setHasList(List)
	 * @see metamodeloEnorm.MetamodeloEnormPackage#getDatacore_HasList()
	 * @model containment="true" required="true"
	 * @generated
	 */
	List getHasList();

	/**
	 * Sets the value of the '{@link metamodeloEnorm.Datacore#getHasList <em>Has List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has List</em>' containment reference.
	 * @see #getHasList()
	 * @generated
	 */
	void setHasList(List value);

} // Datacore
