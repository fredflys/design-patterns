package decorator.beverages;

public abstract class Beverage {
    String desc = "Unknown Beverage";

    public String getDesc() {
        return desc;
    } 

    // subclass will need to implement it
    public abstract double cost();

    public enum Size {TALL, GRANDE, VENTI};
    Size size;
    public Size getSize() {return this.size;}
    public void setSize(Size size) { this.size = size; }
}
