package tn.smartdev.java.factory;

import tn.smartdev.java.generic.Pokemon;
import tn.smartdev.java.generic.PokemonType;

public class PokemonFactory {

    public static Pokemon getPokemon(PokemonType pokemonType) {
        switch (pokemonType) {
            case LAND -> {
                return new LandPokemon();
            }
            case WATER -> {
                return new WaterPokemon();
            }
            case FIRE -> {
                return new FirePokemon();
            }
            default -> {
                return null;
            }
        }
    }

}