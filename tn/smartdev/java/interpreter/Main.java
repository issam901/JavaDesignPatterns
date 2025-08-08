package tn.smartdev.java.interpreter;

public class Main {

    // Rule: Pikachu and Charmander are male
    public static Expression getMalePokemonExpression() {
        Expression pikachu = new TerminalExpression("Pikachu");
        Expression charmander = new TerminalExpression("Charmander");
        return new OrExpression(pikachu, charmander);
    }

    // Rule: A pokemon is a flying type if it has "Flying" in its description
    public static Expression getFlyingTypePokemonExpression() {
        Expression flying = new TerminalExpression("Flying");
        return flying;
    }

    public static void main(String[] args) {
        Expression isMale = getMalePokemonExpression();
        Expression isFlying = getFlyingTypePokemonExpression();

        System.out.println("Is Pikachu a male pokemon? " + isMale.interpret("Pikachu"));
        System.out.println("Is Charizard a male pokemon? " + isMale.interpret("Charizard"));


        Expression isPikachuFlying = new AndExpression(new TerminalExpression("Pikachu"), isFlying);
        System.out.println("Is Pikachu a flying type? " + isPikachuFlying.interpret("Pikachu is a mouse pokemon"));
        System.out.println("Is Charizard a flying type? " + isFlying.interpret("Charizard is a Flying type pokemon"));
    }
}
