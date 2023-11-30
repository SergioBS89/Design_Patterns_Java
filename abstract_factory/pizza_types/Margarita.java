package pattern.abstract_factory.pizza_types;

import pattern.abstract_factory.companies.JustEat;
import pattern.abstract_factory.entities.Pizza;

public class Margarita extends Pizza {

    public Margarita() {
        super();
        listPizzas = listPizzas.MARGARITA;
        sauce = "tomato homemade";
        price = "13$";
        toppings.add("mozzarella cheese");
        toppings.add("oregano");
        toppings.add("olive oil");
    }

    @Override
    public void Temperature() {
        System.out.println("This pizza is made in a special grill with direct flame");
    }

    @Override
    public void deliver() {
        JustEat company = new JustEat("Tom Cruise");
        company.infoCompany(price);
        company.comments();
    }
}
