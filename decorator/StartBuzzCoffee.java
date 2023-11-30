package decorator;

import decorator.beverages.Beverage;
import decorator.beverages.Espresso;
import decorator.beverages.HouseBlend;
import decorator.condiments.Mocha;
import decorator.condiments.Soy;

public class StartBuzzCoffee {
    public static void main(String[] args) {
        Beverage espresso = new Espresso();
        printReceipt(espresso);

        Beverage blend = new HouseBlend();
        blend = new Mocha(blend);
        blend = new Mocha(blend);
        blend = new Soy(blend);
        printReceipt(blend);
    }

    public static void printReceipt (Beverage beverage) {
        String receipt = String.format("%s $%s", beverage.getDesc(), beverage.cost());
        System.out.println(receipt);
    }
}
