package Proxy;

/**
 * @author 范正荣
 * @Date 2017/8/28 0028 下午 3:11.
 */
public class RealSubject implements Subject {
    @Override
    public String SayHello(String name) {
        return "hello"+name;
    }

    @Override
    public String SayGoodBye() {
        return "goodBye";
    }
}
