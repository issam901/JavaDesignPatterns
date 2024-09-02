package tn.smartdev.java.abstractFactory;

class FirePokemonFactory implements AbstractPokemonFactory {
    @Override
    public LandPokemon createLandPokemon() {
        return null; // Fire factory does not create land Pokémon
    }

    @Override
    public WaterPokemon createWaterPokemon() {
        return null; // Fire factory does not create water Pokémon
    }

    @Override
    public FirePokemon createFirePokemon() {
        return new Charmander();
    }
}
