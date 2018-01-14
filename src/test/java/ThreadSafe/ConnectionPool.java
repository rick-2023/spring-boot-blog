package ThreadSafe;

import java.sql.Connection;
import java.util.LinkedList;

/**
 * @author 范正荣
 * @Date 2017/8/19 0019 上午 9:57.
 */
public class ConnectionPool {
    private LinkedList<Connection> pool = new LinkedList<>();

    public ConnectionPool(int initValue){
        if (initValue>0){
            for (int i=0;i<initValue;i++){
                pool.addLast(ConnectionDriver.createConnection());
            }
        }
    }

    public void releaseConnection(Connection connection){
        if (connection != null){
            synchronized (pool){
                pool.addLast(connection);
                pool.notifyAll();
            }
        }
    }

    public Connection fetchConnection(long mills) throws InterruptedException {
        synchronized (pool){
            if (mills<0){//完全超时
                while (pool.isEmpty()){
                    pool.wait();
                }
                return pool.removeFirst();
            }else {
                long future = System.currentTimeMillis()+mills;
                long remaining  = mills;
                while (pool.isEmpty() && remaining>0){
                    pool.wait(remaining);
                    remaining = future-System.currentTimeMillis();
                }
                Connection result = null;
                if (!pool.isEmpty()){
                    result = pool.removeFirst();
                }
                return  result;
            }
        }
    }

}
