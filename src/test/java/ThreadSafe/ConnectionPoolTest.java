package ThreadSafe;

import java.sql.Connection;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author 范正荣
 * @Date 2017/8/19 0019 上午 9:34.
 */
public class ConnectionPoolTest {
    static ConnectionPool pool = new ConnectionPool(10);
    static CountDownLatch start =new CountDownLatch(1);

    static CountDownLatch end;

    public static void main(String[] args) {
        int threadCount = 10;
        end = new CountDownLatch(threadCount);

        int count = 20;
        AtomicInteger got = new AtomicInteger();
        AtomicInteger notGot = new AtomicInteger();

        for (int i=0;i<threadCount;i++){
            Thread thread = new Thread(new ConnectionRunner(count,got,notGot),"ConectionRunnerThread");
        }
    }

    static class ConnectionRunner implements Runnable{
        int count;
        AtomicInteger got;
        AtomicInteger notGot;

        public ConnectionRunner(int count, AtomicInteger got, AtomicInteger notGot) {
            this.count = count;
            this.got = got;
            this.notGot = notGot;
        }

        @Override
        public void run() {
            try {
                start.await();
            } catch (InterruptedException e) {
            }

            while (count>0){
                try {
                    Connection connection = pool.fetchConnection(1000);
                    if (connection != null){
                        try {
                            connection.createStatement();
                            connection.commit();
                        }finally {
                            pool.releaseConnection(connection);
                            got.incrementAndGet();
                        }
                    }else{
                            notGot.incrementAndGet();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }finally {
                    count--;
                }
            }
            end.countDown();
        }
    }
}
