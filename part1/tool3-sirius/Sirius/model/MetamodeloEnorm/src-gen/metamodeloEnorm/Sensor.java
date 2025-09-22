/**
 */
package metamodeloEnorm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sensor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link metamodeloEnorm.Sensor#getName <em>Name</em>}</li>
 *   <li>{@link metamodeloEnorm.Sensor#getMapsThroughDataMapping <em>Maps Through Data Mapping</em>}</li>
 *   <li>{@link metamodeloEnorm.Sensor#getHasAttribute <em>Has Attribute</em>}</li>
 *   <li>{@link metamodeloEnorm.Sensor#getFollowsConditions <em>Follows Conditions</em>}</li>
 * </ul>
 *
 * @see metamodeloEnorm.MetamodeloEnormPackage#getSensor()
 * @model
 * @generated
 */
public interface Sensor extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see metamodeloEnorm.MetamodeloEnormPackage#getSensor_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link metamodeloEnorm.Sensor#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Maps Through Data Mapping</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maps Through Data Mapping</em>' containment reference.
	 * @see #setMapsThroughDataMapping(DataMapping)
	 * @see metamodeloEnorm.MetamodeloEnormPackage#getSensor_MapsThroughDataMapping()
	 * @model containment="true" required="true"
	 * @generated
	 */
	DataMapping getMapsThroughDataMapping();

	/**
	 * Sets the value of the '{@link metamodeloEnorm.Sensor#getMapsThroughDataMapping <em>Maps Through Data Mapping</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maps Through Data Mapping</em>' containment reference.
	 * @see #getMapsThroughDataMapping()
	 * @generated
	 */
	void setMapsThroughDataMapping(DataMapping value);

	/**
	 * Returns the value of the '<em><b>Has Attribute</b></em>' containment reference list.
	 * The list contents are of type {@link metamodeloEnorm.Attribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Attribute</em>' containment reference list.
	 * @see metamodeloEnorm.MetamodeloEnormPackage#getSensor_HasAttribute()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Attribute> getHasAttribute();

	/**
	 * Returns the value of the '<em><b>Follows Conditions</b></em>' containment reference list.
	 * The list contents are of type {@link metamodeloEnorm.Conditions}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Follows Conditions</em>' containment reference list.
	 * @see metamodeloEnorm.MetamodeloEnormPackage#getSensor_FollowsConditions()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Conditions> getFollowsConditions();

} // Sensor
