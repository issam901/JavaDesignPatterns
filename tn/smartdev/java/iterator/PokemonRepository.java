package tn.smartdev.java.iterator;

public class PokemonRepository implements Container {
    public String pokemons[] = {"Pikachu", "Charmander", "Squirtle", "Bulbasaur"};

    @Override
    public Iterator getIterator() {
        return new PokemonIterator();
    }

    private class PokemonIterator implements Iterator {
        int index;

        @Override
        public boolean hasNext() {
            if (index < pokemons.length) {
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            if (this.hasNext()) {
                return pokemons[index++];
            }
            return null;
        }
    }
}
