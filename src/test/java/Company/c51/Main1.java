package Company.c51;

import java.util.Scanner;

/**
 * @author 范正荣
 * @Date 2017/9/18 0018 19:50.
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] V = new int[n];
        int[] W = new int[n];
        for (int i = 0; i < n; i++) {
            V[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            W[i] = sc.nextInt();
        }

    }
}
