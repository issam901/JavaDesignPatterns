package tn.smartdev.java.memento;

public class Main {
    public static void main(String[] args) {
        Pokemon pokemon = new Pokemon();
        Pokedex pokedex = new Pokedex();

        pokemon.setState("Pikachu, Level 5");
        pokedex.add(pokemon.saveStateToMemento());

        pokemon.setState("Pikachu, Level 6");
        pokedex.add(pokemon.saveStateToMemento());

        pokemon.setState("Raichu, Level 35");
        System.out.println("Current State: " + pokemon.getState());

        pokemon.getStateFromMemento(pokedex.get(0));
        System.out.println("First saved State: " + pokemon.getState());

        pokemon.getStateFromMemento(pokedex.get(1));
        System.out.println("Second saved State: " + pokemon.getState());
    }
}
