package XML.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author 范正荣
 * @Date 2017/9/17 0017 14:31.
 */
public class AccountProxyFactory implements InvocationHandler{
    private Object target;

    public Object bind(Object target){
        this.target = target;
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),this.target.getClass().getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        boolean objFlag = method.getDeclaringClass().getName().equals("java.lang.Object");
        Object result = null;
        if(!objFlag)
            System.out.println("代理before");
        result = method.invoke(this.target, args);
        if(!objFlag)
            System.out.println("代理after");
        return result;
    }
}
