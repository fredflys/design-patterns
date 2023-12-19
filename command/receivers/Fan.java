package receivers;

public class Fan {
    public enum Speed {
        OFF, LOW, MEDIUM, HIGH
    }
    String name;
    Speed speed = Speed.OFF;

    public Fan(String name) {
        this.name = name;
    }

    public Speed getSpeed() {
        return speed;
    }

    public void high() {
        speed = Speed.HIGH;
        System.out.printf("[%s fan] speed set to high.\n", name);
    }

    public void medium() {
        speed = Speed.MEDIUM;
        System.out.printf("[%s fan] speed set to medium.\n", name);
    }

    public void low() {
        speed = Speed.LOW;
        System.out.printf("[%s fan] speed set to low.\n", name);
    }

    public void off() {
        speed = Speed.OFF;
        System.out.printf("[%s fan] speed set to off.\n", name);
    }
}
