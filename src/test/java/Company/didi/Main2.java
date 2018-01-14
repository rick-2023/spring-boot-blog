package Company.didi;

import java.util.Scanner;

/**
 * @author 范正荣
 * @Date 2017/8/26 0026 上午 10:32.
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = 0;
        for (int i=n;i>=5;i--){
            int tmp = i;
            while (tmp%5 == 0){
                res++;
                tmp/=5;
            }
        }
        System.out.println(res);
    }
}
