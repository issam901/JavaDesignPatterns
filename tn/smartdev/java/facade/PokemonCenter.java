package tn.smartdev.java.facade;

public class PokemonCenter {
    private Healer healer;
    private PC pc;
    private Shop shop;

    public PokemonCenter() {
        this.healer = new Healer();
        this.pc = new PC();
        this.shop = new Shop();
    }

    public void healPokemon() {
        healer.heal();
    }

    public void accessPokemonPC() {
        pc.accessPC();
    }

    public void accessPokeMart() {
        shop.accessShop();
    }
}
