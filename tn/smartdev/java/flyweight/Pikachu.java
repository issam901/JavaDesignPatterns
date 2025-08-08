package tn.smartdev.java.flyweight;

public class Pikachu implements Pokemon {

    private final String type; // Intrinsic state

    public Pikachu() {
        this.type = "Electric";
        System.out.println("Creating a Pikachu object");
    }

    @Override
    public void attack(String trainer) {
        System.out.println(trainer + "'s Pikachu uses Thunderbolt! Type: " + type);
    }
}
