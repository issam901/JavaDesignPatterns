package tn.smartdev.java.command;

public class Main {

    public static void main(String[] args) {
        Pokemon pikachu = new Pokemon("Pikachu");

        Command attack = new AttackCommand(pikachu);
        Command flee = new FleeCommand(pikachu);

        Trainer trainer = new Trainer();

        trainer.setCommand(attack);
        trainer.issueCommand();

        trainer.setCommand(flee);
        trainer.issueCommand();
    }
}
