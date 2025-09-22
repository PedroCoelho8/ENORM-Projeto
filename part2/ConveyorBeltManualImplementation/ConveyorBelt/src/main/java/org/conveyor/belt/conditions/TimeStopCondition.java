package org.conveyor.belt.conditions;

import org.conveyor.belt.Condition;
import org.conveyor.belt.TimeController;

public class TimeStopCondition implements Condition {
    private TimeController controller;

    public TimeStopCondition(TimeController controller) {
        this.controller = controller;
    }

    @Override
    public boolean evaluate() {
        String status = controller.checkTimeStatus();
        return status.equals(TimeController.STOPMESSAGE);
    }
}
