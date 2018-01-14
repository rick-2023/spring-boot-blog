package HuaWei;

import java.util.Scanner;

/**
 * @author 范正荣
 * @Date 2017/9/24 0024 10:19.
 * 字符出现的个数
 */
public class Test5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String all = "";
        String one = "";
        char[] ac;
        char temp;
        int num = 0;
        while (s.hasNext()) {
            all = s.nextLine();
            one = s.nextLine();
            ac = all.toCharArray();

            for (int i=0;i<ac.length;i++){
                if(one.equalsIgnoreCase(String.valueOf(ac[i]))){
                    num++;
                }
            }
            System.out.println(num);
        }
    }
}
