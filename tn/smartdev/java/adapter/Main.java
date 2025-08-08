package tn.smartdev.java.adapter;

public class Main {

    public static void main(String[] args) {
        Pikachu pikachu = new Pikachu();
        WildCharmander wildCharmander = new WildCharmander();
        Pokemon wildCharmanderAdapter = new PokemonAdapter(wildCharmander);

        System.out.println("Pikachu:");
        pikachu.attack();
        pikachu.defend();

        System.out.println("\nWild Charmander:");
        wildCharmander.roar();
        wildCharmander.run();

        System.out.println("\nWild Charmander Adapter:");
        wildCharmanderAdapter.attack();
        wildCharmanderAdapter.defend();
    }
}
