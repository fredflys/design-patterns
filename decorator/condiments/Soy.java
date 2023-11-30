package decorator.condiments;

import java.util.EnumMap;

import decorator.beverages.Beverage;

public class Soy extends Condiment{
    private EnumMap<Size, Double> sizeCost = new EnumMap<>(Size.class);

    public Soy (Beverage beverage) {
        this.beverage = beverage;

        sizeCost.put(Size.TALL, 0.10d);
        sizeCost.put(Size.GRANDE, 0.15d);
        sizeCost.put(Size.VENTI, 0.20d);
    }

    public String getDesc() {
        return String.format("%s, Soy", beverage.getDesc());
    }

    public double cost() {
        return beverage.cost() + sizeCost.get(beverage.getSize());
    }
}
