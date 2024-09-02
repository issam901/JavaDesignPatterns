package tn.smartdev.java.abstractFactory;

interface AbstractPokemonFactory {
    LandPokemon createLandPokemon();
    WaterPokemon createWaterPokemon();
    FirePokemon createFirePokemon();
}