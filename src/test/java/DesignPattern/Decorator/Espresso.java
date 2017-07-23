package DesignPattern.Decorator;

/**
 * Created by Administrator on 2017/7/22 0022.
 */
public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
