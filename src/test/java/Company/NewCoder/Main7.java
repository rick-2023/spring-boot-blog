package Company.NewCoder;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author 范正荣
 * @Date 2017/8/24 0024 上午 10:29.
 */
public class Main7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println(diffMax(a,n));
    }

    public static int diffMax(int[] a,int n){
        Arrays.sort(a);

        int min = a[0];
        int max = a[n-1];

        int diff = max-min;
        int minIdx = 1;
        int maxIdx = n-2;

        while (minIdx<maxIdx){
            diff += max-a[minIdx];
            diff += a[maxIdx]- min;

            max = a[maxIdx--];
            min = a[minIdx++];
        }
        //最后一个数
        diff+= Math.max(max-a[minIdx],a[maxIdx]-min);
        return diff;
    }
}
