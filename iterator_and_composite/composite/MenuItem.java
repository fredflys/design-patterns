package iterator_and_composite.composite;

public class MenuItem extends MenuComponent {
    String name;
    double price;

    public MenuItem (String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void print() {
        System.out.printf("name: %s, price: %f\n", name, price);
    }
}
