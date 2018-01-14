package ThreadSafe;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author 范正荣
 * @Date 2017/8/11 0011 下午 3:36.
 */
public class ConHashMap1 {

    final HashMap<String,String> map = new HashMap<>(2);
    ConcurrentHashMap map1;
    Thread t = new Thread(new Runnable() {
        @Override
        public void run() {
            for (int i=0;i<1000;i++){

            }
        }
    });
}
