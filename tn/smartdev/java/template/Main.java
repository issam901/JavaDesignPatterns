package tn.smartdev.java.template;

public class Main {
    public static void main(String[] args) {
        PokemonBattle battle = new PlayerBattle();
        battle.play();

        System.out.println();

        battle = new WildPokemonBattle();
        battle.play();
    }
}
