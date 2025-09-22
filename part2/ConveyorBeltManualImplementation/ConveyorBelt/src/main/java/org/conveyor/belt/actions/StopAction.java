package org.conveyor.belt.actions;

import org.conveyor.belt.Action;

public class StopAction implements Action {
    private String deviceName;

    public StopAction(String deviceName) {
        this.deviceName = deviceName;
    }

    @Override
    public void execute() {
        System.out.println("STOPPING: " + deviceName);
    }
}
