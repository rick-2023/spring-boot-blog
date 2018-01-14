package XML.proxy1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author 范正荣
 * @Date 2017/9/17 0017 15:11.
 */
public class Client {
    public static void main(String[] args) {
        Subject realSubject = new RealSubject();
        InvocationHandler handler = new DynamicProxy(realSubject);

        Subject proxySubject = (Subject) Proxy.newProxyInstance(realSubject.getClass().getClassLoader(),realSubject.getClass().getInterfaces(),handler);
        System.out.println(proxySubject.getClass().getName());
        proxySubject.visit();
    }
}
