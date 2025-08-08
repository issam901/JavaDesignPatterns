package tn.smartdev.java.strategy;

public class Pokemon {
    private Strategy strategy;

    public Pokemon(Strategy strategy) {
        this.strategy = strategy;
    }

    public void executeStrategy() {
        strategy.execute();
    }
}
