package template_method;

// high-level component that defines the recipe
public abstract class CaffineBeverage {
    // final so subclasses can't override and thus change the recipe (algorithm)
    // this is our template method
    final void prepare() {
        boil();
        brew();
        pour();
        if (condimentsRequested())
           addCondiments();
    }

    // these two methods are abstract so that subclasses must implement them
    abstract void brew();
    abstract void addCondiments();

    void boil() {
        System.out.println("Boiling water");
    }

    void pour() {
        System.out.println("Pouring into cup");
    }

    // this is a hook method that can be override by subclasses
    // this method can be hooked into or simply ignored
    boolean condimentsRequested() {
        return true;
    }
}
