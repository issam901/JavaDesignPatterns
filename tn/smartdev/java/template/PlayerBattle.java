package tn.smartdev.java.template;

public class PlayerBattle extends PokemonBattle {
    @Override
    void startBattle() {
        System.out.println("A trainer wants to battle!");
    }

    @Override
    void endBattle() {
        System.out.println("You won the battle!");
    }
}
