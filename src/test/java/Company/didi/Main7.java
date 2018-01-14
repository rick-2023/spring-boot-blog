package Company.didi;

import java.util.Scanner;

/**
 * @author 范正荣
 * @Date 2017/9/10 0010 下午 3:58.
 */
public class Main7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(help(arr));
        sc.close();
    }

    public static int help(int[] arr) {
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0)
                k++;
        }
        int x = arr[0];
        int j = 1;
        while (j < arr.length) {
            if (arr[j] == 0)
                j++;
            x = arr[j];

            if ((x ^ arr[++j]) == 0) {
                k++;
            }
            j++;
        }
        return k;
    }


}
