package tn.smartdev.java.strategy;

public class Main {
    public static void main(String[] args) {
        Pokemon pokemon = new Pokemon(new AttackStrategy());
        pokemon.executeStrategy();

        pokemon = new Pokemon(new DefendStrategy());
        pokemon.executeStrategy();

        pokemon = new Pokemon(new FleeStrategy());
        pokemon.executeStrategy();
    }
}
