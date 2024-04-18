package strategy;

import strategy.behaviors.FlyBehavior;
import strategy.behaviors.QuackBehavior;

public abstract class Duck {
    QuackBehavior quackBehavior;
    FlyBehavior flyBehavior;
    // you can add more behaviors here

    public void fly() {
        flyBehavior.fly();
    }
    public void quack() {
        quackBehavior.quack();
    }
}
