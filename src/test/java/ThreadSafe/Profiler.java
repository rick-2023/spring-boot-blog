package ThreadSafe;

import java.util.concurrent.TimeUnit;

/**
 * @author 范正荣
 * @Date 2017/8/19 0019 上午 9:13.
 */
public class Profiler {
    private static final ThreadLocal<Long> TIME_THREADLOAL =new ThreadLocal<Long>(){
        protected Long initalValue(){
            return System.currentTimeMillis();
        }
    };

    public static final void begin(){
        TIME_THREADLOAL.set(System.currentTimeMillis());
    }

    public static final Long end(){
        return System.currentTimeMillis()-TIME_THREADLOAL.get();
    }

    public static void main(String[] args) throws InterruptedException {
        Profiler.begin();
        TimeUnit.SECONDS.sleep(1);
        System.out.println("cost "+Profiler.end()+" mills");
    }
}
