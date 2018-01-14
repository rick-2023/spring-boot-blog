package ThreadSafe;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * @author 范正荣
 * @Date 2017/8/18 0018 下午 3:47.
 */
public class WaitNotify {
    static boolean flag = true;
    static Object lock = new Object();

    public static void main(String[] args) throws InterruptedException {
        Thread waitThread = new Thread(new Wait(),"waitThread");
        waitThread.start();

        TimeUnit.SECONDS.sleep(1);
        Thread notifyThread = new Thread(new Notify(),"notifyThread");
        notifyThread.start();
    }

    static class Wait implements Runnable{

        @Override
        public void run() {
            synchronized (lock){
                //当条件不满足，继续wait,同时释放lock锁
                try {
                    System.out.println(Thread.currentThread()+"flag is true. wait@ "+new SimpleDateFormat("HH:mm:ss").format(new Date()));
                    lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            //条件满足，完成工作
            System.out.println(Thread.currentThread()+"flag is flag. running@ "+new SimpleDateFormat("HH:mm:ss").format(new Date()));
        }
    }

    static class Notify implements Runnable{

        @Override
        public void run() {
            synchronized (lock) {
                System.out.println(Thread.currentThread() + "hold lock notify @ " + new SimpleDateFormat("HH:mm:ss").format(new Date()));
                lock.notifyAll();
                flag = false;
                SleepUtils.second(5);
            }
            synchronized(lock){
                System.out.println(Thread.currentThread()+"hold lock again sleep @ "+new SimpleDateFormat("HH:mm:ss").format(new Date()));
                SleepUtils.second(5);
            }
        }

    }
}
