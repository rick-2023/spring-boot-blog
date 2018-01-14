package Java特种兵;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by Administrator on 2017/6/24 0024.
 */
public class AtomicIntegerTest {
    public final static AtomicInteger TEST_INTEGER = new AtomicInteger(1);
    private static int index = 1;

    public static void main(String[] args) {
        final CountDownLatch startCountDown = new CountDownLatch(1);
        final  Thread[] threads = new Thread[10];

        for (int i =0;i<10;i++){
            threads[i] = new Thread(){
            };
            threads[i].start();

        }
    }
}
