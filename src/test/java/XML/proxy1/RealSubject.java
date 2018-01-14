package XML.proxy1;

/**
 * @author 范正荣
 * @Date 2017/9/17 0017 15:07.
 */
public class RealSubject implements Subject {
    @Override
    public void visit() {
        System.out.println("I am 'RealSubject',I am the execution method");
    }
}
