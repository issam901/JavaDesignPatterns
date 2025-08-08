package tn.smartdev.java.proxy;

public class PokedexProxy implements Pokedex {
    private RealPokedex realPokedex;

    @Override
    public void getPokemonData(String pokemonName) {
        if (realPokedex == null) {
            realPokedex = new RealPokedex();
        }
        realPokedex.getPokemonData(pokemonName);
    }
}
