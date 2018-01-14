package HuaWei;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author 范正荣
 * @Date 2017/8/16 0016 下午 7:06.
 */
public class Test3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {//注意while处理多个case
            String num1 = in.nextLine();
            String num2 = in.nextLine();
            int res = findCommon(num1, num2);
            System.out.println(res);
        }
    }

    public static boolean isNum(String num) {
        return num.matches("[0-9]{1,}");
    }

    public static int findCommon(String num1, String num2) {
        int count = 0;
        int len1 = num1.length();
        int len2 = num2.length();
        List<Integer> list = new ArrayList<>();
        if (len1 != len2 || !isNum(num1) || !isNum(num2)) {
            return -1;
        } else {
           for (int i=0;i<len1;i++){
               if (num1.charAt(i) == num2.charAt(i)){
                   count++;
                   list.add(count);
               }else{
                   count=0;
               }
            }

            int max = 0;
            for (int i=0;i<list.size();i++) {
                if (list.get(i) > max) {
                    max = list.get(i);
                }
            }
            return max<=1?0:max;
        }
        }
    }

