package tn.smartdev.java.composite;

import java.util.ArrayList;
import java.util.List;

public class PokemonTeam implements Pokemon {

    private List<Pokemon> pokemonTeam = new ArrayList<Pokemon>();

    @Override
    public void attack() {
        for (Pokemon pokemon : pokemonTeam) {
            pokemon.attack();
        }
    }

    public void addPokemon(Pokemon pokemon) {
        pokemonTeam.add(pokemon);
    }

    public void removePokemon(Pokemon pokemon) {
        pokemonTeam.remove(pokemon);
    }
}
