package tn.smartdev.java;

import tn.smartdev.java.generic.Pokemon;
import tn.smartdev.java.factory.PokemonFactory;
import tn.smartdev.java.singleton.Singleton;
import tn.smartdev.java.generic.PokemonType;

public class designPattern {
    
    public static void main(String[] args) {
        //this code ensure that only instance will be created
        Singleton singleton=Singleton.getInstance();
        Pokemon pok= PokemonFactory.getPokemon(PokemonType.FIRE);
        System.out.println(pok.getClass().getTypeName());
    }
    public void MyMethod()
    {
        System.out.println("Singlton created");
    }
}
