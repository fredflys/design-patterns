package pizzas;

import java.util.ArrayList;
import java.util.List;

import ingredients.cheeses.Cheese;
import ingredients.clams.Clams;
import ingredients.doughs.Dough;
import ingredients.pepperonis.Pepperoni;
import ingredients.sauces.Sauce;
import ingredients.veggies.Veggie;

public abstract class Pizza {
    String name;
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    Dough dough;
    Sauce sauce;
    Veggie[] veggies;
    Cheese cheese;
    Pepperoni pepperoni;
    Clams clam;

    List<String> toppings = new ArrayList<>();

    public abstract void prepare();

    public void bake(){
        System.out.println("Bake for 25 minutes at 350.");
    }
    public void cut(){
        System.out.println("Cut the pizza into diagonal slices.");
    }
    public void box(){
        System.out.println("Place pizza in official box.");
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append(String.format("----%s----\n", name));

        if (dough != null) {
            res.append(String.format("%s\n", dough));
        }

        if (sauce != null) {
            res.append(String.format("%s\n", sauce));
        }
        if (cheese != null) {
            res.append(String.format("%s\n", cheese));
        }
        if (clam != null) {
            res.append(String.format("%s\n", clam));
        }
        if (pepperoni != null) {
            res.append(String.format("%\n", pepperoni));
        }
        if (veggies != null) {
            for (int i = 0; i < veggies.length; i++) {
                res.append(veggies[i]);
                if (i < veggies.length - 1) {
                    res.append(",");
                }
            }
            res.append("\n");
        }

        return res.toString();
    }
}
