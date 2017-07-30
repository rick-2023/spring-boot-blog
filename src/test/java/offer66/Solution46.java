package offer66;

/**
 * @author 范正荣
 * @Date 2017/7/28 0028 下午 2:19.
 * 约瑟夫环问题
 */
public class Solution46 {
    public int LastRemaining_Solution(int n, int m) {
        if(n<1 || m<1)
            return -1;
        int last = 0;

        for (int i=2;i<n;i++){
            last = (last+m)%n;
        }
        return last;
    }
}
