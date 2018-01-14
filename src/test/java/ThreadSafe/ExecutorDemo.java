package ThreadSafe;

import java.util.concurrent.Executors;

/**
 * @author 范正荣
 * @Date 2017/8/22 0022 下午 3:10.
 */
public class ExecutorDemo {
    public static void main(String[] args) {
        Executors.callable(new Runnable() {
            @Override
            public void run() {

            }
        });

       // Executors.newFixedThreadPool();
//        FutureTask
        }
}
