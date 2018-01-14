package XML.proxy1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author 范正荣
 * @Date 2017/9/17 0017 15:09.
 */
public class DynamicProxy implements InvocationHandler {
    // 我们要代理的真实对象(委托对象)
    private Object subject;

    // 构造方法，给我们要代理的真实对象赋初值
    public DynamicProxy(Object obj) {
        this.subject = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before invoke");
        method.invoke(subject,args);
        System.out.println("after invoke");
        return null;
    }
}
