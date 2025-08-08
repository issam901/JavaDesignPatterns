package tn.smartdev.java.observer;

public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
