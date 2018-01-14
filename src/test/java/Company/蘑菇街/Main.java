package Company.蘑菇街;

import java.util.Scanner;

/**
 * @author 范正荣
 * @Date 2017/9/22 0022 17:26.
 * 最大间隔
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int n = in.nextInt();
            int arr[] = new int[n],i;
            for (i = 0; i < n; i++) {
                arr[i] = in.nextInt();
            }
            int maxFull = Integer.MIN_VALUE,minMaxGap = Integer.MAX_VALUE;
            for ( i=1;i<n;i++){
                maxFull = Math.max(maxFull,arr[i]-arr[i-1]);
            }
            for (i = 1; i < n-1; i++) {
                minMaxGap = Math.min(maxFull,Math.max(arr[i+1]-arr[i-1], maxFull));
            }
            System.out.println(minMaxGap);
        }
        in.close();
    }
}
