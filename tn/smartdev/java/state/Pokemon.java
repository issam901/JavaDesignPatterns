package tn.smartdev.java.state;

public class Pokemon {
    private State state;

    public Pokemon() {
        state = new NormalState();
    }

    public void setState(State state) {
        this.state = state;
    }

    public void attack() {
        state.attack();
    }

    public void defend() {
        state.defend();
    }
}
