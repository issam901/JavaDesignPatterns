package tn.smartdev.java.prototype;

public class Charmander extends Pokemon {

    public Charmander() {
        this.type = "Fire";
        this.setName("Charmander");
    }

    @Override
    public void attack() {
        System.out.println("Charmander use Flamethrower!");
    }
}
