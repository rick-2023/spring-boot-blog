package HuaWei;

import org.junit.Test;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * @author 范正荣
 * @Date 2017/8/15 0015 下午 4:40.
 */
public class Test2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double d = sc.nextDouble();

        int dint = (int) d;
        if ((d - dint) >= 0.5 && (d - dint < 1))
            dint++;
        System.out.println(dint);
    }

    @Test
    public void test() {

        BigDecimal i = new BigDecimal(3.5f).setScale(0, BigDecimal.ROUND_HALF_UP);

        System.out.println(i);
    }
}
