package HuaWei;

import java.util.Scanner;

/**
 * @author 范正荣
 * @Date 2017/8/15 0015 下午 4:27.
 */
public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;

        while (n>0){
            if ((n&1)>0){
                count++;
            }
            n = n>>1;
        }
        System.out.println(count);
    }
}
