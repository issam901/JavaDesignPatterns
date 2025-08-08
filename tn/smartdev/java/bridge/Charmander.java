package tn.smartdev.java.bridge;

public class Charmander extends Pokemon {

    public Charmander(Type type) {
        super(type);
    }

    @Override
    public void applyType() {
        System.out.print("Charmander ");
        type.applyType();
    }
}
