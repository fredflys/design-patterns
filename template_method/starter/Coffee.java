package template_method.starter;

public class Coffee {
    void prepare() {
        boil();
        brewCoffeeGrinds();
        pour();
        addSugarAndMilk();
    }

    void boil() {
    }

    void brewCoffeeGrinds() {
    }
    void pour() {}
    void addSugarAndMilk() {}
}
