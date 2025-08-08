package tn.smartdev.java.decorator;

public class LevelUpDecorator extends PokemonDecorator {

    public LevelUpDecorator(Pokemon decoratedPokemon) {
        super(decoratedPokemon);
    }

    @Override
    public String attack() {
        return decoratedPokemon.attack() + " The attack is stronger!";
    }
}
