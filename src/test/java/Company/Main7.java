package Company;

import java.util.Scanner;

/**
 * @author 范正荣
 * @Date 2017/8/12 0012 上午 9:20.
 */
public class Main7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int x = sc.nextInt();//roomPay
            int f = sc.nextInt();//left friut
            int d = sc.nextInt();//money
            int p = sc.nextInt();//friut price

            int leftMoney = d-x*f;
            int days ;//要加上f

            int minDays = leftMoney/(Math.max(p,x));
            //int maxDays = leftMoney/(x>p?x:p);

            while(minDays>=0){
                 int m1 = leftMoney%(Math.max(p,x));
                 int days1 = m1/(Math.min(p,x));
                 if (days1<minDays)
                     minDays =days1;
            }
        }
        System.out.println();
    }
}
