package iterator_and_composite.iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import iterator_and_composite.starter.MenuItem;

public class ListMenuIterator implements Iterator {
    List<MenuItem> items;
    private int pos = 0;

    public ListMenuIterator(List<MenuItem> items) {
        this.items = items;
    }

    public ListMenuIterator(Collection<MenuItem> items) {
        this.items = new ArrayList<>(items);
    }

    @Override
    public boolean hasNext() {
        return pos < items.size() && items.get(pos) != null;
    }

    @Override
    public MenuItem next() {
        try {
            MenuItem item = items.get(pos);
            pos++;
            return item;
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Index out of bounds.");
            return null;
        }
    }
}
