package ThreadSafe;

import java.util.concurrent.TimeUnit;

/**
 * @author 范正荣
 * @Date 2017/8/18 0018 下午 2:20.
 */
public class Interrupted {
    public static void main(String[] args) throws Exception {
        Thread sleepThread = new Thread(new SleepRunner(),"sleepThread");
        sleepThread.setDaemon(true);

        Thread busyThread = new Thread(new BusyRunner(),"busyThread");
        busyThread.setDaemon(true);

        sleepThread.start();
        busyThread.start();

        TimeUnit.SECONDS.sleep(5);//休眠5秒
        sleepThread.interrupt();
        busyThread.interrupt();
        System.out.println("sleepThread interrupted is "+ sleepThread.isInterrupted());
        System.out.println("busyThread interrupted is "+ busyThread.isInterrupted());

        TimeUnit.SECONDS.sleep(2);//休眠2秒

    }
    static class BusyRunner implements  Runnable{

        @Override
        public void run() {
            while (true){

            }
        }
    }

    static class SleepRunner implements Runnable{

        @Override
        public void run() {
            while (true){
                SleepUtils.second(10);
            }
        }
    }
}
