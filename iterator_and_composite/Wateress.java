package iterator_and_composite;

import iterator_and_composite.starter.BreakfastMenu;
import iterator_and_composite.starter.CafeMenu;
import iterator_and_composite.starter.DinerMenu;
import iterator_and_composite.starter.Menu;

public class Wateress {
    public void printMenu() {
        // needs to be fixed, Menus are still concrete implementations,
        // BreakfastMenu menu1 = new BreakfastMenu();
        // DinerMenu menu2 = new DinerMenu();

        Menu menu1 = new BreakfastMenu();
        Menu menu2 = new DinerMenu();
        Menu menu3 = new CafeMenu();

        // a uniform way of iterating through a collection
        // menu implementations are hidden from the client

        //     Iterator iterator;

        //     iterator = menu1.iterate();
        //     while (iterator.hasNext()) {
        //         System.out.println(iterator.next());
        //     }
        // }

        menu1.printMenu();
        menu2.printMenu();
        menu3.printMenu();
    }
    public static void main(String[] args) {
        Wateress waitress = new Wateress();
        waitress.printMenu();
    }
}
