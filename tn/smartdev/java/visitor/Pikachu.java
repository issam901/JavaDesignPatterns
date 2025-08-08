package tn.smartdev.java.visitor;

public class Pikachu implements Pokemon {
    @Override
    public void accept(PokemonVisitor pokemonVisitor) {
        pokemonVisitor.visit(this);
    }
}
