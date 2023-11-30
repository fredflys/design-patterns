package decorator.starter;

public abstract class Beverage {
    private String desc;
    public String getDesc() {
        return desc;
    }
    // all the different condiments that a beverage may possibly have
    private boolean milk;
    private boolean soy;
    private boolean mocha;
    private boolean whip;

    public boolean hasMilk() {
        return milk;
    }
    public void setMilk(boolean flag) {}
    public boolean hasSoy() {
        return soy;
    }
    public void setSoy(boolean flag) {}
    public boolean hasMocha() {
        return mocha;
    }
    public void setMocha(boolean flag) {}
    public boolean hasWhip() {
        return whip;
    }
    public void setWhip(boolean flag) {}

    double cost() {
        double condimentCost = 0.0;
        if (hasMilk()) {
            condimentCost += 0.19;
        }
        return condimentCost;
    }
}
