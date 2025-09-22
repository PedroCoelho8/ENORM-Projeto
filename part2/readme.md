# ENORM Project, Part 2 - Team Report

[TOC]

## Design Concrete Syntax for the DSL

The goal of this section is to define the concrete syntax of the Domain-Specific Language (DSL) designed for the automation scenarios. This syntax includes both graphical and textual representations, which aim to facilitate the creation, visualization, and validation of models by domain experts.

The notations were designed with intuitiveness and clarity in mind, ensuring that each element from the metamodel can be easily identified and manipulated using appropriate tooling. The graphical syntax will be implemented using the Sirius platform, while the textual syntax is planned for implementation in MPS.


### Introduction

In this activity, we design the concrete syntax for the DSL created in the first project phase. This includes defining how each metamodel element will be represented both graphically and textually.

The design choices aim to strike a balance between visual distinctiveness and alignment with domain concepts, so that the resulting editors are intuitive and practical for end users. These specifications will later be implemented using the appropriate tools (Sirius for graphical, MPS for textual).


### Graphical Syntax 

In order to represent the models graphically we will follow these rules, which were defined on the first project and will now be reused

- The Scenario will be represented by a white Dot
- The Actuator will be represented by a black Diamond 
- The Sensor will be represented by blue Ellipse
- The DataMapping will be represented by brown Ellipse
- The DataCore will be represented by gray Square
- The List will be represented by green Ellipse
- The Attribute will be represented by orange Diamond
- The Conditions will be represented by purple Square
- The NotificationProtocol will be represented by red Square
- The Action will be represented by yellow Ellipse
- The Notification will be represented by white Square

These visual elements will be used in the Sirius graphical editor implementation, ensuring each type of element is visually distinguishable.

The chosen shapes and colors aim to reflect the semantics of each concept: for instance, sensors and data mappings use ellipses to indicate data flow, while square shapes are used for decision-based components like conditions and notifications.

### Textual Syntax

- Action: 

*name*(*listOfAttributes*): *returnType* {\n *body* \n} \n *listOfActuatorsOrNull* *notificationOrNull*

- Actuator:

*name* *listOfAttributesOrNull* *SensorName* *NotificationProtocolName* -> *listOfConditionsOrNull*

- Attribute:

*name*: *type* = *value*, \n *listOfConditionsOrNull*

- Condition:

*name*(*listOfAttributesOrNull*): *returnType* {\n *body*\n} \n *listOfDatacoreOrNull* \n *listOfActionsOrNull*

- Datacore:

*name*, *listOfAttributesOrNull*

- DataMapping:

*name*, *Datacore*

- List

*name* *listDataType*<*attributesOrNull*>

- Notification

*name*: *messageValue*

- NotificationProtocol

*name* *listOfAttributesOrNull*, *listOfNotificationOrNull* -> *listOfConditionsOrNull*

- Scenario

*name* *listOfAttributesOrNull*: \n*listOfActuatorsOrNull*

- Sensor

*name* *listOfAttributesOrNull* *dataMapping* -> *listOfConditionsOrNull*

### Summary

These syntaxes will guide the implementation of model editors using Sirius (graphical) and MPS (textual), ensuring the DSL is usable both by technical users and domain experts. 

They also set the foundation for code generation in future phases of the project.

## Specify Common Features for Applications of the Domain

This part of the delivery will be to identify how we could use the metamodel and the modelling of the scenarios described by the tools to implement a functional JavaCode and a Demo of this application.

### Selected Language and Frameworks

The applications are going to have to be written with:

- Java 17
- Maven

These languages align with the developers knowledge for a fast and demonstrative demo for a backend server. 

### Code Architecture

![Action.png](Images%2FArchitecture.png)

Although this code architecture is simple, this has a simple demonstration of a main running as the Scenarios. And therefore, it won't need much more developed interface.

The following aspects will be analyzed in the next topic.

### Common Features of the Generated Code

- **Main**: The Main is going to be one of our Scenarios. This Scenario will basically simulate the stimulus that would allow the rest of the scenario to be simulated;

- **Scenario**: This is the part of the application root of the rest of the problems, described in the generated puml models;

- **Actuator**, **Sensor**, **Condition**, **Datacore**, **Action**: These are the remaining parts of the service which will act on the scenario and give the responses for the system to start, stop or make any other type of actions.

### Support for Extensions

There is only need for the java 17 installed, which is available at the oracle's page.

Maven is free and there is no need for mvn install or any pom.xml dependencies.

