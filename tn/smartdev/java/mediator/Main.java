package tn.smartdev.java.mediator;

public class Main {
    public static void main(String[] args) {
        Trainer ash = new Trainer("Ash");
        Trainer misty = new Trainer("Misty");

        ash.sendMessage("Hi Misty!");
        misty.sendMessage("Hello Ash!");
    }
}
