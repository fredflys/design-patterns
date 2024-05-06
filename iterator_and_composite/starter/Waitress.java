package iterator_and_composite.starter;

import java.util.List;

public class Waitress {
    public void printMenu() {
        BreakfastMenu breakfastMenu = new BreakfastMenu();
        DinerMenu dinerMenu = new DinerMenu();

        List<MenuItem> breakfastMenuItems = breakfastMenu.getMenuItems();
        MenuItem[] dinerMenuItems = dinerMenu.getMenuItems();
        
        // loop through both menus
        for (int i = 0; i < breakfastMenuItems.size(); i++) {
            MenuItem menuItem = breakfastMenuItems.get(i);
            System.out.println(menuItem);
        }

        // the looping method is different for the diner menu
        for (int i = 0; i < dinerMenuItems.length; i++) {
            MenuItem menuItem = dinerMenuItems[i];
            if (menuItem != null) {
                System.out.println(menuItem);
            }
        }
    }

    public static void main(String[] args) {
        Waitress waitress = new Waitress();
        waitress.printMenu();
    }
}
