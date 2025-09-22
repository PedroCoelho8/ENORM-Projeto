package org.example;

public class Notification {
    private final String message;

    public Notification(String message) {
        this.message = message;
    }

    public void send() {
        System.out.println("NOTIFICAÇÃO: " + message);
    }
}

