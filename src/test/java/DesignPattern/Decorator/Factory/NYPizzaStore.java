package DesignPattern.Decorator.Factory;

/**
 * @author 范正荣
 * @Date 2017/7/23 0023 下午 4:17.
 */
public class NYPizzaStore extends  PizzaStore {
    @Override
    Pizza createPizza(String item) {
        Pizza pizza = null;
         PizzaIntegredientFactory integredientFactory = new NYPizzaIngredientFactory();

         if(item.equals("cheese")){
             pizza = new CheesePizza(integredientFactory);
             pizza.setName("NY cheese");
         }
         return  pizza;
    }
}
