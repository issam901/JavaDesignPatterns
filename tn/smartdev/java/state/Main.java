package tn.smartdev.java.state;

public class Main {
    public static void main(String[] args) {
        Pokemon pokemon = new Pokemon();

        pokemon.attack();
        pokemon.defend();

        pokemon.setState(new PoisonedState());
        pokemon.attack();
        pokemon.defend();

        pokemon.setState(new ParalyzedState());
        pokemon.attack();
        pokemon.defend();
    }
}
