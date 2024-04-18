package strategy;

public class Test {
    public static void main(String[] args) {
        Duck duck = new RubberDuck();
        duck.quack();
        duck.fly();
    }
}
