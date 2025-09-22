package org.conveyor.belt.conditions;

import org.conveyor.belt.Condition;
import org.conveyor.belt.Sensor;

public class ItemCountCondition implements Condition {
    private Sensor sensor;
    private int threshold;

    public ItemCountCondition(Sensor sensor, int threshold) {
        this.sensor = sensor;
        this.threshold = threshold;
    }

    @Override
    public boolean evaluate() {
        int count = sensor.getDataMapping().getCount();
        return count >= threshold;
    }
}
