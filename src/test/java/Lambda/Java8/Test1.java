package Lambda.Java8;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

/**
 * @author 范正荣
 * @Date 2017/10/3 0003 8:58.
 */
public class Test1 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("a", "b", "c1", "c2");
        list.stream().filter(s -> s.startsWith("c")).map(String::toUpperCase).sorted().forEach(System.out::println);
    }

    @Test
    public void test1(){
        IntStream.range(1,4).forEach(System.out::println);
    }
}
