package tn.smartdev.java.state;

public class NormalState implements State {
    @Override
    public void attack() {
        System.out.println("The pokemon attacks normally.");
    }

    @Override
    public void defend() {
        System.out.println("The pokemon defends normally.");
    }
}
