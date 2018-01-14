package XML;

/**
 * @author 范正荣
 * @Date 2017/9/6 0006 下午 5:00.
 */
public class Solution6 {
    public boolean isContinuous(int [] numbers) {
        int[] d = new int[14];
        int max = -1;
        int min = 14;

        for (int i=0;i<numbers.length;i++){
            d[numbers[i]]++;
            if(numbers[i] == 0)
                continue;
            if (d[numbers[i]]>1)
                return false;
            if (numbers[i]>max)
                max = numbers[i];
            if (numbers[i]<min)
                min = numbers[i];
        }

        if (max-min<5)
            return true;
        return false;
    }
}
