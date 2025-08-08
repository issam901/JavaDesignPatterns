package tn.smartdev.java.facade;

public class Main {

    public static void main(String[] args) {
        PokemonCenter pokemonCenter = new PokemonCenter();

        pokemonCenter.healPokemon();
        pokemonCenter.accessPokemonPC();
        pokemonCenter.accessPokeMart();
    }
}
