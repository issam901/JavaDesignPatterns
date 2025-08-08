package tn.smartdev.java.observer;

public class Professor extends Observer {

    public Professor(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Professor: A new pokemon species! I need to study it. Total species: " + subject.getState());
    }
}
