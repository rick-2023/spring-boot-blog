package XML;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * @author 范正荣
 * @Date 2017/8/17 0017 下午 5:26.
 */
public class DequeueTest {
    static void fillTest(Deque<Integer> deque){
        for(int i=20;i<27;i++){
            deque.addFirst(i);
        }
        for (int i=50;i<55;i++){
            deque.addLast(i);
        }
    }

    public static void main(String[] args) {
        Deque<Integer> di = new ArrayDeque<>();
        ConcurrentLinkedQueue q;
        ConcurrentLinkedDeque ww;
        fillTest(di);
        while (di.size() != 0){
            System.out.println(di.removeFirst());
        }
    }
}
