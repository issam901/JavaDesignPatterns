package tn.smartdev.java.bridge;

public class Main {

    public static void main(String[] args) {
        Pokemon pikachu = new Pikachu(new ElectricType());
        pikachu.applyType();

        Pokemon charmander = new Charmander(new FireType());
        charmander.applyType();
    }
}
