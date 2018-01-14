package Company;

import java.util.Random;
import java.util.Scanner;

/**
 * @author 范正荣
 * @Date 2017/8/12 0012 下午 3:31.
 * 小易喜欢的数列
 */
public class Main6 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = 0;//喜欢的数列个数
        while (in.hasNextInt()) {//注意while处理多个case
            int n = in.nextInt();
            int k = in.nextInt();

            int rows = (int) Math.pow(k, n);
            int cols = k;
            int[][] arr = new int[rows][cols];
            //填充数组
            for (int i = 0; i < rows; i++) {
                for (int j=0;j<k;j++){
                    arr[i][j] = new Random().nextInt(k-1)+1;
                }
            }

            for (int i = 0; i < rows; i++) {
                if (isLike(arr,n,k)){
                    count++;
                }
            }
            System.out.print("count:"+count%1000000007);

        }
        in.close();
    }

    public static boolean isLike(int[][] arr, int n, int k) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length-1; j++) {
                if ((arr[i][j] <=arr[i][j+1] ||arr[i][j+1] % arr[i][j+1] != 0) &&arr[i][j] >= 1 && arr[i][j] <= k && arr.length == n)
                return true;
            }
        }
        return false;
    }

}
