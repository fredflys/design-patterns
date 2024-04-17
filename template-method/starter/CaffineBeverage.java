package template_method.starter;

// try to streamline the code by moving the common code to a base class
public abstract class CaffineBeverage {
    abstract void prepare();
    abstract void boil();
    abstract void pour();
}
