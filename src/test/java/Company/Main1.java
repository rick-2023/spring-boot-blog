package Company;

import java.util.Scanner;

/**
 * @author 范正荣
 * @Date 2017/8/12 0012 上午 9:20.
 */
public class Main1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            int sum = 0;

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt() >> 10;
                sum += arr[i];
            }
            int[] dp = new int[sum/2+1];
            for (int i=0;i<n;i++){
                for (int j=sum/2;j>=arr[i];j--){
                    dp[j] = Math.max(dp[j],dp[j-arr[i]]+arr[i]);
                }
            }
            System.out.println(Math.max(dp[sum/2],sum-dp[sum/2])<<10);
        }
    }
}
