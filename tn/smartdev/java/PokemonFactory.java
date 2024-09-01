package tn.smartdev.java;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.smartdev.java.utils.*;

public class PokemonFactory {

    public @Nullable Pokemon getPokemon(@NotNull String pokemonType) {
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