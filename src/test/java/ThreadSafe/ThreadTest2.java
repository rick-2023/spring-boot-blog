package ThreadSafe;

import org.junit.runner.notification.RunListener;

import javax.servlet.*;
import java.io.IOException;

/**
 * @author 范正荣
 * @Date 2017/7/27 0027 上午 11:32.
 */
@RunListener.ThreadSafe
public class ThreadTest2 implements Servlet{

    private volatile OneValueCache cache = new OneValueCache(null,null);

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
       // BigInteger i  = extractF
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}
