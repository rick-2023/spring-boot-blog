package offer66;

/**
 * @author 范正荣
 * @Date 2017/7/27 0027 下午 6:43.
 */
public class Solution43 {
    public String LeftRotateString(String str,int n) {
        int len = str.length();
        if (len == 0)
            return "";
        n = n%len;
        str+=str;

        return str.substring(n,len+n);
    }
    @org.junit.Test
    public void test(){
        String str = "abcXYZ";
        System.out.println(LeftRotateString(str,2));
    }
}
