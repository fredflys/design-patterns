package iterator_and_composite.composite;

public abstract class MenuComponent {
    // not all the methods make senese to a menuitem and a menu so the default implementation is to throw an exception

    /*
     * composite methods
     */
    public void add(MenuComponent component) {
        throw new UnsupportedOperationException();
    }
    public void remove(MenuComponent component) {
        throw new UnsupportedOperationException();
    }
    public MenuComponent getChild(int i) {
        throw new UnsupportedOperationException();
    }

    /*
     * operation methods
     */
    public String getName() {
        throw new UnsupportedOperationException();
    }
    public String getDesc() {
        throw new UnsupportedOperationException();
    }
    public double getPrice() {
        throw new UnsupportedOperationException();
    }

    public void print() {
        throw new UnsupportedOperationException();
    }
} 