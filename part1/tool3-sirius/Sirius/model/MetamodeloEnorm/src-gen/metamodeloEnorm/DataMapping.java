/**
 */
package metamodeloEnorm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link metamodeloEnorm.DataMapping#getName <em>Name</em>}</li>
 *   <li>{@link metamodeloEnorm.DataMapping#getStoresDatainDataCore <em>Stores Datain Data Core</em>}</li>
 * </ul>
 *
 * @see metamodeloEnorm.MetamodeloEnormPackage#getDataMapping()
 * @model
 * @generated
 */
public interface DataMapping extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see metamodeloEnorm.MetamodeloEnormPackage#getDataMapping_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link metamodeloEnorm.DataMapping#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Stores Datain Data Core</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stores Datain Data Core</em>' containment reference.
	 * @see #setStoresDatainDataCore(Datacore)
	 * @see metamodeloEnorm.MetamodeloEnormPackage#getDataMapping_StoresDatainDataCore()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Datacore getStoresDatainDataCore();

	/**
	 * Sets the value of the '{@link metamodeloEnorm.DataMapping#getStoresDatainDataCore <em>Stores Datain Data Core</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stores Datain Data Core</em>' containment reference.
	 * @see #getStoresDatainDataCore()
	 * @generated
	 */
	void setStoresDatainDataCore(Datacore value);

} // DataMapping
