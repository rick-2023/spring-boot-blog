package Proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author 范正荣
 * @Date 2017/8/28 0028 下午 3:16.
 */
public class DynamicProxyDemonstration {

    public static void main(String[] args) {
        Subject realSubject = new RealSubject();
        InvocationHandler handler = new InvocationHandlerImpl(realSubject);

        ClassLoader loader = realSubject.getClass().getClassLoader();
        Class[] interfaces = realSubject.getClass().getInterfaces();

        Subject sub = (Subject) Proxy.newProxyInstance(loader,interfaces,handler);
        System.out.println("动态代理类的对象类型"+sub.getClass().getName());
        String hello = sub.SayHello("aaa");
        System.out.println(hello);
    }
}
