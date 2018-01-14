package XML;

import java.util.HashSet;
import java.util.Iterator;

/**
 * @author 范正荣j
 * @Date 2017/9/4 0004 下午 4:36.
 */
public class HashSetTest {
    public static void main(String[] args) {
        HashSet set = new HashSet();
        for (int i = 5; i >0; i--) {
            set.add("" + i);
        }
        iteratorHashSet(set);
    }

    private static void iteratorHashSet(HashSet set) {
        for (Iterator iterator = set.iterator(); iterator.hasNext();) {
            System.out.printf("iterator : %s\n", iterator.next());
        }
    }
}
