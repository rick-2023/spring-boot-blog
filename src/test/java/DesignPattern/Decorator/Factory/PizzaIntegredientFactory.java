package DesignPattern.Decorator.Factory;

/**
 * @author 范正荣
 * @Date 2017/7/23 0023 下午 4:03.
 */
public interface PizzaIntegredientFactory {
    public Dough createDough();
    public Sauce createSauce();
    public Veggies[] createVeggies();
    public Pepperoni createPepperroni();
    public Clams createClams();

}
