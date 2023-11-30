package decorator.starter;

public class HouseBlend extends Beverage{
    @Override
    double cost() {
        // TODO Auto-generated method stub
        return 2.10 + super.cost();
    }
}
