package tn.smartdev.java.template;

public abstract class PokemonBattle {
    abstract void startBattle();
    abstract void endBattle();

    public final void play() {
        startBattle();
        endBattle();
    }
}
