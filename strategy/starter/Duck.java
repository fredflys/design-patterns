package strategy.starter;

public abstract class Duck {
    public void quack() {
        System.out.println("Quack");
    }

    public void swim() {
        System.out.println("Swim");
    }

    public abstract void display();

    // now the fly method is added but not all ducks should fly
    public void fly() {

    }

    // the method list can go on and on but each duck may have quite different features
    // do you really want to keep overriding the methods that are not supposed to do anything?
}
