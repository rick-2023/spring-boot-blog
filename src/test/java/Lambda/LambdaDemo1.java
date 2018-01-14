package Lambda;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Collectors;

/**
 * @author 范正荣
 * @Date 2017/8/23 0023 下午 1:30.
 */
public class LambdaDemo1 {
    public static void donation(Integer money, Consumer<Integer> consumer) {
        consumer.accept(money);
    }

    public static void main(String[] args) {
        donation(100, money -> System.out.println("花费了" + money));
        List<Integer> list = supply(2, () -> (int) Math.random() * 100);
        list.forEach(System.out::println);
    }

    public static List<Integer> supply(Integer num, Supplier<Integer> supplier) {
        List<Integer> resultList = new ArrayList<Integer>();
        for (int x = 0; x < num; x++)
            resultList.add(supplier.get());
        return resultList;
    }

    List<Integer> properties = Arrays.asList(1, 34, 5, 6);

    public void testStream1() throws IOException {
        properties.stream().sorted(Comparator.comparingInt(x -> x)).findFirst().get();
        String str = Files.readAllLines(Paths.get("")).stream().collect(Collectors.joining("\n"));
    }
}
