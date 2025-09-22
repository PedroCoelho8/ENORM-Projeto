package org.conveyor.belt.actions;

import org.conveyor.belt.Action;
import org.conveyor.belt.Sensor;

public class StatusReportAction implements Action {
    private Sensor sensor;

    public StatusReportAction(Sensor sensor) {
        this.sensor = sensor;
    }

    @Override
    public void execute() {
        int count = sensor.getDataMapping().getCount();
        System.out.println("📊 " + sensor.getSensorType() + " - Items processed: " + count);
    }
}
