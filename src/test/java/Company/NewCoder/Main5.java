package Company.NewCoder;

import java.util.Scanner;

/**
 * @author 范正荣
 * @Date 2017/8/24 0024 上午 10:01.
 */
public class Main5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int x = sc.nextInt();
            int f = sc.nextInt();
            int d = sc.nextInt();
            int p = sc.nextInt();

            System.out.println(liveDays(x, f, d, p));
        }

    }

    public static int liveDays(int x, int f, int d, int p) {
        int left = d - x * f;
        int OneCast = x + p;
        if (left >= 0)
            return left / OneCast + f;
        else
            return d/x;
    }
}
