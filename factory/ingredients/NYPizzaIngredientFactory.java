package ingredients;

import ingredients.cheeses.Cheese;
import ingredients.cheeses.ReggianoCheese;
import ingredients.clams.Clams;
import ingredients.clams.FreshClams;
import ingredients.doughs.Dough;
import ingredients.doughs.ThinCrustDough;
import ingredients.pepperonis.Pepperoni;
import ingredients.pepperonis.SlicedPepperoni;
import ingredients.sauces.MarinaraSauce;
import ingredients.sauces.Sauce;
import ingredients.veggies.Garlic;
import ingredients.veggies.Onion;
import ingredients.veggies.Veggie;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Veggie[] creatVeggies() {
        Veggie[] veggies = {new Garlic(), new Onion()};
        return veggies;
    }

    @Override
    public Pepperoni creatPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClam() {
        return new FreshClams();
    }
}
