package HuaWei;

import java.util.Scanner;

/**
 * @author 范正荣
 * @Date 2017/9/25 0025 15:13.
 */
public class Test15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int N = scanner.nextInt();
            int m = scanner.nextInt();
            int[][] vm = new int[m+1][N+1];
            int[] v = new int[m+1];
            int[] q = new int[m+1];
            int[] vp = new int[m+1];
            for (int i=1;i<=m;i++){
                v[i] = scanner.nextInt();
                vp[i] = scanner.nextInt()*v[i];
                q[i] = scanner.nextInt();
            }

            for (int i=1;i<=m;i++){
                for (int j=1;j<=N;j++){
                    if(q[i] == 0){//主件
                        if (v[i]<=j)
                            vm[i][j] = Math.max(vm[i-1][j],vm[i-1][j-v[i]]+vp[i]);
                    }else {//附件
                        if(v[i] + v[q[i-1]]<= j){
                            vm[i][j] = Math.max(vm[i-1][j],vm[i-1][j-v[i]]+vp[i]);
                        }
                    }
                }
            }
            System.out.println(vm[m+1][N+1]);
        }
    }
}
