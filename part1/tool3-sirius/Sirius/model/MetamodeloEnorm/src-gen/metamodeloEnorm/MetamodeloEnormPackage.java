/**
 */
package metamodeloEnorm;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see metamodeloEnorm.MetamodeloEnormFactory
 * @model kind="package"
 * @generated
 */
public interface MetamodeloEnormPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "metamodeloEnorm";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/metamodeloEnorm";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "metamodeloEnorm";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MetamodeloEnormPackage eINSTANCE = metamodeloEnorm.impl.MetamodeloEnormPackageImpl.init();

	/**
	 * The meta object id for the '{@link metamodeloEnorm.impl.ScenarioImpl <em>Scenario</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodeloEnorm.impl.ScenarioImpl
	 * @see metamodeloEnorm.impl.MetamodeloEnormPackageImpl#getScenario()
	 * @generated
	 */
	int SCENARIO = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__NAME = 0;

	/**
	 * The feature id for the '<em><b>Has Actuator</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__HAS_ACTUATOR = 1;

	/**
	 * The feature id for the '<em><b>Has Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__HAS_ATTRIBUTES = 2;

	/**
	 * The number of structural features of the '<em>Scenario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Scenario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link metamodeloEnorm.impl.ActuatorImpl <em>Actuator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodeloEnorm.impl.ActuatorImpl
	 * @see metamodeloEnorm.impl.MetamodeloEnormPackageImpl#getActuator()
	 * @generated
	 */
	int ACTUATOR = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR__NAME = 0;

	/**
	 * The feature id for the '<em><b>Is Connected To</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR__IS_CONNECTED_TO = 1;

	/**
	 * The feature id for the '<em><b>Follows Conditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR__FOLLOWS_CONDITIONS = 2;

	/**
	 * The feature id for the '<em><b>Follows Notification Protocol</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR__FOLLOWS_NOTIFICATION_PROTOCOL = 3;

	/**
	 * The feature id for the '<em><b>Has Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR__HAS_ATTRIBUTES = 4;

	/**
	 * The number of structural features of the '<em>Actuator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Actuator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link metamodeloEnorm.impl.NotificationProtocolImpl <em>Notification Protocol</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodeloEnorm.impl.NotificationProtocolImpl
	 * @see metamodeloEnorm.impl.MetamodeloEnormPackageImpl#getNotificationProtocol()
	 * @generated
	 */
	int NOTIFICATION_PROTOCOL = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_PROTOCOL__NAME = 0;

	/**
	 * The feature id for the '<em><b>Has Notification</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_PROTOCOL__HAS_NOTIFICATION = 1;

	/**
	 * The feature id for the '<em><b>Has Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_PROTOCOL__HAS_ATTRIBUTE = 2;

	/**
	 * The feature id for the '<em><b>Follows Conditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_PROTOCOL__FOLLOWS_CONDITIONS = 3;

	/**
	 * The number of structural features of the '<em>Notification Protocol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_PROTOCOL_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Notification Protocol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_PROTOCOL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link metamodeloEnorm.impl.SensorImpl <em>Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodeloEnorm.impl.SensorImpl
	 * @see metamodeloEnorm.impl.MetamodeloEnormPackageImpl#getSensor()
	 * @generated
	 */
	int SENSOR = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__NAME = 0;

	/**
	 * The feature id for the '<em><b>Maps Through Data Mapping</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__MAPS_THROUGH_DATA_MAPPING = 1;

	/**
	 * The feature id for the '<em><b>Has Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__HAS_ATTRIBUTE = 2;

	/**
	 * The feature id for the '<em><b>Follows Conditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__FOLLOWS_CONDITIONS = 3;

	/**
	 * The number of structural features of the '<em>Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link metamodeloEnorm.impl.ConditionsImpl <em>Conditions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodeloEnorm.impl.ConditionsImpl
	 * @see metamodeloEnorm.impl.MetamodeloEnormPackageImpl#getConditions()
	 * @generated
	 */
	int CONDITIONS = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONS__NAME = 0;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONS__RETURN_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONS__BODY = 2;

	/**
	 * The feature id for the '<em><b>Monitors Data Core</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONS__MONITORS_DATA_CORE = 3;

	/**
	 * The feature id for the '<em><b>Has Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONS__HAS_ATTRIBUTES = 4;

	/**
	 * The feature id for the '<em><b>Triggers Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONS__TRIGGERS_ACTIONS = 5;

	/**
	 * The number of structural features of the '<em>Conditions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONS_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Conditions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link metamodeloEnorm.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodeloEnorm.impl.ActionImpl
	 * @see metamodeloEnorm.impl.MetamodeloEnormPackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__RETURN_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__BODY = 2;

	/**
	 * The feature id for the '<em><b>Acts On Actuator</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__ACTS_ON_ACTUATOR = 3;

	/**
	 * The feature id for the '<em><b>May Send Notification</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__MAY_SEND_NOTIFICATION = 4;

	/**
	 * The feature id for the '<em><b>Has Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__HAS_ATTRIBUTES = 5;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link metamodeloEnorm.impl.NotificationImpl <em>Notification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodeloEnorm.impl.NotificationImpl
	 * @see metamodeloEnorm.impl.MetamodeloEnormPackageImpl#getNotification()
	 * @generated
	 */
	int NOTIFICATION = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Has Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION__HAS_ATTRIBUTE = 1;

	/**
	 * The number of structural features of the '<em>Notification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Notification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link metamodeloEnorm.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodeloEnorm.impl.AttributeImpl
	 * @see metamodeloEnorm.impl.MetamodeloEnormPackageImpl#getAttribute()
	 * @generated
	 */
	int ATTRIBUTE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__VALUE = 2;

	/**
	 * The feature id for the '<em><b>Has Conditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__HAS_CONDITIONS = 3;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link metamodeloEnorm.impl.ListImpl <em>List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodeloEnorm.impl.ListImpl
	 * @see metamodeloEnorm.impl.MetamodeloEnormPackageImpl#getList()
	 * @generated
	 */
	int LIST = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Has Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__HAS_ATTRIBUTES = 2;

	/**
	 * The number of structural features of the '<em>List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link metamodeloEnorm.impl.DatacoreImpl <em>Datacore</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodeloEnorm.impl.DatacoreImpl
	 * @see metamodeloEnorm.impl.MetamodeloEnormPackageImpl#getDatacore()
	 * @generated
	 */
	int DATACORE = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATACORE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Has List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATACORE__HAS_LIST = 1;

	/**
	 * The number of structural features of the '<em>Datacore</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATACORE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Datacore</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATACORE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link metamodeloEnorm.impl.DataMappingImpl <em>Data Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodeloEnorm.impl.DataMappingImpl
	 * @see metamodeloEnorm.impl.MetamodeloEnormPackageImpl#getDataMapping()
	 * @generated
	 */
	int DATA_MAPPING = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MAPPING__NAME = 0;

	/**
	 * The feature id for the '<em><b>Stores Datain Data Core</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MAPPING__STORES_DATAIN_DATA_CORE = 1;

	/**
	 * The number of structural features of the '<em>Data Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MAPPING_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Data Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MAPPING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link metamodeloEnorm.DataType <em>Data Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodeloEnorm.DataType
	 * @see metamodeloEnorm.impl.MetamodeloEnormPackageImpl#getDataType()
	 * @generated
	 */
	int DATA_TYPE = 11;

	/**
	 * The meta object id for the '{@link metamodeloEnorm.ListDataType <em>List Data Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodeloEnorm.ListDataType
	 * @see metamodeloEnorm.impl.MetamodeloEnormPackageImpl#getListDataType()
	 * @generated
	 */
	int LIST_DATA_TYPE = 12;

	/**
	 * Returns the meta object for class '{@link metamodeloEnorm.Scenario <em>Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scenario</em>'.
	 * @see metamodeloEnorm.Scenario
	 * @generated
	 */
	EClass getScenario();

	/**
	 * Returns the meta object for the attribute '{@link metamodeloEnorm.Scenario#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see metamodeloEnorm.Scenario#getName()
	 * @see #getScenario()
	 * @generated
	 */
	EAttribute getScenario_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link metamodeloEnorm.Scenario#getHasActuator <em>Has Actuator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Actuator</em>'.
	 * @see metamodeloEnorm.Scenario#getHasActuator()
	 * @see #getScenario()
	 * @generated
	 */
	EReference getScenario_HasActuator();

	/**
	 * Returns the meta object for the containment reference list '{@link metamodeloEnorm.Scenario#getHasAttributes <em>Has Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Attributes</em>'.
	 * @see metamodeloEnorm.Scenario#getHasAttributes()
	 * @see #getScenario()
	 * @generated
	 */
	EReference getScenario_HasAttributes();

	/**
	 * Returns the meta object for class '{@link metamodeloEnorm.Actuator <em>Actuator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actuator</em>'.
	 * @see metamodeloEnorm.Actuator
	 * @generated
	 */
	EClass getActuator();

	/**
	 * Returns the meta object for the attribute '{@link metamodeloEnorm.Actuator#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see metamodeloEnorm.Actuator#getName()
	 * @see #getActuator()
	 * @generated
	 */
	EAttribute getActuator_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link metamodeloEnorm.Actuator#getIsConnectedTo <em>Is Connected To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Is Connected To</em>'.
	 * @see metamodeloEnorm.Actuator#getIsConnectedTo()
	 * @see #getActuator()
	 * @generated
	 */
	EReference getActuator_IsConnectedTo();

	/**
	 * Returns the meta object for the containment reference list '{@link metamodeloEnorm.Actuator#getFollowsConditions <em>Follows Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Follows Conditions</em>'.
	 * @see metamodeloEnorm.Actuator#getFollowsConditions()
	 * @see #getActuator()
	 * @generated
	 */
	EReference getActuator_FollowsConditions();

	/**
	 * Returns the meta object for the containment reference '{@link metamodeloEnorm.Actuator#getFollowsNotificationProtocol <em>Follows Notification Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Follows Notification Protocol</em>'.
	 * @see metamodeloEnorm.Actuator#getFollowsNotificationProtocol()
	 * @see #getActuator()
	 * @generated
	 */
	EReference getActuator_FollowsNotificationProtocol();

	/**
	 * Returns the meta object for the containment reference list '{@link metamodeloEnorm.Actuator#getHasAttributes <em>Has Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Attributes</em>'.
	 * @see metamodeloEnorm.Actuator#getHasAttributes()
	 * @see #getActuator()
	 * @generated
	 */
	EReference getActuator_HasAttributes();

	/**
	 * Returns the meta object for class '{@link metamodeloEnorm.NotificationProtocol <em>Notification Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Notification Protocol</em>'.
	 * @see metamodeloEnorm.NotificationProtocol
	 * @generated
	 */
	EClass getNotificationProtocol();

	/**
	 * Returns the meta object for the attribute '{@link metamodeloEnorm.NotificationProtocol#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see metamodeloEnorm.NotificationProtocol#getName()
	 * @see #getNotificationProtocol()
	 * @generated
	 */
	EAttribute getNotificationProtocol_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link metamodeloEnorm.NotificationProtocol#getHasNotification <em>Has Notification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Notification</em>'.
	 * @see metamodeloEnorm.NotificationProtocol#getHasNotification()
	 * @see #getNotificationProtocol()
	 * @generated
	 */
	EReference getNotificationProtocol_HasNotification();

	/**
	 * Returns the meta object for the containment reference list '{@link metamodeloEnorm.NotificationProtocol#getHasAttribute <em>Has Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Attribute</em>'.
	 * @see metamodeloEnorm.NotificationProtocol#getHasAttribute()
	 * @see #getNotificationProtocol()
	 * @generated
	 */
	EReference getNotificationProtocol_HasAttribute();

	/**
	 * Returns the meta object for the containment reference list '{@link metamodeloEnorm.NotificationProtocol#getFollowsConditions <em>Follows Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Follows Conditions</em>'.
	 * @see metamodeloEnorm.NotificationProtocol#getFollowsConditions()
	 * @see #getNotificationProtocol()
	 * @generated
	 */
	EReference getNotificationProtocol_FollowsConditions();

	/**
	 * Returns the meta object for class '{@link metamodeloEnorm.Sensor <em>Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sensor</em>'.
	 * @see metamodeloEnorm.Sensor
	 * @generated
	 */
	EClass getSensor();

	/**
	 * Returns the meta object for the attribute '{@link metamodeloEnorm.Sensor#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see metamodeloEnorm.Sensor#getName()
	 * @see #getSensor()
	 * @generated
	 */
	EAttribute getSensor_Name();

	/**
	 * Returns the meta object for the containment reference '{@link metamodeloEnorm.Sensor#getMapsThroughDataMapping <em>Maps Through Data Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Maps Through Data Mapping</em>'.
	 * @see metamodeloEnorm.Sensor#getMapsThroughDataMapping()
	 * @see #getSensor()
	 * @generated
	 */
	EReference getSensor_MapsThroughDataMapping();

	/**
	 * Returns the meta object for the containment reference list '{@link metamodeloEnorm.Sensor#getHasAttribute <em>Has Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Attribute</em>'.
	 * @see metamodeloEnorm.Sensor#getHasAttribute()
	 * @see #getSensor()
	 * @generated
	 */
	EReference getSensor_HasAttribute();

	/**
	 * Returns the meta object for the containment reference list '{@link metamodeloEnorm.Sensor#getFollowsConditions <em>Follows Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Follows Conditions</em>'.
	 * @see metamodeloEnorm.Sensor#getFollowsConditions()
	 * @see #getSensor()
	 * @generated
	 */
	EReference getSensor_FollowsConditions();

	/**
	 * Returns the meta object for class '{@link metamodeloEnorm.Conditions <em>Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conditions</em>'.
	 * @see metamodeloEnorm.Conditions
	 * @generated
	 */
	EClass getConditions();

	/**
	 * Returns the meta object for the attribute '{@link metamodeloEnorm.Conditions#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see metamodeloEnorm.Conditions#getName()
	 * @see #getConditions()
	 * @generated
	 */
	EAttribute getConditions_Name();

	/**
	 * Returns the meta object for the attribute '{@link metamodeloEnorm.Conditions#getReturnType <em>Return Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Return Type</em>'.
	 * @see metamodeloEnorm.Conditions#getReturnType()
	 * @see #getConditions()
	 * @generated
	 */
	EAttribute getConditions_ReturnType();

	/**
	 * Returns the meta object for the attribute '{@link metamodeloEnorm.Conditions#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Body</em>'.
	 * @see metamodeloEnorm.Conditions#getBody()
	 * @see #getConditions()
	 * @generated
	 */
	EAttribute getConditions_Body();

	/**
	 * Returns the meta object for the containment reference list '{@link metamodeloEnorm.Conditions#getMonitorsDataCore <em>Monitors Data Core</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Monitors Data Core</em>'.
	 * @see metamodeloEnorm.Conditions#getMonitorsDataCore()
	 * @see #getConditions()
	 * @generated
	 */
	EReference getConditions_MonitorsDataCore();

	/**
	 * Returns the meta object for the containment reference list '{@link metamodeloEnorm.Conditions#getHasAttributes <em>Has Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Attributes</em>'.
	 * @see metamodeloEnorm.Conditions#getHasAttributes()
	 * @see #getConditions()
	 * @generated
	 */
	EReference getConditions_HasAttributes();

	/**
	 * Returns the meta object for the containment reference list '{@link metamodeloEnorm.Conditions#getTriggersActions <em>Triggers Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Triggers Actions</em>'.
	 * @see metamodeloEnorm.Conditions#getTriggersActions()
	 * @see #getConditions()
	 * @generated
	 */
	EReference getConditions_TriggersActions();

	/**
	 * Returns the meta object for class '{@link metamodeloEnorm.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see metamodeloEnorm.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for the attribute '{@link metamodeloEnorm.Action#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see metamodeloEnorm.Action#getName()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_Name();

	/**
	 * Returns the meta object for the attribute '{@link metamodeloEnorm.Action#getReturnType <em>Return Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Return Type</em>'.
	 * @see metamodeloEnorm.Action#getReturnType()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_ReturnType();

	/**
	 * Returns the meta object for the attribute '{@link metamodeloEnorm.Action#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Body</em>'.
	 * @see metamodeloEnorm.Action#getBody()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_Body();

	/**
	 * Returns the meta object for the containment reference list '{@link metamodeloEnorm.Action#getActsOnActuator <em>Acts On Actuator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Acts On Actuator</em>'.
	 * @see metamodeloEnorm.Action#getActsOnActuator()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_ActsOnActuator();

	/**
	 * Returns the meta object for the containment reference list '{@link metamodeloEnorm.Action#getMaySendNotification <em>May Send Notification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>May Send Notification</em>'.
	 * @see metamodeloEnorm.Action#getMaySendNotification()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_MaySendNotification();

	/**
	 * Returns the meta object for the containment reference list '{@link metamodeloEnorm.Action#getHasAttributes <em>Has Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Attributes</em>'.
	 * @see metamodeloEnorm.Action#getHasAttributes()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_HasAttributes();

	/**
	 * Returns the meta object for class '{@link metamodeloEnorm.Notification <em>Notification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Notification</em>'.
	 * @see metamodeloEnorm.Notification
	 * @generated
	 */
	EClass getNotification();

	/**
	 * Returns the meta object for the attribute '{@link metamodeloEnorm.Notification#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see metamodeloEnorm.Notification#getName()
	 * @see #getNotification()
	 * @generated
	 */
	EAttribute getNotification_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link metamodeloEnorm.Notification#getHasAttribute <em>Has Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Attribute</em>'.
	 * @see metamodeloEnorm.Notification#getHasAttribute()
	 * @see #getNotification()
	 * @generated
	 */
	EReference getNotification_HasAttribute();

	/**
	 * Returns the meta object for class '{@link metamodeloEnorm.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see metamodeloEnorm.Attribute
	 * @generated
	 */
	EClass getAttribute();

	/**
	 * Returns the meta object for the attribute '{@link metamodeloEnorm.Attribute#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see metamodeloEnorm.Attribute#getName()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Name();

	/**
	 * Returns the meta object for the attribute '{@link metamodeloEnorm.Attribute#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see metamodeloEnorm.Attribute#getType()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Type();

	/**
	 * Returns the meta object for the attribute '{@link metamodeloEnorm.Attribute#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see metamodeloEnorm.Attribute#getValue()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Value();

	/**
	 * Returns the meta object for the containment reference list '{@link metamodeloEnorm.Attribute#getHasConditions <em>Has Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Conditions</em>'.
	 * @see metamodeloEnorm.Attribute#getHasConditions()
	 * @see #getAttribute()
	 * @generated
	 */
	EReference getAttribute_HasConditions();

	/**
	 * Returns the meta object for class '{@link metamodeloEnorm.List <em>List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List</em>'.
	 * @see metamodeloEnorm.List
	 * @generated
	 */
	EClass getList();

	/**
	 * Returns the meta object for the attribute '{@link metamodeloEnorm.List#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see metamodeloEnorm.List#getName()
	 * @see #getList()
	 * @generated
	 */
	EAttribute getList_Name();

	/**
	 * Returns the meta object for the attribute '{@link metamodeloEnorm.List#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see metamodeloEnorm.List#getType()
	 * @see #getList()
	 * @generated
	 */
	EAttribute getList_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link metamodeloEnorm.List#getHasAttributes <em>Has Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Attributes</em>'.
	 * @see metamodeloEnorm.List#getHasAttributes()
	 * @see #getList()
	 * @generated
	 */
	EReference getList_HasAttributes();

	/**
	 * Returns the meta object for class '{@link metamodeloEnorm.Datacore <em>Datacore</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Datacore</em>'.
	 * @see metamodeloEnorm.Datacore
	 * @generated
	 */
	EClass getDatacore();

	/**
	 * Returns the meta object for the attribute '{@link metamodeloEnorm.Datacore#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see metamodeloEnorm.Datacore#getName()
	 * @see #getDatacore()
	 * @generated
	 */
	EAttribute getDatacore_Name();

	/**
	 * Returns the meta object for the containment reference '{@link metamodeloEnorm.Datacore#getHasList <em>Has List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Has List</em>'.
	 * @see metamodeloEnorm.Datacore#getHasList()
	 * @see #getDatacore()
	 * @generated
	 */
	EReference getDatacore_HasList();

	/**
	 * Returns the meta object for class '{@link metamodeloEnorm.DataMapping <em>Data Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Mapping</em>'.
	 * @see metamodeloEnorm.DataMapping
	 * @generated
	 */
	EClass getDataMapping();

	/**
	 * Returns the meta object for the attribute '{@link metamodeloEnorm.DataMapping#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see metamodeloEnorm.DataMapping#getName()
	 * @see #getDataMapping()
	 * @generated
	 */
	EAttribute getDataMapping_Name();

	/**
	 * Returns the meta object for the containment reference '{@link metamodeloEnorm.DataMapping#getStoresDatainDataCore <em>Stores Datain Data Core</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Stores Datain Data Core</em>'.
	 * @see metamodeloEnorm.DataMapping#getStoresDatainDataCore()
	 * @see #getDataMapping()
	 * @generated
	 */
	EReference getDataMapping_StoresDatainDataCore();

	/**
	 * Returns the meta object for enum '{@link metamodeloEnorm.DataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Data Type</em>'.
	 * @see metamodeloEnorm.DataType
	 * @generated
	 */
	EEnum getDataType();

	/**
	 * Returns the meta object for enum '{@link metamodeloEnorm.ListDataType <em>List Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>List Data Type</em>'.
	 * @see metamodeloEnorm.ListDataType
	 * @generated
	 */
	EEnum getListDataType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MetamodeloEnormFactory getMetamodeloEnormFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link metamodeloEnorm.impl.ScenarioImpl <em>Scenario</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodeloEnorm.impl.ScenarioImpl
		 * @see metamodeloEnorm.impl.MetamodeloEnormPackageImpl#getScenario()
		 * @generated
		 */
		EClass SCENARIO = eINSTANCE.getScenario();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCENARIO__NAME = eINSTANCE.getScenario_Name();

		/**
		 * The meta object literal for the '<em><b>Has Actuator</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENARIO__HAS_ACTUATOR = eINSTANCE.getScenario_HasActuator();

		/**
		 * The meta object literal for the '<em><b>Has Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENARIO__HAS_ATTRIBUTES = eINSTANCE.getScenario_HasAttributes();

		/**
		 * The meta object literal for the '{@link metamodeloEnorm.impl.ActuatorImpl <em>Actuator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodeloEnorm.impl.ActuatorImpl
		 * @see metamodeloEnorm.impl.MetamodeloEnormPackageImpl#getActuator()
		 * @generated
		 */
		EClass ACTUATOR = eINSTANCE.getActuator();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTUATOR__NAME = eINSTANCE.getActuator_Name();

		/**
		 * The meta object literal for the '<em><b>Is Connected To</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTUATOR__IS_CONNECTED_TO = eINSTANCE.getActuator_IsConnectedTo();

		/**
		 * The meta object literal for the '<em><b>Follows Conditions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTUATOR__FOLLOWS_CONDITIONS = eINSTANCE.getActuator_FollowsConditions();

		/**
		 * The meta object literal for the '<em><b>Follows Notification Protocol</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTUATOR__FOLLOWS_NOTIFICATION_PROTOCOL = eINSTANCE.getActuator_FollowsNotificationProtocol();

		/**
		 * The meta object literal for the '<em><b>Has Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTUATOR__HAS_ATTRIBUTES = eINSTANCE.getActuator_HasAttributes();

		/**
		 * The meta object literal for the '{@link metamodeloEnorm.impl.NotificationProtocolImpl <em>Notification Protocol</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodeloEnorm.impl.NotificationProtocolImpl
		 * @see metamodeloEnorm.impl.MetamodeloEnormPackageImpl#getNotificationProtocol()
		 * @generated
		 */
		EClass NOTIFICATION_PROTOCOL = eINSTANCE.getNotificationProtocol();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOTIFICATION_PROTOCOL__NAME = eINSTANCE.getNotificationProtocol_Name();

		/**
		 * The meta object literal for the '<em><b>Has Notification</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NOTIFICATION_PROTOCOL__HAS_NOTIFICATION = eINSTANCE.getNotificationProtocol_HasNotification();

		/**
		 * The meta object literal for the '<em><b>Has Attribute</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NOTIFICATION_PROTOCOL__HAS_ATTRIBUTE = eINSTANCE.getNotificationProtocol_HasAttribute();

		/**
		 * The meta object literal for the '<em><b>Follows Conditions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NOTIFICATION_PROTOCOL__FOLLOWS_CONDITIONS = eINSTANCE.getNotificationProtocol_FollowsConditions();

		/**
		 * The meta object literal for the '{@link metamodeloEnorm.impl.SensorImpl <em>Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodeloEnorm.impl.SensorImpl
		 * @see metamodeloEnorm.impl.MetamodeloEnormPackageImpl#getSensor()
		 * @generated
		 */
		EClass SENSOR = eINSTANCE.getSensor();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENSOR__NAME = eINSTANCE.getSensor_Name();

		/**
		 * The meta object literal for the '<em><b>Maps Through Data Mapping</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SENSOR__MAPS_THROUGH_DATA_MAPPING = eINSTANCE.getSensor_MapsThroughDataMapping();

		/**
		 * The meta object literal for the '<em><b>Has Attribute</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SENSOR__HAS_ATTRIBUTE = eINSTANCE.getSensor_HasAttribute();

		/**
		 * The meta object literal for the '<em><b>Follows Conditions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SENSOR__FOLLOWS_CONDITIONS = eINSTANCE.getSensor_FollowsConditions();

		/**
		 * The meta object literal for the '{@link metamodeloEnorm.impl.ConditionsImpl <em>Conditions</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodeloEnorm.impl.ConditionsImpl
		 * @see metamodeloEnorm.impl.MetamodeloEnormPackageImpl#getConditions()
		 * @generated
		 */
		EClass CONDITIONS = eINSTANCE.getConditions();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITIONS__NAME = eINSTANCE.getConditions_Name();

		/**
		 * The meta object literal for the '<em><b>Return Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITIONS__RETURN_TYPE = eINSTANCE.getConditions_ReturnType();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITIONS__BODY = eINSTANCE.getConditions_Body();

		/**
		 * The meta object literal for the '<em><b>Monitors Data Core</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITIONS__MONITORS_DATA_CORE = eINSTANCE.getConditions_MonitorsDataCore();

		/**
		 * The meta object literal for the '<em><b>Has Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITIONS__HAS_ATTRIBUTES = eINSTANCE.getConditions_HasAttributes();

		/**
		 * The meta object literal for the '<em><b>Triggers Actions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITIONS__TRIGGERS_ACTIONS = eINSTANCE.getConditions_TriggersActions();

		/**
		 * The meta object literal for the '{@link metamodeloEnorm.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodeloEnorm.impl.ActionImpl
		 * @see metamodeloEnorm.impl.MetamodeloEnormPackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__NAME = eINSTANCE.getAction_Name();

		/**
		 * The meta object literal for the '<em><b>Return Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__RETURN_TYPE = eINSTANCE.getAction_ReturnType();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__BODY = eINSTANCE.getAction_Body();

		/**
		 * The meta object literal for the '<em><b>Acts On Actuator</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION__ACTS_ON_ACTUATOR = eINSTANCE.getAction_ActsOnActuator();

		/**
		 * The meta object literal for the '<em><b>May Send Notification</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION__MAY_SEND_NOTIFICATION = eINSTANCE.getAction_MaySendNotification();

		/**
		 * The meta object literal for the '<em><b>Has Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION__HAS_ATTRIBUTES = eINSTANCE.getAction_HasAttributes();

		/**
		 * The meta object literal for the '{@link metamodeloEnorm.impl.NotificationImpl <em>Notification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodeloEnorm.impl.NotificationImpl
		 * @see metamodeloEnorm.impl.MetamodeloEnormPackageImpl#getNotification()
		 * @generated
		 */
		EClass NOTIFICATION = eINSTANCE.getNotification();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOTIFICATION__NAME = eINSTANCE.getNotification_Name();

		/**
		 * The meta object literal for the '<em><b>Has Attribute</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NOTIFICATION__HAS_ATTRIBUTE = eINSTANCE.getNotification_HasAttribute();

		/**
		 * The meta object literal for the '{@link metamodeloEnorm.impl.AttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodeloEnorm.impl.AttributeImpl
		 * @see metamodeloEnorm.impl.MetamodeloEnormPackageImpl#getAttribute()
		 * @generated
		 */
		EClass ATTRIBUTE = eINSTANCE.getAttribute();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__NAME = eINSTANCE.getAttribute_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__TYPE = eINSTANCE.getAttribute_Type();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__VALUE = eINSTANCE.getAttribute_Value();

		/**
		 * The meta object literal for the '<em><b>Has Conditions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE__HAS_CONDITIONS = eINSTANCE.getAttribute_HasConditions();

		/**
		 * The meta object literal for the '{@link metamodeloEnorm.impl.ListImpl <em>List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodeloEnorm.impl.ListImpl
		 * @see metamodeloEnorm.impl.MetamodeloEnormPackageImpl#getList()
		 * @generated
		 */
		EClass LIST = eINSTANCE.getList();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIST__NAME = eINSTANCE.getList_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIST__TYPE = eINSTANCE.getList_Type();

		/**
		 * The meta object literal for the '<em><b>Has Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIST__HAS_ATTRIBUTES = eINSTANCE.getList_HasAttributes();

		/**
		 * The meta object literal for the '{@link metamodeloEnorm.impl.DatacoreImpl <em>Datacore</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodeloEnorm.impl.DatacoreImpl
		 * @see metamodeloEnorm.impl.MetamodeloEnormPackageImpl#getDatacore()
		 * @generated
		 */
		EClass DATACORE = eINSTANCE.getDatacore();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATACORE__NAME = eINSTANCE.getDatacore_Name();

		/**
		 * The meta object literal for the '<em><b>Has List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATACORE__HAS_LIST = eINSTANCE.getDatacore_HasList();

		/**
		 * The meta object literal for the '{@link metamodeloEnorm.impl.DataMappingImpl <em>Data Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodeloEnorm.impl.DataMappingImpl
		 * @see metamodeloEnorm.impl.MetamodeloEnormPackageImpl#getDataMapping()
		 * @generated
		 */
		EClass DATA_MAPPING = eINSTANCE.getDataMapping();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_MAPPING__NAME = eINSTANCE.getDataMapping_Name();

		/**
		 * The meta object literal for the '<em><b>Stores Datain Data Core</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_MAPPING__STORES_DATAIN_DATA_CORE = eINSTANCE.getDataMapping_StoresDatainDataCore();

		/**
		 * The meta object literal for the '{@link metamodeloEnorm.DataType <em>Data Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodeloEnorm.DataType
		 * @see metamodeloEnorm.impl.MetamodeloEnormPackageImpl#getDataType()
		 * @generated
		 */
		EEnum DATA_TYPE = eINSTANCE.getDataType();

		/**
		 * The meta object literal for the '{@link metamodeloEnorm.ListDataType <em>List Data Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodeloEnorm.ListDataType
		 * @see metamodeloEnorm.impl.MetamodeloEnormPackageImpl#getListDataType()
		 * @generated
		 */
		EEnum LIST_DATA_TYPE = eINSTANCE.getListDataType();

	}

} //MetamodeloEnormPackage
