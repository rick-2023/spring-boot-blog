package HuaWei;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author 范正荣
 * @Date 2017/8/16 0016 下午 8:24.
 */
public class Test4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {
            String str = in.nextLine();
            if (isVaild(str)){
                System.out.println(reName(str));
            }
        }
    }
    static Map map = new HashMap();
    public static String reName(String str) {
        int a = str.indexOf("@");
        if (a>2) {
            for (int i = a; i >= a - 3; i--) {
                str.replace(str.charAt(i), '*');
                map.put(str,1);
            }
        }
        return str;
    }

    public static  boolean isVaild(String str){
        String emailPattern;
        emailPattern = "^((\\w+([-=.]\\w+)@\\w+{1,119}[-+.]\\w\\.\\w+([-.]\\w+))$";
        if (str.length()>124 || str.matches(emailPattern) ||map.containsKey(str))
            return false;
        return true;
    }
}
