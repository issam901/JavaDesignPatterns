package tn.smartdev.java.prototype;

public class Pikachu extends Pokemon {

    public Pikachu() {
        this.type = "Electric";
        this.setName("Pikachu");
    }

    @Override
    public void attack() {
        System.out.println("Pikachu use Thunderbolt!");
    }
}
