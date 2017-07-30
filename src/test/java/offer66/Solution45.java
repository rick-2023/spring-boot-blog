package offer66;

import java.util.Arrays;

/**
 * @author 范正荣
 * @Date 2017/7/28 0028 上午 10:04.
 * 扑克牌的顺子
 */
public class Solution45 {
    public boolean isContinuous(int [] numbers) {
            if(numbers == null || numbers.length<5)
                return false;
            int zero = 0,gap = 0;
        Arrays.sort(numbers);
        for (int i=0;i<numbers.length&&numbers[i]==0;i++){
            zero++;
        }
        int small = zero;
        int big = small+1;
        while (big<numbers.length){
            if (numbers[small] == numbers[big])
                return false;
            gap += (numbers[big]-numbers[small]-1);
            small = big;
            big++;
        }
        return zero>=gap;

    }
}
