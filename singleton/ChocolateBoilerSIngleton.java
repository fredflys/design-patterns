public class ChocolateBoilerSIngleton {
    private boolean empty;
    public boolean isEmpty() {
        return empty;
    }
    private boolean boiled;
    public boolean isBoiled() {
        return boiled;
    }

    // singoleton
    private ChocolateBoilerSIngleton () {
        empty = true;
        boiled = false;
    }
    private static ChocolateBoilerSIngleton instance;
    // use synchronized to avoid two threading entering the method at the same time
    public static synchronized ChocolateBoilerSIngleton getInstance() {
        if (instance != null) return instance;
        return new ChocolateBoilerSIngleton();
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
