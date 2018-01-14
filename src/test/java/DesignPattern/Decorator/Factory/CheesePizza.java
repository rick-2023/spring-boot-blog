package DesignPattern.Decorator.Factory;

/**
 * @author 范正荣
 * @Date 2017/7/23 0023 下午 4:12.
 */
public class CheesePizza extends Pizza {
    PizzaIntegredientFactory integredientFactory;

    public CheesePizza(PizzaIntegredientFactory integredientFactory) {
        this.integredientFactory = integredientFactory;
    }

    @Override
    void prepare() {
        System.out.println("prepare"+name);
        dough = integredientFactory.createDough();
        sauce = integredientFactory.createSauce();
    }
}
