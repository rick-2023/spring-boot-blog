package DesignPattern.Decorator.Factory;

import lombok.Data;

/**
 * @author 范正荣
 * @Date 2017/7/23 0023 下午 4:10.
 */
@Data
public abstract class Pizza {
    String name;
    Dough dough;
    Sauce sauce;
    Veggies[] veggies;
    Cheese cheese;
    Pepperoni pepperoni;
    Clams clams;

    abstract  void prepare();

    void bake(){
        System.out.println("bake");
    }
}