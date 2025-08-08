package tn.smartdev.java.visitor;

public class Main {
    public static void main(String[] args) {
        Pokemon pikachu = new Pikachu();
        Pokemon charmander = new Charmander();

        PokemonVisitor pokemonDisplayVisitor = new PokemonDisplayVisitor();

        pikachu.accept(pokemonDisplayVisitor);
        charmander.accept(pokemonDisplayVisitor);
    }
}
