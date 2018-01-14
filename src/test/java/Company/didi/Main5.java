package Company.didi;

import java.util.Scanner;

/**
 * @author 范正荣
 * @Date 2017/8/26 0026 下午 3:50.
 */
public class Main5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String s = sc.nextLine();
            int k = sc.nextInt();
            String[] strNum = s.split(" ");
            int[] num = new int[strNum.length];
            for (int i = 0; i < num.length; i++) {
                num[i] = Integer.parseInt(strNum[i]);
            }
            topk(num, k, 0, num.length - 1);
        }
    }

    public static int partion(int[] num, int left, int right) {
        int x = num[left];
        while (left < right) {
            while (num[right] <= x && left < right)
                --right;
            num[left] = num[right];

            while (num[left] >= x && left < right)
                ++left;
            num[right] = num[left];

        }
        num[right] = x;
        return right;
    }

    public static void topk(int[] num, int k, int left, int right) {
        int tmp = partion(num, left, right);
        if (tmp == k - 1) {
            System.out.println(num[tmp]);
        } else if (tmp > k - 1) {
            topk(num, k, left, tmp - 1);
        } else {
            topk(num, k, tmp + 1, right);
        }
    }

}
