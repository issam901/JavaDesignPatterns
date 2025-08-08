package tn.smartdev.java.bridge;

public abstract class Pokemon {
    protected Type type;

    protected Pokemon(Type type) {
        this.type = type;
    }

    abstract public void applyType();
}
