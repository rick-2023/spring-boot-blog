package offer66;

/**
 * @author 范正荣
 * @Date 2017/7/29 0029 下午 4:07.
 * 寻找数组中重复的数字
 */
public class Solution48 {
    public boolean duplicate(int numbers[],int length,int [] duplication) {
        boolean[] k = new boolean[length];
        for (int i=0;i<k.length;i++){
            if (k[numbers[i]]==true){
                duplication[0] = numbers[i];
                return true;
            }
            k[numbers[i]] = true;
        }
        return false;
    }
}
