package ingredients;

import ingredients.cheeses.Cheese;
import ingredients.clams.Clams;
import ingredients.doughs.Dough;
import ingredients.pepperonis.Pepperoni;
import ingredients.sauces.Sauce;
import ingredients.veggies.Veggie;

public interface PizzaIngredientFactory {
    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Veggie[] creatVeggies();
    public Pepperoni creatPepperoni();
    public Clams createClam();
}
