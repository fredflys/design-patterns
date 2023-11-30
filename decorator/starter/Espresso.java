package decorator.starter;

public class Espresso extends Beverage{
    @Override
    double cost() {
        // TODO Auto-generated method stub
        return 1.99 + super.cost();
    }
}
