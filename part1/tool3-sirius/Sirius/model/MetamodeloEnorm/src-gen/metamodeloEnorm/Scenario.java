/**
 */
package metamodeloEnorm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scenario</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link metamodeloEnorm.Scenario#getName <em>Name</em>}</li>
 *   <li>{@link metamodeloEnorm.Scenario#getHasActuator <em>Has Actuator</em>}</li>
 *   <li>{@link metamodeloEnorm.Scenario#getHasAttributes <em>Has Attributes</em>}</li>
 * </ul>
 *
 * @see metamodeloEnorm.MetamodeloEnormPackage#getScenario()
 * @model
 * @generated
 */
public interface Scenario extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see metamodeloEnorm.MetamodeloEnormPackage#getScenario_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link metamodeloEnorm.Scenario#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Has Actuator</b></em>' containment reference list.
	 * The list contents are of type {@link metamodeloEnorm.Actuator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Actuator</em>' containment reference list.
	 * @see metamodeloEnorm.MetamodeloEnormPackage#getScenario_HasActuator()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Actuator> getHasActuator();

	/**
	 * Returns the value of the '<em><b>Has Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link metamodeloEnorm.Attribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Attributes</em>' containment reference list.
	 * @see metamodeloEnorm.MetamodeloEnormPackage#getScenario_HasAttributes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Attribute> getHasAttributes();

} // Scenario
