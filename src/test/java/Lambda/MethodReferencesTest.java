package Lambda;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Administrator on 2017/7/15 0015.
 */
public class MethodReferencesTest {
    public void print() {
        System.out.println("sdfs");
    }

    @Test
    public void test1() {
        List<String> names = new ArrayList<String>();
        names.add("Mahesh");
        names.add("Suresh");
        names.add("Ramesh");
        names.add("Naresh");
        names.add("Kalpesh");

        names.forEach(System.out::println);
    }

    @Test
    public void test2() {
       // (int x,int y) -> return x+y;
        String[] array = {"gjyg", "ads", "jk"};
        Arrays.sort(array, String::compareToIgnoreCase);

        for (String s:array){
            System.out.println(s);
        }
    }
    /*public void distinctPrimary(String... numbers) {
        List<String> l = Arrays.asList(numbers);
        List<Integer> r = l.stream()
                .map(e -> new Integer(e))
                .filter(e -> Primes.isPrime(e))
                .distinct()
                .collect(Collectors.toList());
        System.out.println("distinctPrimary result is: " + r);
    }*/
}
