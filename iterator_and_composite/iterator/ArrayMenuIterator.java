package iterator_and_composite.iterator;

import iterator_and_composite.starter.MenuItem;

public class ArrayMenuIterator implements Iterator{
    MenuItem[] items;
    private int pos = 0;

    public ArrayMenuIterator(MenuItem[] items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        return pos < items.length && items[pos] != null;
    }

    @Override
    public MenuItem next() {
        try {
            MenuItem item = items[pos];
            pos++;
            return item;
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Index out of bounds.");
            return null;
        }
    }
}
