package tn.smartdev.java.prototype;

import java.util.Hashtable;

public class PokemonStore {

    private static Hashtable<String, Pokemon> pokemonMap = new Hashtable<String, Pokemon>();

    public static Pokemon getPokemon(String pokemonName) {
        Pokemon cachedPokemon = pokemonMap.get(pokemonName);
        return (Pokemon) cachedPokemon.clone();
    }

    public static void loadCache() {
        Pikachu pikachu = new Pikachu();
        pokemonMap.put("Pikachu", pikachu);

        Charmander charmander = new Charmander();
        pokemonMap.put("Charmander", charmander);
    }
}
