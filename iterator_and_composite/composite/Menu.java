package iterator_and_composite.composite;

import java.util.ArrayList;
import java.util.List;

public class Menu extends MenuComponent {
    String name;
    String desc;
    List<MenuComponent> menuComponents = new ArrayList<>();

    public Menu(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    @Override
    public void add(MenuComponent component) {
        menuComponents.add(component);
    }

    @Override
    public void remove(MenuComponent component) {
        menuComponents.remove(component);
    }

    @Override
    public MenuComponent getChild(int i) {
        return menuComponents.get(i);
    }


    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDesc() {
        return desc;
    }

    @Override
    public void print() {
        System.out.printf("\nMenu: %s, Description: %s\n------\n", getName(), getDesc());
        for (MenuComponent component: menuComponents) {
            component.print();
        }
        // System.out.println();
    }
}
