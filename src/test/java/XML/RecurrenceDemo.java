package XML;

/**
 * @author 范正荣
 * @Date 2017/10/1 0001 20:03.
 */

public class RecurrenceDemo {
    class Test {
        public void hello() {
            System.out.println("hello");
        }
    }

    public static void main(String[] args) {


        Test test = null;
        test.hello();
    }

    static long count;

    public static long fibonacci(int n) {
        count++;//计数
        if (n <= 2)
            return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }


}
