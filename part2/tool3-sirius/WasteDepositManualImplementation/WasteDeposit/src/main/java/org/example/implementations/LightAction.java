package org.example.implementations;

import org.example.Action;
import org.example.Notification;

public class LightAction implements Action {
    private final String cor;

    public LightAction(String cor) {
        this.cor = cor;
    }

    @Override
    public void execute() {
        Notification n = new Notification("A cor mudou para " + cor);
        n.send();
    }
}

