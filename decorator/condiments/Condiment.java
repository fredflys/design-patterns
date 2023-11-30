package decorator.condiments;

import decorator.beverages.Beverage;

public abstract class Condiment extends Beverage{
    Beverage beverage;
    public abstract String getDesc();

    public Size getSize() {
        return beverage.getSize();
    }
}
