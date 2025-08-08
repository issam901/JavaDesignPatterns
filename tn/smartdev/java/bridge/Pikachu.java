package tn.smartdev.java.bridge;

public class Pikachu extends Pokemon {

    public Pikachu(Type type) {
        super(type);
    }

    @Override
    public void applyType() {
        System.out.print("Pikachu ");
        type.applyType();
    }
}
