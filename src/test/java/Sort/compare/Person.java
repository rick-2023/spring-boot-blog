package Sort.compare;

import lombok.Data;

/**
 * @author 范正荣
 * @Date 2017/9/17 0017 10:55.
 */
@Data
public class Person implements Comparable<Person> {
    int age;
    String name;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Person o) {
        return name.compareTo(o.name);
    }
}
