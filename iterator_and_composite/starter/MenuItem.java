package iterator_and_composite.starter;

public class MenuItem {
    String name;
    double price;

    public MenuItem (String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return name + " " + price;
    }
}
