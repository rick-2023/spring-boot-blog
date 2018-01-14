package Company.didi;

import java.util.Scanner;

/**
 * @author 范正荣
 * @Date 2017/8/26 0026 下午 3:37.
 */
public class Main4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] strNum = s.split(" ");
        int[] num = new int[strNum.length];
        for (int i=0;i<num.length;i++){
            num[i] = Integer.parseInt(strNum[i]);
        }
        System.out.println(max(num));
    }

    public static int max(int[] num){
        if (num == null || num.length==0)
            return 0;
        int max = Integer.MIN_VALUE;
        int curSum =0;
        for (int i=0;i<num.length;i++){
            curSum+=num[i];
            if (curSum>max){
                max =curSum;
            }
            curSum = curSum<0?0:curSum;
        }
        return max;
    }
}
