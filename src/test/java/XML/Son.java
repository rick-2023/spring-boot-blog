package XML;

import java.io.Serializable;

/**
 * @author 范正荣
 * @Date 2017/9/29 0029 8:42.
 */
public class Son extends Parent implements Serializable{
    static {
        System.out.println("son static");
    }
    {
        System.out.println("no-static-son");
    }

    public Son(){
        System.out.println("i am son");
    }

    @Override
    public void say() {
       // super.say();
        System.out.println("son say");
    }

    public static void aaa(){

    }

    public static void main(String[] args) {
        Parent p = new Son();
        p.say();
    }
}
