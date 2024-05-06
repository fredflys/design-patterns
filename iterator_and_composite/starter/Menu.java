package iterator_and_composite.starter;

import iterator_and_composite.Iterator;

public interface Menu {
    public Iterator iterate();

    public default void printMenu() {
        Iterator iterator = iterate();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
