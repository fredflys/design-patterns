package decorator.beverages;

public class HouseBlend extends Beverage{
    public HouseBlend () {
        desc = "House Blend Coffee";
    }

    public double cost () {
        return 0.89;
    }
}
