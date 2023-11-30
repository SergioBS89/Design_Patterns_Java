package pattern.abstract_factory;

import pattern.abstract_factory.entities.OrderPizzaAbstractFactory;
import pattern.abstract_factory.entities.Pizza;
import pattern.abstract_factory.entities.listPizzas;
import pattern.abstract_factory.pizza_types.Bbq;
import pattern.abstract_factory.pizza_types.Margarita;
import pattern.abstract_factory.pizza_types.Neapolitan;
import pattern.abstract_factory.pizza_types.Pepperoni;

public class PizzeriaMainFactory extends OrderPizzaAbstractFactory {

    @Override
    public Pizza createPizza(listPizzas name) {
        return switch (name) {
            case NEAPOLITAN -> new Neapolitan();
            case PEPPERONI -> new Pepperoni();
            case MARGARITA -> new Margarita();
            case BBQ -> new Bbq();
        };
    }
}
