package pattern.abstract_factory.entities;

abstract public class OrderPizzaAbstractFactory {

    public Pizza makingOrder(listPizzas name) {
        Pizza pizza = createPizza(name);
        System.out.println("-----YOUR FAVOURITE PIZZA IS COMING-----");
        pizza.cooking();
        System.out.println("-----OVEN TIME-----");
        pizza.Temperature();
        System.out.println("-----PACKING PIZZA-----");
        pizza.deliver();
        return pizza;
    }

    protected abstract Pizza createPizza(listPizzas type);
}
