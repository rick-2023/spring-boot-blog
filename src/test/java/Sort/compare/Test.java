package Sort.compare;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author 范正荣
 * @Date 2017/9/17 0017 11:00.
 */
public class Test {
    public static void main(String[] args) {
        ArrayList<Person> list = new ArrayList<Person>();
        // 添加对象到ArrayList中
        list.add(new Person("ccc", 20));
        list.add(new Person("AAA", 30));
        list.add(new Person("bbb", 10));
        list.add(new Person("ddd", 40));

        System.out.printf("Original sort, list:%s\n", list);

        Collections.sort(list,new AscAgeComparator());
        System.out.printf("Desc(age) sort, list:%s\n", list);
    }
}
