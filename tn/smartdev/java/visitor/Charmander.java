package tn.smartdev.java.visitor;

public class Charmander implements Pokemon {
    @Override
    public void accept(PokemonVisitor pokemonVisitor) {
        pokemonVisitor.visit(this);
    }
}
