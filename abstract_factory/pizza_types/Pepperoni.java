package pattern.abstract_factory.pizza_types;

import pattern.abstract_factory.companies.Globo;
import pattern.abstract_factory.entities.Pizza;

public class Pepperoni extends Pizza {

    public Pepperoni() {
        super();
        listPizzas = listPizzas.PEPPERONI;
        sauce = "tomato, garlic and spicy chili";
        price = "12$";
        toppings.add("mozzarella cheese");
        toppings.add("chorizo");
        toppings.add("onion");
    }

    @Override
    public void Temperature() {
        System.out.println("This will be made in a stone-fired oven at 300 degrees");
    }

    @Override
    public void deliver() {
        Globo company = new Globo("Monica Perez");
        company.infoCompany(price);
        company.comments();
    }
}
