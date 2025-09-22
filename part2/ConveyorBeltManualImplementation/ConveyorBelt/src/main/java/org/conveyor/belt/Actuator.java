package org.conveyor.belt;

import org.conveyor.belt.actions.StatusReportAction;

import java.util.ArrayList;
import java.util.List;

public class Actuator {
    private Sensor sensor;
    private TimeController timeController;

    private List<Condition> conditions;
    private List<Action> actions;
    private String actuatorName;

    public Actuator(String actuatorName, Sensor sensor, TimeController timeController) {
        this.actuatorName = actuatorName;
        this.sensor = sensor;
        this.timeController = timeController;
        this.conditions = new ArrayList<>();
        this.actions = new ArrayList<>();
    }

    public void addCondition(Condition condition) {
        conditions.add(condition);
    }

    public void addAction(Action action) {
        actions.add(action);
    }

    public void runCycle() {
        System.out.println("\n--- " + actuatorName + " Cycle ---");

        sensor.detectItem();

        // Check conditions and execute actions
        for (int i = 0; i < conditions.size() && i < actions.size(); i++) {
            if (conditions.get(i).evaluate()) {
                actions.get(i).execute();
            }
        }

        // Always show status
        new StatusReportAction(sensor).execute();

        // Check time status
        String timeStatus = timeController.checkTimeStatus();
        if (!timeStatus.equals("NORMAL")) {
            System.out.println("⏰ Time Status: " + timeStatus);
        }
    }

    public Sensor getSensor() {
        return sensor;
    }

    public TimeController getTimeController() {
        return timeController;
    }
}
