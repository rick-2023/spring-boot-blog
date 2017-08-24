package Company.NewCoder;

import java.util.Scanner;

/**
 * @author 范正荣
 * @Date 2017/8/24 0024 上午 9:07.
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] seq = new int[n];
       for (int i=0;i<n;i++){
            seq[i] = sc.nextInt();
       }
        if (isAriSeq(seq,n)){
            System.out.println("有可能");
        }else
            System.out.println("不可能");
    }

    public static boolean isAriSeq(int[] seq,int n){
        if (seq.length<1)
            return false;

        int sum = 0;
        int min = Integer.MAX_VALUE;

        for(int i=0;i<n;i++){
            sum+=seq[i];
            min = Math.min(min,seq[i]);
        }
        if ((2 *(sum-n*min))%(n*(n-1)) == 0)
            return true;
        return false;
    }
}
