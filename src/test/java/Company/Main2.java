package Company;

import java.util.Scanner;

/**
 * @author 范正荣
 * @Date 2017/8/12 0012 上午 10:13.
 * 2018网易春招-调整队形
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();
        int n = s.length();
        if (n <= 0 || n > 50) {
            throw new RuntimeException("the length is too long");
        }

        int b =0,g=0,bSum=0,gSum=0;
        for (int i=0;i<n;i++){
            if (s.charAt(i) == 'G'){
                gSum +=i;
                g++;
            }else if (s.charAt(i)=='B'){
                bSum+=i;
                b++;
            }
        }
        System.out.println(Math.min(bSum-b*(b-1)/2,gSum-g*(g-1)/2));
    }
}
