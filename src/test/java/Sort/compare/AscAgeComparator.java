package Sort.compare;

import java.util.Comparator;

/**
 * @author 范正荣
 * @Date 2017/9/17 0017 10:59.
 */
public class AscAgeComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return o1.getAge()-o2.getAge();
    }
}
