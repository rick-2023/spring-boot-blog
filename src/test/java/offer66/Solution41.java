package offer66;

import java.util.ArrayList;

/**
 * @author 范正荣
 * @Date 2017/7/27 0027 上午 9:44.
 * 求和为S的正数序列
 */
public class Solution41 {

    public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
        ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
        if (sum<1)
            return lists;

        int left=1,right=2;
        while (left<sum/2) {
            int cur = (left+right)*(right-left+1)/2;
            if (cur == sum) {
                ArrayList<Integer> list = new ArrayList<>();
                for (int i = left; i <= right; i++) {
                    list.add(i);
                }
                lists.add(list);
                left++;
            } else if (cur > sum) {
                left++;
            } else {
                right++;
            }
        }
        return lists;
    }

}
