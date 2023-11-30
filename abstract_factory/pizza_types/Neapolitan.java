package pattern.abstract_factory.pizza_types;

import pattern.abstract_factory.companies.JustEat;
import pattern.abstract_factory.entities.Pizza;

public class Neapolitan extends Pizza {

    public Neapolitan() {
        super();
        listPizzas = listPizzas.NEAPOLITAN;
        sauce = "tomato homemade";
        price = "15$";
        toppings.add("burrata cheese");
        toppings.add("basil");
        toppings.add("olive oil");
    }

    @Override
    public void Temperature() {
        System.out.println("This will be made in a wood-fired oven at 500 degrees");
    }

    @Override
    public void deliver() {
        JustEat company = new JustEat("Sergio Berdiell");
        company.infoCompany(price);
        company.comments();
    }
}
