package strategy;

import strategy.behaviors.FlyNoWay;
import strategy.behaviors.Squeak;

public class RubberDuck extends Duck{
    public RubberDuck() {
        quackBehavior = new Squeak();
        flyBehavior = new FlyNoWay();
    }
}
