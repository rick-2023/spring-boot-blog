package offer66;

/**
 * @author 范正荣
 * @Date 2017/7/28 0028 下午 3:34.
 * 字符串转换为数字，需要考虑的特殊用例有很多
 */
public class Solution47 {
    public int StrToInt(String str) {
        if (str == null || str.length() < 1)
            throw new NumberFormatException(str);
        char first = str.charAt(0);
        if (first == '-') {
            return parseString(str, 1, false);
        } else if (first == '+') {
            return parseString(str, 1, true);
        } else if (first <= '9' && first >= '0') {
            return parseString(str, 0, true);
        } else {
            return 0;
        }
    }

    public static boolean isDigit(char c) {
        return c <= '9' && c >= '0';
    }

    private int parseString(String num, int index, boolean b) {
        if (index >= num.length()) {
            return 0;
        }
        int result;
        long tmp = 0;
        while (index < num.length() && isDigit(num.charAt(index))) {
            tmp = 10 * tmp + num.charAt(index) - '0';
            if (tmp > 0x8000_0000L) {
                return 0;
            }
            index++;
        }
        if (b) {
            if (tmp >= 0x8000_0000L)
                return 0;
            else
                result = (int) tmp;
        } else {
            if (tmp == 0x8000_000L)
                result = 0x8000_000;
            else
                result = (int) -tmp;
        }
        return result;
    }



    public int test(String str) {
        if (str == null || str.length() == 0)
            return 0;
        char[] ch = str.toCharArray();
        int sum = 0;
        int len = str.length();
        for (int i=0;i<len;i++){
            if ((ch[i]=='+' || ch[i]=='-')&& i==0){
                continue;
            }else if (!Character.isDigit(ch[i])){
                return 0;
            }else{
                int num = ch[i]-48;
                sum = (int)(sum*10+num);
            }
        }
        if (ch[0]=='-')
            sum = -sum;
    return sum;
    }
    @org.junit.Test
    public void test(){
        System.out.println(test("121"));
    }
}