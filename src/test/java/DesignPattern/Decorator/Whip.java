package DesignPattern.Decorator;

/**
 * @author 范正荣
 * @Date 2017/7/22 0022 下午 8:47.
 */
public class Whip extends CondimentDacorator {
    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ",Whip";
    }

    @Override
    public double cost() {
        return 0.88+beverage.cost();
    }
}
