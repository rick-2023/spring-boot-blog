package DesignPattern.Decorator;

/**
 * @author 范正荣
 * @Date 2017/7/22 0022 下午 8:40.
 */
public class HouseBlend extends Beverage {
    public HouseBlend() {
        description = "HouseBlend";
    }

    @Override
    public double cost() {
        return .89;
    }
}
