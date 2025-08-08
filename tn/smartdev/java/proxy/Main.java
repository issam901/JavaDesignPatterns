package tn.smartdev.java.proxy;

public class Main {

    public static void main(String[] args) {
        Pokedex pokedex = new PokedexProxy();

        // Data will be loaded from the database
        pokedex.getPokemonData("Pikachu");
        System.out.println("");

        // Data will not be loaded from the database again
        pokedex.getPokemonData("Charmander");
    }
}
