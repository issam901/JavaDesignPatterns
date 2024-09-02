package tn.smartdev.java.abstractFactory;

class WaterPokemonFactory implements AbstractPokemonFactory {
    @Override
    public LandPokemon createLandPokemon() {
        return null; // Water factory does not create land Pokémon
    }

    @Override
    public WaterPokemon createWaterPokemon() {
        return new Squirtle();
    }

    @Override
    public FirePokemon createFirePokemon() {
        return null; // Water factory does not create fire Pokémon
    }
}