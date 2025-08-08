package tn.smartdev.java.state;

public class ParalyzedState implements State {
    @Override
    public void attack() {
        System.out.println("The pokemon is paralyzed and cannot attack!");
    }

    @Override
    public void defend() {
        System.out.println("The pokemon is paralyzed and cannot defend!");
    }
}
