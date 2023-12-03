package starter;

public class PizzaStore {
    Pizza orderPizza(String type) {
        Pizza pizza;

        // identify parts that vary and encapsulate them
        if (type.equals("cheese")) {
            pizza = new CheesePizza();
        } else if (type.equals("greek")) {
            pizza = new GreekPizza();
        } else {
            pizza = new Pizza();
        }

        pizza.prepare();
        pizza.bake(); 
        pizza.cut();
        pizza.box();

        return pizza;
    }
}
