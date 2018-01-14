package XML.proxy1;

/**
 * @author 范正荣
 * @Date 2017/9/17 0017 15:25.
 */
public class CglibClient {
    public static void main(String[] args) {
        CglibDynamicProxy cglib = new CglibDynamicProxy();
        CglibRealSubject realSubject = (CglibRealSubject) cglib.getProxyInstance(new CglibRealSubject());
        realSubject.visit();
    }
}
