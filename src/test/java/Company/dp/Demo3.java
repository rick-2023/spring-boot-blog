package Company.dp;

import org.junit.Test;

/**
 * @author 范正荣
 * @Date 2017/9/20 0020 16:42.
 * 走方格问题
 */
public class Demo3 {
    public static int getMin(int[][] map, int n, int m) {//n-行，m-列
        int[][] dp = new int[n][m];
        for(int i=0;i<n;i++){
            for (int j=0;j<=i;j++){
                dp[i][0] += map[j][0];
            }
        }
        for(int i=0;i<m;i++){
            for (int j=0;j<=i;j++){
                dp[0][i] += map[0][j];

            }
        }
        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                dp[i][j] = Math.min(dp[i-1][j]+map[i][j],dp[i][j-1]+map[i][j]);
            }
        }
        return dp[n-1][m-1];
    }
    @Test
    public void test(){
        int[][] map = new int[2][3];
        int m=1;
        for (int i=0;i<2;i++){
            for (int j=0;j<3;j++){
                map[i][j] = m;
                m++;
            }
        }
        System.out.println(getMin(map,2,3));
    }

}
