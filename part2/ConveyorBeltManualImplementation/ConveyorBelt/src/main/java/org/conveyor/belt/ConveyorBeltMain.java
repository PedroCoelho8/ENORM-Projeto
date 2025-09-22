package org.conveyor.belt;

import org.conveyor.belt.actions.ResetAction;
import org.conveyor.belt.actions.StopAction;
import org.conveyor.belt.actions.WarningAction;
import org.conveyor.belt.conditions.ItemCountCondition;
import org.conveyor.belt.conditions.TimeStopCondition;
import org.conveyor.belt.conditions.TimeWarningCondition;

public class ConveyorBeltMain {
    private String id;
    private Actuator entryDevice;
    private Actuator exitDevice;
    private TimeController systemTimeController;

    // System state management
    private boolean systemStarted = false;
    private boolean firstPersonEntered = false;

    public ConveyorBeltMain(String id) {
        this.id = id;
        this.systemTimeController = new TimeController();
        setupDevices();
    }

    private void setupDevices() {
        // Create datacores
        Datacore entryDatacore = new Datacore();
        Datacore exitDatacore = new Datacore();

        // Create data mappings
        DataMapping entryMapping = new DataMapping(entryDatacore);
        DataMapping exitMapping = new DataMapping(exitDatacore);

        // Create sensors
        Sensor entrySensor = new Sensor("Entry", entryMapping);
        Sensor exitSensor = new Sensor("Exit", exitMapping);

        // Create individual time controllers for devices (keep original functionality)
        TimeController entryTimeController = new TimeController();
        TimeController exitTimeController = new TimeController();

        // Create actuators
        entryDevice = new Actuator("Entry Device", entrySensor, entryTimeController);
        exitDevice = new Actuator("Exit Device", exitSensor, exitTimeController);

        // Setup entry device conditions and actions
        entryDevice.addCondition(new ItemCountCondition(entrySensor, 5));
        entryDevice.addAction(new WarningAction("Entry device reaching capacity"));

        entryDevice.addCondition(new TimeWarningCondition(entryTimeController));
        entryDevice.addAction(new WarningAction("Entry device time warning"));

        entryDevice.addCondition(new TimeStopCondition(entryTimeController));
        entryDevice.addAction(new StopAction("Entry device"));

        // Setup exit device conditions and actions
        exitDevice.addCondition(new ItemCountCondition(exitSensor, 3));
        exitDevice.addAction(new WarningAction("Exit device processing items"));

        exitDevice.addCondition(new ItemCountCondition(exitSensor, 7));
        exitDevice.addAction(new ResetAction(exitTimeController));

        exitDevice.addCondition(new TimeStopCondition(exitTimeController));
        exitDevice.addAction(new StopAction("Exit device"));
    }

    public void startSystem(int currentSecond) {
        if (!systemStarted && currentSecond >= 6) {
            systemStarted = true;
            System.out.println(">>> CONVEYOR BELT SYSTEM STARTING <<<");
            System.out.println("System Status: STARTING UP");
            System.out.println("Belt Movement: INITIATING");
        }
    }

    public void startTimeController() {
        if (!firstPersonEntered) {
            firstPersonEntered = true;
            System.out.println(">>> TIME CONTROLLER STARTED <<<");
        }
    }

    public boolean isFirstPersonEntered() {
        return firstPersonEntered;
    }

    public void processTimeControllerEvents() {
        if (systemStarted && firstPersonEntered) {
            systemTimeController.incrementRunningTime();

            // Handle warnings
            if (systemTimeController.shouldShowWarning()) {
                System.out.println(">>> TIME CONTROLLER WARNING <<<");
                System.out.println("⚠️ " + TimeController.WARNINGMESSAGE);
                System.out.println("Belt running time: " + systemTimeController.getBeltRunningTime() + "s");
            }

            // Handle stoppage initiation
            if (systemTimeController.shouldStop() && !systemTimeController.isStoppageActive()) {
                systemTimeController.startStoppage();
                System.out.println(">>> TIME CONTROLLER STOPPAGE INITIATED <<<");
                System.out.println("Reason: Maximum operation time reached (60s running time)");
                System.out.println("Belt running time when stopped: " + systemTimeController.getBeltRunningTime() + "s");
            }
        }
    }

