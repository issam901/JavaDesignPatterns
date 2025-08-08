package tn.smartdev.java.template;

public class WildPokemonBattle extends PokemonBattle {
    @Override
    void startBattle() {
        System.out.println("A wild pokemon appeared!");
    }

    @Override
    void endBattle() {
        System.out.println("You caught the pokemon!");
    }
}
