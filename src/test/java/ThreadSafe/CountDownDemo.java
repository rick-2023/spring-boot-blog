package ThreadSafe;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author 范正荣
 * @Date 2017/8/19 0019 上午 10:47.
 */
public class CountDownDemo {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newCachedThreadPool();
        CountDownLatch latch = new CountDownLatch(3);
        Worker w1 = new Worker(latch,"张三");
        Worker w2 = new Worker(latch,"张四");
        Worker w3 = new Worker(latch,"张五");

        Boss boss = new Boss(latch);

        executor.execute(w3);
        executor.execute(w2);
        executor.execute(w1);
        executor.execute(boss);

        executor.shutdown();
    }
}
