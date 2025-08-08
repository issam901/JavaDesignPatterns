package tn.smartdev.java.adapter;

public class WildCharmander implements WildPokemon {

    @Override
    public void roar() {
        System.out.println("Wild Charmander roars!");
    }

    @Override
    public void run() {
        System.out.println("Wild Charmander runs away!");
    }
}
