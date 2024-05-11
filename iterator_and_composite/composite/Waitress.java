package iterator_and_composite.composite;

public class Waitress {
    MenuComponent mainMenu;
    
    public Waitress() {
        prepare();
    }

    public void prepare() {
        MenuComponent breakfastMenu = new Menu("BREAKFAST MENU", "Breakfast");
        MenuComponent dinerMenu = new Menu("DINER MENU", "Dinner");
        MenuComponent cafeMenu = new Menu("CAFE MENU", "Cafe");
        MenuComponent dessertMenu = new Menu("DESSERT MENU", "Dessert");

        MenuComponent mainMenu = new Menu("MAIN MENU", "All menus are combined here.");
        mainMenu.add(breakfastMenu);
        mainMenu.add(dinerMenu);
        mainMenu.add(cafeMenu);
        
        cafeMenu.add(new MenuItem("expresso", 1.6));
        cafeMenu.add(new MenuItem("latte", 2.1));
        dessertMenu.add(new MenuItem("chocolate cake", 6));

        breakfastMenu.add(new MenuItem("fried egg", 3));
        dinerMenu.add(new MenuItem("pizza", 8.9));

        cafeMenu.add(dessertMenu);
        breakfastMenu.add(cafeMenu);
        dinerMenu.add(cafeMenu);

        this.mainMenu = mainMenu;
    }

    public void printMenu() {
        mainMenu.print();
    }

    public static void main(String[] args) {
        Waitress waitress= new Waitress();
        waitress.printMenu();
    }
}