    public boolean processStoppage() {
        if (systemTimeController.isStoppageActive()) {
            boolean stoppageCompleted = systemTimeController.processStoppage();

            System.out.println("System Status: STOPPED - Time Controller Stop");
            System.out.println("Belt Movement: HALTED");
            System.out.println("Stoppage Duration: " + systemTimeController.getStoppageCounter() + "/5 seconds");

            if (stoppageCompleted) {
                System.out.println(">>> TIME CONTROLLER RESET - RESUMING OPERATION <<<");
                System.out.println(">>> NO MORE PEOPLE WILL BE ADDED <<<");
                System.out.println(">>> MINIMUM 30 SECOND PERIOD STARTING <<<");
                return true;
            }
        }
        return false;
    }

    public void checkMinimumPeriod(boolean beltIsEmpty) {
        if (systemTimeController.isMinimumPeriodComplete(beltIsEmpty)) {
            System.out.println(">>> MINIMUM PERIOD COMPLETED <<<");
            System.out.println("30 seconds have passed with no entries/exits");
            System.out.println(">>> SYSTEM SHUTDOWN - Final stop until simulation end <<<");
        }
    }

    public String getSystemStatus(int currentSecond) {
        if (currentSecond <= 5) {
            return "STARTUP";
        } else if (systemTimeController.isSystemShutdown()) {
            return "SHUTDOWN";
        } else if (systemTimeController.isStoppageActive()) {
            return "STOPPED";
        }  else {
            return "RUNNING";
        }
    }

    public void printSystemStatus(int currentSecond) {
        if (systemStarted) {
            System.out.println("=== CONVEYOR BELT SYSTEM " + id + " ===");

            String status = getSystemStatus(currentSecond);
            switch (status) {
                case "SHUTDOWN":
                    System.out.println("System Status: STOPPED - Minimum period completed, no activity");
                    System.out.println("Belt Movement: HALTED - Final shutdown state");
                    System.out.println("Time until simulation end: " + (120 - currentSecond) + "s");
                    break;
                case "STOPPED":
                    System.out.println("System Status: RUNNING - Post-stoppage minimum period");
                    System.out.println("Belt Movement: ACTIVE - No new entries allowed");
                    System.out.println("Stoppage running time: " + systemTimeController.getBeltRunningTime() + "s / 30s minimum");
                    break;
                default:
                    System.out.println("System Status: RUNNING - Normal operation");
                    System.out.println("Belt Movement: ACTIVE");
                    System.out.println("Belt running time: " + systemTimeController.getBeltRunningTime() + "s");
                    break;
            }
        }
    }
    public void printSystemSummary() {
        System.out.println("\n=== SYSTEM SUMMARY ===");
        System.out.println("Belt ID: " + id);

        int entryCount = entryDevice.getSensor().getDataMapping().getCount();
        int exitCount = exitDevice.getSensor().getDataMapping().getCount();

        System.out.println("Total entries: " + entryCount);
        System.out.println("Total exits: " + exitCount);
        System.out.println("Items on belt: " + (entryCount - exitCount));

        System.out.println("System running time: " + systemTimeController.getBeltRunningTime() + "s");
        System.out.println("Entry device time: " + entryDevice.getTimeController().getElapsedTime() + "s");
        System.out.println("Exit device time: " + exitDevice.getTimeController().getElapsedTime() + "s");
    }


    public Actuator getEntryDevice() {
        return entryDevice;
    }

    public Actuator getExitDevice() {
        return exitDevice;
    }

    public TimeController getSystemTimeController() {
        return systemTimeController;
    }

    public boolean canAddNewPerson() {
        return systemStarted;
    }

    public boolean isBeltStopped() {
        return systemTimeController.isStoppageActive();
    }
}