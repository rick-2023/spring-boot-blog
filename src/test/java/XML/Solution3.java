package XML;

import java.util.ArrayList;

/**
 * @author 范正荣
 * @Date 2017/9/6 0006 下午 3:10.
 */

public class Solution3 {
    public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
        ArrayList<ArrayList<Integer>> lists = new ArrayList<ArrayList<Integer>>();
        if (sum <= 1)
            return lists;
        int small = 1;
        int big = 2;

        while (small < (sum + 1) / 2) {
            int sum1 = sumOflist(small, big);
            if (sum1 == sum) {
                ArrayList<Integer> list = new ArrayList<Integer>();
                for (int i = small; i <= big; i++) {
                    list.add(i);
                }
                lists.add(list);
                small++;
                big++;
            } else if (sum1 < sum) {
                big++;
            } else {
                small++;
            }
        }
        return lists;
    }

    public int sumOflist(int small, int big) {
        int sum1 = 0;
        for (int i = small; i <= big; i++) {
            sum1 += i;
        }
        return sum1;
    }
}
