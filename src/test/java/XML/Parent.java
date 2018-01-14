package XML;

import java.io.Serializable;

/**
 * @author 范正荣
 * @Date 2017/9/29 0029 8:42.
 */
public class Parent implements Serializable{
    static {
        System.out.println("parent static");
    }
    {
        System.out.println("no-static-parent");
    }
    public Parent(){
        System.out.println("i am parent");
    }

    public void say(){
        System.out.println("parent say");
    }
}
