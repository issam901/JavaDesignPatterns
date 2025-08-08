package tn.smartdev.java.visitor;

public interface Pokemon {
    public void accept(PokemonVisitor pokemonVisitor);
}
