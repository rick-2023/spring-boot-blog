package Proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author 范正荣
 * @Date 2017/8/28 0028 下午 3:12.
 */
public class InvocationHandlerImpl implements InvocationHandler {
    private Object subject;

    public InvocationHandlerImpl(Object subject) {
        this.subject = subject;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("在调用之前，我要干点啥呢？");
        System.out.println("Method:" + method);
        Object obj = method.invoke(subject,args);
        System.out.println("在调用之后，我要干点啥呢？");
        return obj;
    }
}
