package XML;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 范正荣
 * @Date 2017/9/23 0023 10:35.
 * 深浅拷贝
 */
public class CloneDemo {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        List<Integer> list2 = new ArrayList<>(list1);
        list1.add(2);
        System.out.println(list2.size());
    }
}
