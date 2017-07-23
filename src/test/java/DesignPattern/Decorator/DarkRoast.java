package DesignPattern.Decorator;

/**
 * @author 范正荣
 * @Date 2017/7/22 0022 下午 8:50.
 */
public class DarkRoast extends Beverage {

    public DarkRoast() {
        description = "DarkRoast";
    }

    @Override
    public double cost() {
        return 1.88;
    }
}
