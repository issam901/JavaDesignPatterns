package tn.smartdev.java.prototype;

public class Main {

    public static void main(String[] args) {
        PokemonStore.loadCache();

        Pokemon clonedPikachu = PokemonStore.getPokemon("Pikachu");
        System.out.println("Pokemon: " + clonedPikachu.getName() + ", Type: " + clonedPikachu.getType());
        clonedPikachu.attack();

        Pokemon clonedCharmander = PokemonStore.getPokemon("Charmander");
        System.out.println("Pokemon: " + clonedCharmander.getName() + ", Type: " + clonedCharmander.getType());
        clonedCharmander.attack();
    }
}
