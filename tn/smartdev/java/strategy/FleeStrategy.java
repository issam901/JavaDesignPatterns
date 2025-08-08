package tn.smartdev.java.strategy;

public class FleeStrategy implements Strategy {
    @Override
    public void execute() {
        System.out.println("The pokemon flees!");
    }
}
