package XML;

import java.util.HashMap;

/**
 * @author 范正荣
 * @Date 2017/8/27 0027 下午 4:37.
 */
public class StringDemo {
    public static void main(String[] args) {
        String str1 = "hello world";
        String str2 = new String("hello world");
        String str3 = "hello world";
        String str4 = new String("hello world");

        System.out.println(str1==str2);
        System.out.println(str1==str3);
        System.out.println(str2==str4);

        HashMap map = new HashMap();
        Object o;
    }
}
