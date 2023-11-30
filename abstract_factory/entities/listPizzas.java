package pattern.abstract_factory.entities;

public enum listPizzas {
    MARGARITA("Margarita"),
    PEPPERONI("Spicy Pepperoni"),
    BBQ("New York BBQ"),
    NEAPOLITAN("Neapolitan Italian Style");

    private final String value;

    listPizzas(String s) {
        this.value = s;
    }

    public String getValue() {
        return value;
    }
}
