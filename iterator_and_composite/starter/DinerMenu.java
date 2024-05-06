package iterator_and_composite.starter;

import iterator_and_composite.iterator.ArrayMenuIterator;

public class DinerMenu implements Menu {
    static final int MAX_ITEMS = 10;
    int numberOfItems = 0;
    // menu representation: arrays
    MenuItem[] menuItems;
    
    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];
        add("Pizza", 12);
    }

    public void add(String name, double price) {
        if (numberOfItems >= MAX_ITEMS) {
            System.out.println("Menu items maxed out. Cannot add new items.");
            return;
        }

        menuItems[numberOfItems++] = new MenuItem(name, price);
    }

    public MenuItem[] getMenuItems() {
        return menuItems;
    }

    // refactoring
    public iterator_and_composite.iterator.Iterator iterate() {
        return new ArrayMenuIterator(menuItems);
    }
}
