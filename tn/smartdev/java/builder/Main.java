package tn.smartdev.java.builder;

public class Main {

    public static void main(String[] args) {
        Pokemon pikachu = new Pokemon.PokemonBuilder("Pikachu", "Electric")
                .setAbility("Static")
                .setLevel(25)
                .build();

        Pokemon charmander = new Pokemon.PokemonBuilder("Charmander", "Fire")
                .setLevel(15)
                .build();

        System.out.println(pikachu);
        System.out.println(charmander);
    }
}
