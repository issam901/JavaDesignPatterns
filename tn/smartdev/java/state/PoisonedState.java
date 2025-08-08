package tn.smartdev.java.state;

public class PoisonedState implements State {
    @Override
    public void attack() {
        System.out.println("The pokemon is poisoned and cannot attack!");
    }

    @Override
    public void defend() {
        System.out.println("The pokemon is poisoned and cannot defend!");
    }
}
