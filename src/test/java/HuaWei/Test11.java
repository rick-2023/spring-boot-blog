package HuaWei;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @author 范正荣
 * @Date 2017/9/25 0025 9:42.
 * 提取不重复的值
 */
public class Test11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String str = sc.nextLine();
            char[] ch = str.toCharArray();
            Set<Character> set = new LinkedHashSet();
            for (int i=ch.length-1;i>=0;i--){
                set.add(ch[i]);
            }
            String res = "";
            for (Character c :set){
                res+=c+"";
            }
            System.out.println(res);
        }
    }
}
