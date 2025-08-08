package tn.smartdev.java.flyweight;

public class Main {

    private static final String[] trainers = {"Ash", "Misty", "Brock"};

    public static void main(String[] args) {
        for (int i = 0; i < 10; ++i) {
            Pokemon pikachu = (Pokemon) PokemonFactory.getPokemon("Pikachu");
            pikachu.attack(getRandomTrainer());
        }
    }

    private static String getRandomTrainer() {
        return trainers[(int) (Math.random() * trainers.length)];
    }
}
