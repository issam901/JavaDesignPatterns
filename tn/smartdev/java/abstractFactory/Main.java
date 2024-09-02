package tn.smartdev.java.abstractFactory;

public class Main {
    public static void main(String[] args) {
        // Creating a Land Pokemon Factory
        AbstractPokemonFactory landFactory = new LandPokemonFactory();
        LandPokemon pikachu = landFactory.createLandPokemon();
        pikachu.displayType();

        // Creating a Water Pokemon Factory
        AbstractPokemonFactory waterFactory = new WaterPokemonFactory();
        WaterPokemon squirtle = waterFactory.createWaterPokemon();
        squirtle.displayType();

        // Creating a Fire Pokemon Factory
        AbstractPokemonFactory fireFactory = new FirePokemonFactory();
        FirePokemon charmander = fireFactory.createFirePokemon();
        charmander.displayType();
    }
}
