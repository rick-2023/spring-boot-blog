package XML.proxy1;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author 范正荣
 * @Date 2017/9/17 0017 15:20.
 */
public class CglibDynamicProxy implements MethodInterceptor {
    private Object target;

    /**
     * 创建代理对象
     *
     * @param target 被代理的对象
     * @return
     */
    public Object getProxyInstance(Object target) {
        this.target = target;
        // 声明增强类实例
        Enhancer enhancer = new Enhancer();
        // 设置被代理类字节码，CGLIB根据字节码生成被代理类的子类
        enhancer.setSuperclass(this.target.getClass());
        // 设置要代理的拦截器，回调函数，即一个方法拦截   new MethodInterceptor()
        enhancer.setCallback(this);
        // 创建代理对象 实例
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("增强前");
        methodProxy.invoke(o,objects);
        System.out.println("增强后");
        return null;
    }
}
