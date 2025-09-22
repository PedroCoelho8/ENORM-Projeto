package org.conveyor.belt.actions;

import org.conveyor.belt.Action;
import org.conveyor.belt.TimeController;

public class ResetAction implements Action {
    private TimeController timeController;

    public ResetAction(TimeController timeController) {
        this.timeController = timeController;
    }

    @Override
    public void execute() {
        timeController.resetTimer();
        System.out.println("Timer reset");
    }
}
