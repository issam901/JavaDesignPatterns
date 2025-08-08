package tn.smartdev.java.command;

public class Pokemon {
    private String name;

    public Pokemon(String name) {
        this.name = name;
    }

    public void attack() {
        System.out.println(name + " attacks!");
    }

    public void flee() {
        System.out.println(name + " flees!");
    }
}
