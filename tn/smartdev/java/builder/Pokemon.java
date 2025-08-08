package tn.smartdev.java.builder;

public class Pokemon {

    // required parameters
    private String name;
    private String type;

    // optional parameters
    private String ability;
    private int level;

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getAbility() {
        return ability;
    }

    public int getLevel() {
        return level;
    }

    private Pokemon(PokemonBuilder builder) {
        this.name = builder.name;
        this.type = builder.type;
        this.ability = builder.ability;
        this.level = builder.level;
    }

    @Override
    public String toString() {
        return "Pokemon: " + this.name + ", Type: " + this.type + ", Ability: " + this.ability + ", Level: " + this.level;
    }

    public static class PokemonBuilder {

        // required parameters
        private String name;
        private String type;

        // optional parameters
        private String ability;
        private int level;

        public PokemonBuilder(String name, String type) {
            this.name = name;
            this.type = type;
        }

        public PokemonBuilder setAbility(String ability) {
            this.ability = ability;
            return this;
        }

        public PokemonBuilder setLevel(int level) {
            this.level = level;
            return this;
        }

        public Pokemon build() {
            return new Pokemon(this);
        }
    }
}
