package iterator_and_composite.starter;

import java.util.ArrayList;
import java.util.List;

import iterator_and_composite.iterator.Iterator;
import iterator_and_composite.iterator.ListMenuIterator;

public class BreakfastMenu implements Menu{
    // menu representation: ArrayList
    List<MenuItem> menuItems;

    public BreakfastMenu () {
        menuItems = new ArrayList<>();

        add("Coffee", 2.99);
    }

    public void add(String name, double price) {
        menuItems.add(new MenuItem(name, price));
    }

    public List<MenuItem> getMenuItems() {
        return menuItems;
    }

    // refactoring
    public Iterator iterate() {
        return new ListMenuIterator(menuItems);
    }
}
