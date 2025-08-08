package tn.smartdev.java.strategy;

public class DefendStrategy implements Strategy {
    @Override
    public void execute() {
        System.out.println("The pokemon defends!");
    }
}
