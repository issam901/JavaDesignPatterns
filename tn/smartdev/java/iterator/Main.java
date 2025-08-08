package tn.smartdev.java.iterator;

public class Main {

    public static void main(String[] args) {
        PokemonRepository pokemonRepository = new PokemonRepository();

        for (Iterator iter = pokemonRepository.getIterator(); iter.hasNext(); ) {
            String name = (String) iter.next();
            System.out.println("Pokemon: " + name);
        }
    }
}
