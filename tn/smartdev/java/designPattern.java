package tn.smartdev.java;

public class designPattern {

    public static void main(String[] args) {
        System.out.println("--- Singleton Pattern ---");
        tn.smartdev.java.singleton.Singleton.getInstance();
        System.out.println("Singleton instance created.");
        System.out.println();

        System.out.println("--- Factory Pattern ---");
        tn.smartdev.java.factory.PokemonFactory.getPokemon(tn.smartdev.java.generic.PokemonType.FIRE);
        System.out.println("Factory created a fire pokemon.");
        System.out.println();

        System.out.println("--- Abstract Factory Pattern ---");
        tn.smartdev.java.abstractFactory.Main.main(null);
        System.out.println();

        System.out.println("--- Prototype Pattern ---");
        tn.smartdev.java.prototype.Main.main(null);
        System.out.println();

        System.out.println("--- Builder Pattern ---");
        tn.smartdev.java.builder.Main.main(null);
        System.out.println();

        System.out.println("--- Adapter Pattern ---");
        tn.smartdev.java.adapter.Main.main(null);
        System.out.println();

        System.out.println("--- Bridge Pattern ---");
        tn.smartdev.java.bridge.Main.main(null);
        System.out.println();

        System.out.println("--- Composite Pattern ---");
        tn.smartdev.java.composite.Main.main(null);
        System.out.println();

        System.out.println("--- Decorator Pattern ---");
        tn.smartdev.java.decorator.Main.main(null);
        System.out.println();

        System.out.println("--- Facade Pattern ---");
        tn.smartdev.java.facade.Main.main(null);
        System.out.println();

        System.out.println("--- Flyweight Pattern ---");
        tn.smartdev.java.flyweight.Main.main(null);
        System.out.println();

        System.out.println("--- Proxy Pattern ---");
        tn.smartdev.java.proxy.Main.main(null);
        System.out.println();

        System.out.println("--- Chain of Responsibility Pattern ---");
        tn.smartdev.java.chainofresponsibility.Main.main(null);
        System.out.println();

        System.out.println("--- Command Pattern ---");
        tn.smartdev.java.command.Main.main(null);
        System.out.println();

        System.out.println("--- Interpreter Pattern ---");
        tn.smartdev.java.interpreter.Main.main(null);
        System.out.println();

        System.out.println("--- Iterator Pattern ---");
        tn.smartdev.java.iterator.Main.main(null);
        System.out.println();

        System.out.println("--- Mediator Pattern ---");
        tn.smartdev.java.mediator.Main.main(null);
        System.out.println();

        System.out.println("--- Memento Pattern ---");
        tn.smartdev.java.memento.Main.main(null);
        System.out.println();

        System.out.println("--- Observer Pattern ---");
        tn.smartdev.java.observer.Main.main(null);
        System.out.println();

        System.out.println("--- State Pattern ---");
        tn.smartdev.java.state.Main.main(null);
        System.out.println();

        System.out.println("--- Strategy Pattern ---");
        tn.smartdev.java.strategy.Main.main(null);
        System.out.println();

        System.out.println("--- Template Pattern ---");
        tn.smartdev.java.template.Main.main(null);
        System.out.println();

        System.out.println("--- Visitor Pattern ---");
        tn.smartdev.java.visitor.Main.main(null);
        System.out.println();
    }
}
