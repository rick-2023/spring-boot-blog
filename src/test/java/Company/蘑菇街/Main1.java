package Company.蘑菇街;

import java.util.Scanner;

/**
 * @author 范正荣
 * @Date 2017/9/23 0023 16:42.
 * 聊天
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int p = scanner.nextInt();
            int q = scanner.nextInt();
            int l = scanner.nextInt();
            int r = scanner.nextInt();
            int[][] a = new int[p][2];
            int[][] b = new int[q][2];

            for (int i=0;i<p;i++){
                a[i][0] = scanner.nextInt();
                a[i][1] = scanner.nextInt();
            }
            for (int i=0;i<q;i++){
                b[i][0] = scanner.nextInt();
                b[i][1] = scanner.nextInt();
            }
            System.out.println(getUpTime(l, r, a, b));
        }
    }
    public static int getUpTime(int l,int r,int[][] a,int[][] b){
        int count=0;
        for(int i=l;i<=r;i++){
            if(isProperTime(a,b,i)){
                count++;
            }
        }
        return count;
    }

    public static boolean isProperTime(int[][] A,int[][] B,int d){
        for (int i=0;i<A.length;i++){
           int a1 = A[i][0];
           int a2 = A[i][1];
           for (int j=0;j<B.length;j++){
               int b1 = B[j][0]+d;
               int b2 = B[j][1]+d;
               if(b1<=a2 && b2>=a1)
                   return true;
           }
        }
        return false;
    }

}
