package tn.smartdev.java.observer;

public class Pokedex extends Observer {

    public Pokedex(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Pokedex: A new pokemon has been discovered! Total count: " + subject.getState());
    }
}
