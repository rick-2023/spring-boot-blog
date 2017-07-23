package DesignPattern.Decorator;

/**
 * Created by Administrator on 2017/7/22 0022.
 */
public abstract class Beverage {
    String description = "unkown Beverage";

    public String getDescription(){
        return description;
    }

    public abstract double cost();
}