### Summary

The prototypes are going to be rather simple, but there are simple ways to make all the given scenarios.

## Implement Prototypes of Applications of the Domain

The prototypes developed were 1 and 2, because we are only 2 members and each of us got that one to make the model in plant UML on the 1st phase.

#### Scenario 1 - Conveyor Belt

This scenario is better described in the tool1-mps, but in a sum:

- All architected information is correctly defined;
- There is a divergence between the models in puml and the developed program, but that's to be expected in some ways
- These are features to be expected. But the metamodel allows us to make these changes when we are looking at it more specifically

The specifics on this topic are not really dived into too deeply, but there is an idea to be gotten from the tool1-mps's report: the system shows all the interactions possible.

This scenario was also correctly developed in terms of its Sensors, datacores etc, but in terms of actions, conditions and attributes it isn't close to what was imagined.

#### Scenario 2

This scenario simulates a Waste Deposit area where environmental conditions are monitored to ensure safety. It includes three shared sensors (e.g., for gas, temperature, or pressure), which feed data into two actuators: one for lights and one for a horn.

All sensors are read once per cycle, and the normalized values are stored in a shared data structure (DataCore). The average of these readings determines the safety level, which are treated in a Condition.:

Normal: Green light, no horn, sends a notification that the light is green;

Alert: Yellow light, no horn, sends a notification that the light is yellow;

Danger: Red light, horn activated, sends a notification that the light is red and another telling that the horn is on.

Each Actuator (Lights and Horn) evaluates the current level (based on the values stored on the datacore that are read by the sensors) using a LevelEvaluator and reacts accordingly via mapped Actions.

This prototype aligns with the core metamodel and shows how the architecture can adapt to safety-critical domains like a Waste Deposit.

## Identify Commonality and Variability in the Code

This part will analyze how both of the developed apps were common, variable or even breaking the metamodel defined

### Common Parts

The common parts are already correctly defined in the architecture.

The base is not breaking any problems with either architecture nor it is breaking the metamodel, which is a good sign.

The demonstration shows the various situations and what executes at each time, as well as the performance of each of the scenarios' situation, identifying all the possible outcomes of each Scenario.

### Variable Parts

There aren't many variable parts but here is the picture outside the main model of the Conveyor belt's implementation:


![ConveyorBelt-Impl.PNG](Images%2FConveyorBelt-Impl.PNG)

And here is the picture outside the main model from the waste deposit's implementation:

![WasteDeposit-Impl.PNG](Images%2FWasteDeposit-Impl.PNG)

- one has 2 models for the actions and conditions, the other has a model for all the implementations;
- the names are more revealing on the first one, but the domain model from the second one is more explicit to the various implementations here detailed.

These aren't many differences. Also the list of attributes in class vary, or even lists of sensors, but all of these changes are to be expected.

Our metamodel was developed in a way that it enables a lot of 0 to N connections to make this variation easy, but also to limit our metamodel to these types of scenarios.

### Mapping Variable Parts to Metamodel Elements

![General-Impl.PNG](Images%2FGeneral-Impl.PNG)

![General-Impl-2.PNG](Images%2FGeneral-Impl-2.PNG)
This general implementation allows to map mostly like our metamodel elements

- *picture* --> *metamodel*
- Action --> Action
- Actuator --> Actuator
- Condition --> Condition
- ConveyorBeltMain/Main --> Scenario
- Datacore --> Datacore
- DataMapping --> DataMapping
- Main --> There is no main developed
- Sensor --> Sensor
- TimeController --> NotificationProtocol

![ConveyorBelt-Impl.PNG](Images%2FConveyorBelt-Impl.PNG)

In this case, there is no harsh in identifying by the metamodel

Action --> Action
Condition --> Condition

![WasteDeposit-Impl.PNG](Images%2FWasteDeposit-Impl.PNG)

In the second case, it is a bit more difficult to identify, but here they are:

- HornAction/LightAction --> Action
- LevelEvaluator --> Condition

The remaining are not attached to the metamodel, but rather to the domain model of this application.

## Design and Implement Code Generation

You might add some text here.

### Design the Templates/Rules

You might add some text here.

### Common Parts Specification

You might add some text here.

### Variable Parts Specification

You might add some text here.


## Generate Applications

You might add some text here.

### Compatibility of Generated Code

You might add some text here.

### Testing Code Combination

You might add some text here.

### Issues and Limitation Found 

You might add some text here.

