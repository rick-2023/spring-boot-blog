package ThreadSafe;

/**
 * @author 范正荣
 * @Date 2017/8/16 0016 下午 10:18.
 */
public class Demo {
    public static void main(String[] args) {
        if ((1&1)==0){
            System.out.println(111);
        }else {
            System.out.println(222);
        }
    }
}
