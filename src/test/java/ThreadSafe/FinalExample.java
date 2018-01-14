package ThreadSafe;

/**
 * @author 范正荣
 * @Date 2017/8/23 0023 下午 2:38.
 */
public class FinalExample {
    int i;
    final int j;
    static FinalExample obj;

    public FinalExample() {
        i = 1;
        j = 2;
    }

    public static void writer(){
        obj = new FinalExample();
    }

    public static void reader(){
        FinalExample object = obj;
        int a = object.i;
        int b = object.j;
    }
}
