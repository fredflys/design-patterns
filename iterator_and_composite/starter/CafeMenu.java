package iterator_and_composite.starter;

import java.util.HashMap;
import java.util.Map;

import iterator_and_composite.iterator.Iterator;
import iterator_and_composite.iterator.ListMenuIterator;

public class CafeMenu implements Menu {
    Map<String, MenuItem> menuItems = new HashMap<>();

    public CafeMenu() {
        add("today's special", "latte", 3.69);
        add("3-for-2", "cappuccino", 4.14);
    }

    public void add(String promoString, String name, double price) {
        menuItems.put(promoString, new MenuItem(name, price));
    }

    @Override
    public Iterator iterate() {
        return new ListMenuIterator(
            menuItems.values()
        );
    }
}
