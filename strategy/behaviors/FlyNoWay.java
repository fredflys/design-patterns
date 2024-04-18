package strategy.behaviors;

public class FlyNoWay implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("Unable to fly.");
    }
}
