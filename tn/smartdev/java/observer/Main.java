package tn.smartdev.java.observer;

public class Main {
    public static void main(String[] args) {
        Subject subject = new Subject();

        new Pokedex(subject);
        new Trainer(subject);
        new Professor(subject);

        System.out.println("First discovery...");
        subject.setState(1);
        System.out.println("\nSecond discovery...");
        subject.setState(2);
    }
}
