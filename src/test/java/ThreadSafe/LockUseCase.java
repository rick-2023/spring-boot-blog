package ThreadSafe;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author 范正荣
 * @Date 2017/8/21 0021 上午 9:06.
 */
public class LockUseCase {
    public void test() {
        Lock lock = new ReentrantLock();
        lock.lock();
        try {

        } finally {
            lock.unlock();
        }
    }
}
