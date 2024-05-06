package template_method.starter;

public class Tea {
    void prepare() {
        boil();
        steepTeaBag();
        pour();
        addLemon();
    }

    void boil() {
    }
    void steepTeaBag() {}
    void pour() {}
    void addLemon() {}
}
