package org.conveyor.belt.actions;

import org.conveyor.belt.Action;

public class WarningAction implements Action {
    private String message;

    public WarningAction(String message) {
        this.message = message;
    }

    @Override
    public void execute() {
        System.out.println(" WARNING: " + message);
    }
}
