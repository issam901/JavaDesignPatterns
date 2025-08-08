package tn.smartdev.java.decorator;

public abstract class PokemonDecorator implements Pokemon {
    protected Pokemon decoratedPokemon;

    public PokemonDecorator(Pokemon decoratedPokemon) {
        this.decoratedPokemon = decoratedPokemon;
    }

    public String attack() {
        return decoratedPokemon.attack();
    }
}
