package starter;

public class ChocolateBoiler {
    private boolean empty;
    public boolean isEmpty() {
        return empty;
    }
    private boolean boiled;
    public boolean isBoiled() {
        return boiled;
    }

    public ChocolateBoiler() {
        empty = true;
        boiled = false;
    }

    public void fill() {
        if (!isEmpty()) return;
        // do something here
        empty = false;
        boiled = false;
    }

    public void drain() {
        if (isEmpty() || !isBoiled()) return;
        empty = true;
    }

    public void boil() {
        if (isEmpty() || isBoiled()) return;
        boiled = true;
    }
}
