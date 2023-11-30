package pattern.abstract_factory.pizza_types;

import pattern.abstract_factory.companies.Globo;
import pattern.abstract_factory.entities.Pizza;

public class Bbq extends Pizza {
    public Bbq() {
        super();
        listPizzas = listPizzas.BBQ;
        sauce = "BBQ sauce";
        price = "12.50$";
        toppings.add("mozzarella cheese");
        toppings.add("minced meat");
        toppings.add("olive oil");
    }

    @Override
    public void Temperature() {
        System.out.println("This pizza is made in a basic oven at 250 degrees");
    }

    @Override
    public void deliver() {
        Globo company = new Globo("Sara Salinas");
        company.infoCompany(price);
        company.comments();
    }
}
