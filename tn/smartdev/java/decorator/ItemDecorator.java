package tn.smartdev.java.decorator;

public class ItemDecorator extends PokemonDecorator {

    public ItemDecorator(Pokemon decoratedPokemon) {
        super(decoratedPokemon);
    }

    @Override
    public String attack() {
        return decoratedPokemon.attack() + " The pokemon is holding an item!";
    }
}
