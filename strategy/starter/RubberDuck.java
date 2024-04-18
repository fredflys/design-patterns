package strategy.starter;

// not supposed to fly
public class RubberDuck extends Duck {
    @Override
    public void display() {
        System.out.println("Rubber here.");
    }
}
