package DesignPattern.Decorator;

/**
 * @author 范正荣
 * @Date 2017/7/22 0022 下午 8:41.
 */
public class Mocha extends  CondimentDacorator {
    Beverage beverage;
    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+",Mocha";
    }

    @Override
    public double cost() {
        return 0.20+beverage.cost();
    }
}
