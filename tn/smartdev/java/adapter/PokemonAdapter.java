package tn.smartdev.java.adapter;

public class PokemonAdapter implements Pokemon {

    private WildPokemon wildPokemon;

    public PokemonAdapter(WildPokemon wildPokemon) {
        this.wildPokemon = wildPokemon;
    }

    @Override
    public void attack() {
        wildPokemon.roar();
    }

    @Override
    public void defend() {
        wildPokemon.run();
    }
}
