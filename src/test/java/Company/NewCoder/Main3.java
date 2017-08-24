package Company.NewCoder;

import java.util.Scanner;

/**
 * @author 范正荣
 * @Date 2017/8/24 0024 上午 9:27.
 */
public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int res = LongStr(s);
        System.out.println(res);
    }

    public static int LongStr(String s){
        char[] cStr = s.toCharArray();
        int max = 1;
        int tmp = 1;
        for (int i=1;i<cStr.length;i++){
            if (cStr[i] == cStr[i-1]){
                 tmp = 1;
            }else {
                tmp++;
                max = Math.max(tmp,max);
            }

        }
        return max;
    }
}
