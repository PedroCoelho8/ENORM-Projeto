package org.example.implementations;

import org.example.Action;
import org.example.Notification;

public class HornAction implements Action {
    @Override
    public void execute() {
        Notification n = new Notification("A horn está ativa.");
        n.send();
    }
}
