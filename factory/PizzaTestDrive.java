import pizzas.Pizza;
import stores.NYPizzaStore;
import stores.PizzaStore;

public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.printf("Ethan ordered a %s.\n", pizza.getName());
        System.out.printf("Details: \n %s",pizza);
    }
}
