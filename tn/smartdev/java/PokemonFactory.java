package tn.smartdev.java;

import tn.smartdev.java.utils.*;

public class PokemonFactory {

    public Pokemon getPokemon(String pokemonType) {
        switch (pokemonType) {
            case "Land":
                return new LandPokemon();
            case "Water":
                return new WaterPokemon();
            case "Fire":
                return new FirePokemon();
            default:
                return null;
        }
    }

}