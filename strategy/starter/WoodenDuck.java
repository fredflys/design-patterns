package strategy.starter;

// not supposed to quack or fly
public class WoodenDuck extends Duck {
    @Override
    public void display() {
        System.out.println("Wooden here.");
    }
}
