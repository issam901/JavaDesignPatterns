package tn.smartdev.java.adapter;

public class Pikachu implements Pokemon {

    @Override
    public void attack() {
        System.out.println("Pikachu use Thunderbolt!");
    }

    @Override
    public void defend() {
        System.out.println("Pikachu use Quick Attack to dodge!");
    }
}
