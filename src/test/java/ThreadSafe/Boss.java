package ThreadSafe;

import java.util.concurrent.CountDownLatch;

/**
 * @author 范正荣
 * @Date 2017/8/19 0019 上午 10:46.
 */
public class Boss implements Runnable {

    private CountDownLatch downLatch;

    public Boss(CountDownLatch downLatch){
        this.downLatch = downLatch;
    }
    @Override
    public void run() {
        System.out.println("老板在等所有人工作");
        try {
            this.downLatch.await();
        } catch (InterruptedException e) {
        }
        System.out.println("工人活都干完了，老板开始检查了！");
    }
}
