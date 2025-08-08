package tn.smartdev.java.composite;

public class Main {

    public static void main(String[] args) {
        Pokemon pikachu = new Pikachu();
        Pokemon charmander = new Charmander();

        PokemonTeam team = new PokemonTeam();
        team.addPokemon(pikachu);
        team.addPokemon(charmander);

        team.attack();
    }
}
