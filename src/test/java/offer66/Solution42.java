package offer66;

import java.util.ArrayList;

/**
 * @author 范正荣
 * @Date 2017/7/27 0027 下午 5:33.
 * 求数组中和为S的两个数字
 */
public class Solution42 {
    public ArrayList<Integer> FindNumbersWithSum(int[] array, int sum) {
        ArrayList<Integer> result = new ArrayList<>(2);
        if (array.length < 2 || array == null) {
            return result;
        }
        int left = 0, right = array.length - 1;
        long cur;
        while (left < right) {
            cur = array[left] + array[right];
            if (cur == sum) {
                if (result.size() == 0) {
                    result.add(array[left]);
                    result.add(array[right]);
                }else {
                    if(result.get(0)*result.get(1) > cur){
                        result.remove(0);
                        result.remove(0);
                        result.add(array[left]);
                        result.add(array[right]);
                    }
                }
                left++;
                right--;
            }else if(cur>sum){
                right--;
            }else {
                left++;
            }
        }
        return result;
    }
}

