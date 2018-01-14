package HuaWei;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author 范正荣
 * @Date 2017/9/25 0025 14:47.
 * 字符串最长查找路径
 */
public class Test14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String [n];

        for (int i=0;i<n;i++){
            s[i] = sc.next();
        }
        Arrays.sort(s);
        for (int i=0;i<n;i++){
            System.out.println(s[i]);
        }
    }
}
