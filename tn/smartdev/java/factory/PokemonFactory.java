package tn.smartdev.java.factory;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.smartdev.java.generic.Pokemon;
import tn.smartdev.java.generic.PokemonType;

public class PokemonFactory {

    public static @Nullable Pokemon getPokemon(@NotNull PokemonType pokemonType) {
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