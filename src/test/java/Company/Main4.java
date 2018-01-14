package Company;

import java.util.Scanner;

/**
 * @author 范正荣
 * @Date 2017/8/12 0012 上午 10:51.
 * 2018网易春招-魔力手环
 */

public class Main4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int[][] arr = new int[1][n];
        for (int i = 0; i < n; i++) {
            arr[0][i] = sc.nextInt();
        }

        //初始化单位矩阵
        int[][] mul = new int[n][n];

        for (int i = 0; i < n; i++) {
            if (i < n - 1) {
                mul[i][i] = 1;
                mul[i + 1][i] = 1;
            } else {
                mul[i][i] = 1;
                mul[0][i] = 1;
            }
        }
        for(;k>0;k>>=1){
            if ((k&1)==1) {
                arr = Core(arr, mul);
            }
            mul = Core(mul,mul);
        }
        int i;
        for (i = 0; i < n - 1; i ++) {
            System.out.print(arr[0][i] + " ");
        }
        System.out.println(arr[0][i]);
    }

    private static int[][] Core(int[][] a, int[][] b) {

        int rowRes = a.length;
        int columnRes = b[0].length; //TODO:
        int columnA = a[0].length;

        int[][] c = new int[rowRes][columnRes];
        for (int i = 0; i < rowRes; i++) {
            for (int j = 0; j < columnRes; j++) {
                for (int k =0;k<columnA;k++){
                    if (a[i][k] == 0 || a[k][j] == 0) {
                        continue;
                    }
                    c[i][j] += a[i][k]*b[k][j];
                }
                if (c[i][j] >= 100) {
                    c[i][j] %= 100;
                }
            }
        }
        return c;
    }
}
