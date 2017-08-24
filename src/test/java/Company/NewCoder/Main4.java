package Company.NewCoder;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author 范正荣
 * @Date 2017/8/24 0024 上午 9:34.
 */
public class Main4 {
    public static void main(String[] args) {
       /* Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        reverSe(a,n);*/
        System.out.println(2%1);
    }

    public static void reverSe(int[] a, int n) {
        Deque<Integer> deque = new LinkedList<>();
        boolean flag = false;
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            if (flag) {
                deque.addFirst(a[i]);
            } else {
                deque.addLast(a[i]);
            }
            flag = !flag;
        }
        if (flag) {
            while (deque.size() != 1) {
                System.out.print(deque.pollLast()+" ");
            }
            System.out.println(deque.pollLast());
        } else {
            while (deque.size() != 1) {
                System.out.print(deque.pollFirst()+" ");
            }
            System.out.println(deque.pollFirst());
        }
    }
}
