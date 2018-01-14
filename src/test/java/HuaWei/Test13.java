package HuaWei;

import java.util.Scanner;

/**
 * @author 范正荣
 * @Date 2017/9/25 0025 9:59.
 * 数字颠倒
 */
public class Test13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String str = sc.nextLine();
            StringBuffer sb = new StringBuffer(str);
            sb.reverse();
            System.out.println(sb.toString());
        }
    }
}
