package pattern.abstract_factory;

import pattern.abstract_factory.entities.OrderPizzaAbstractFactory;
import pattern.abstract_factory.entities.Pizza;
import pattern.abstract_factory.entities.listPizzas;

public class AbstractFactory {
    public static void main(String[] args) {

        OrderPizzaAbstractFactory orderPizzaAbstractFactory = new PizzeriaMainFactory();

        Pizza pizza = orderPizzaAbstractFactory.makingOrder(listPizzas.NEAPOLITAN);
        space();
        Pizza pizza2 = orderPizzaAbstractFactory.makingOrder(listPizzas.PEPPERONI);
        space();
        Pizza pizza3 = orderPizzaAbstractFactory.makingOrder(listPizzas.BBQ);
        space();
        Pizza pizza4 = orderPizzaAbstractFactory.makingOrder(listPizzas.MARGARITA);

    }
    private static void space(){
        System.out.println("--------------------------------------------------");
        System.out.println("\n");
        System.out.println("Next order");
    }
}
