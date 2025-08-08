package tn.smartdev.java.observer;

public class Trainer extends Observer {

    public Trainer(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Trainer: I should try to catch the new pokemon! Total seen: " + subject.getState());
    }
}
