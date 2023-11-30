package pattern.abstract_factory.entities;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {
    protected listPizzas listPizzas;
    protected String sauce;
    protected List<String> toppings;
    protected String price;

    public Pizza() {
        this.toppings = new ArrayList<>();
    }

    public void cooking() {
        System.out.println("Reading order...pizza " + listPizzas.getValue());
        System.out.println("Preparing pizza with " + sauce);
        System.out.println("Adding toppings.. ");
        this.toppings.forEach(System.out::println);
    }

    abstract public void Temperature();

    abstract public void deliver();

}
