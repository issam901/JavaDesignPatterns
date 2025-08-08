package tn.smartdev.java.decorator;

public class Main {

    public static void main(String[] args) {
        Pokemon pikachu = new Pikachu();
        System.out.println(pikachu.attack());

        Pokemon leveledUpPikachu = new LevelUpDecorator(pikachu);
        System.out.println(leveledUpPikachu.attack());

        Pokemon itemPikachu = new ItemDecorator(leveledUpPikachu);
        System.out.println(itemPikachu.attack());
    }
}
