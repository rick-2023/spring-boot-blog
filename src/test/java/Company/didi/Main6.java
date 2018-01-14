package Company.didi;

import java.util.Scanner;

/**
 * @author 范正荣
 * @Date 2017/9/10 0010 下午 3:42.
 */
public class Main6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int number = 0,foundUgly = 0;
        while (foundUgly<n){
            int i = ++number;
            while (i%2 == 0)
                i/=2;
            while (i%3 == 0)
                i/=3;
            while (i%5 == 0)
                i/=5;
            if (i==1)
                foundUgly++;
        }
        System.out.println(number);
    }
}
