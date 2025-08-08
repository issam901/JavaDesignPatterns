package tn.smartdev.java.strategy;

public class AttackStrategy implements Strategy {
    @Override
    public void execute() {
        System.out.println("The pokemon attacks!");
    }
}
