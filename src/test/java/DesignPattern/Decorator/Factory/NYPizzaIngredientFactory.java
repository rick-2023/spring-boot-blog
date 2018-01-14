package DesignPattern.Decorator.Factory;

/**
 * @author 范正荣
 * @Date 2017/7/23 0023 下午 4:07.
 */
public class NYPizzaIngredientFactory implements PizzaIntegredientFactory {
    @Override
    public Dough createDough() {
        return new Dough();
    }

    @Override
    public Sauce createSauce() {
        return new Sauce();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies [] veggies = {new Mushroom()};
        return veggies;
    }

    @Override
    public Pepperoni createPepperroni() {
        return new Pepperoni();
    }

    @Override
    public Clams createClams() {
        return new Clams();
    }
}
