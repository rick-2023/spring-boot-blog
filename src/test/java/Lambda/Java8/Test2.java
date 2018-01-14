package Lambda.Java8;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author 范正荣
 * @Date 2017/10/3 0003 10:24.
 */

@FunctionalInterface
interface Converter<F, T> {
    T convert(F from);
}

public class Test2 {
    public void test1() {
        List<String> names = Arrays.asList("peter", "anna", "mike", "xenia");
        Collections.sort(names, (a, b) -> b.compareTo(a));
    }

    @Test
    public void test2() {
        Converter<String, Integer> converter = (from) -> Integer.valueOf(from);
        Integer integer = converter.convert("123");
        System.out.println(integer);
    }

    @Test
    public void test3(){
        PersonFactory<Person> personFactory = Person::new;
        Person p = personFactory.create("a","b");
    }
}
