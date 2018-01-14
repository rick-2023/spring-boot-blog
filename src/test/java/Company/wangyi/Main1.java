package Company.wangyi;

import java.util.Scanner;

/**
 * @author 范正荣
 * @Date 2017/9/9 0009 下午 3:23.
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            while (sc.hasNext()) {
                int n = sc.nextInt();
                int[] A = new int[n];
                for (int i = 0; i < A.length; i++) {
                    A[i] = sc.nextInt();
                }
                help(A);
            }
        }
    }

    public static int hasTwo(int k) {
        int count = 0;
        while (k % 2 == 0) {
            count++;
            k /= 2;
        }
        return count;
    }


    public static void help(int[] A) {
        int two = 0, four = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] % 4 == 0){
                four++;
            }
            two += hasTwo(A[i]);
        }

        if (four >= (A.length / 2) || (two % 4 == 0 && two>0)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}