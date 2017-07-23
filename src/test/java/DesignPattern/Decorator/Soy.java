package DesignPattern.Decorator;

/**
 * @author 范正荣
 * @Date 2017/7/22 0022 下午 8:46.
 */
public class Soy extends CondimentDacorator {

    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+".Soy";
    }

    @Override
    public double cost() {
        return 0.55 + beverage.cost();
    }
}
