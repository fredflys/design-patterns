package decorator.condiments;

import decorator.beverages.Beverage;

public class Mocha extends Condiment {
    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDesc() {
        return String.format("%s, Mocha", beverage.getDesc());
    }

    public double cost() {
        return beverage.cost() + .20;
    }
}
