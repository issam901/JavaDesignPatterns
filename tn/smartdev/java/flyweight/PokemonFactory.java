package tn.smartdev.java.flyweight;

import java.util.HashMap;

public class PokemonFactory {
    private static final HashMap<String, Pokemon> pokemonMap = new HashMap<>();

    public static Pokemon getPokemon(String name) {
        Pokemon pokemon = pokemonMap.get(name);

        if (pokemon == null) {
            switch (name) {
                case "Pikachu":
                    pokemon = new Pikachu();
                    break;
                // We could add more pokemon here
            }
            pokemonMap.put(name, pokemon);
        }
        return pokemon;
    }
}
