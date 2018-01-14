package ThreadSafe;

import java.util.concurrent.TimeUnit;

/**
 * @author 范正荣
 * @Date 2017/8/18 0018 下午 2:07.
 */
public class Daemon {
    public static void main(String[] args) {
        Thread thread = new Thread(new DaemonRunner(),"DaemonRunner");
        thread.setDaemon(true);
        thread.start();
    }

    static class DaemonRunner implements Runnable{
        @Override
        public void run() {
            try {
                TimeUnit.SECONDS.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }finally {
                System.out.println("DaemonRunner finally run!!!!");
            }
        }
    }
}
