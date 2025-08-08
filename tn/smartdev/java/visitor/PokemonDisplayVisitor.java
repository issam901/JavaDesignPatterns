package tn.smartdev.java.visitor;

public class PokemonDisplayVisitor implements PokemonVisitor {
    @Override
    public void visit(Pikachu pikachu) {
        System.out.println("Displaying Pikachu");
    }

    @Override
    public void visit(Charmander charmander) {
        System.out.println("Displaying Charmander");
    }
}
