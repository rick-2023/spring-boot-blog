package XML;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author 范正荣
 * @Date 2017/9/4 0004 下午 4:53.
 */
public class LockRTest {
    public static void main(String[] args) {
        Lock lock = new ReentrantLock();
        lock.lock();
        try {

        }finally {
            lock.unlock();
        }
    }
}
