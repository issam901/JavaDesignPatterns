package tn.smartdev.java.abstractFactory;

class LandPokemonFactory implements AbstractPokemonFactory {
    @Override
    public LandPokemon createLandPokemon() {
        return new Pikachu();
    }

    @Override
    public WaterPokemon createWaterPokemon() {
        return null; // Land factory does not create water Pokémon
    }

    @Override
    public FirePokemon createFirePokemon() {
        return null; // Land factory does not create fire Pokémon
    }
}
