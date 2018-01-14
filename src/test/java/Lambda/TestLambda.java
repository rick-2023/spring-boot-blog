package Lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * Created by Administrator on 2017/7/15 0015.
 */
public class TestLambda {
    public static void main(String[] args) {
       // Comparator<String> comparator = (first, second) -> first.length() - second.length();
        //  Arrays.asList("a","b","c").forEach(e -> System.out.println(e));
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        //eval(list,abc->true);
        //eval(list,abc->false);
        eval(list, a -> a % 2 == 0);
    }

    public static void eval(List<Integer> list, Predicate<Integer> predicate){
            list.forEach(integer -> {if(predicate.test(integer)) System.out.println(integer);});
    }
}
