package tn.smartdev.java.proxy;

public class RealPokedex implements Pokedex {

    public RealPokedex() {
        loadFromDatabase();
    }

    @Override
    public void getPokemonData(String pokemonName) {
        System.out.println("Fetching data for " + pokemonName);
    }

    private void loadFromDatabase() {
        System.out.println("Loading Pokedex data from database...");
    }
}
