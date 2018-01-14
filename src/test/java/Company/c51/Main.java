package Company.c51;

import java.util.*;

/**
 * @author 范正荣
 * @Date 2017/9/18 0018 19:26.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] V = new int[n];
        int[] W = new int[n];
        for (int i = 0; i < n; i++) {
            V[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            W[i] = sc.nextInt();
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (!map.containsKey(V[i])) {
                map.put(V[i], W[i]);
            } else {
                map.put(V[i], map.get(V[i]) + W[i]);
            }
        }
        int i = 0;
        int[] keys = new int[map.size()];
        Iterator iter = map.entrySet().iterator();
        while (iter.hasNext()) {
            Map.Entry entry = (Map.Entry) iter.next();
            Integer key = (Integer) entry.getKey();
            Integer value = (Integer) entry.getValue();
            keys[i++] = key;
        }


    }
}
