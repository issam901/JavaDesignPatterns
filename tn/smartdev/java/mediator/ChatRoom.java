package tn.smartdev.java.mediator;

import java.util.Date;

public class ChatRoom {
    public static void showMessage(Trainer trainer, String message) {
        System.out.println(new Date().toString() + " [" + trainer.getName() + "] : " + message);
    }
}
