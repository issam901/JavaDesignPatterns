package tn.smartdev.java.command;

public class FleeCommand implements Command {
    private Pokemon pokemon;

    public FleeCommand(Pokemon pokemon) {
        this.pokemon = pokemon;
    }

    @Override
    public void execute() {
        pokemon.flee();
    }
}
