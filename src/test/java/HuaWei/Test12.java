package HuaWei;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @author 范正荣
 * @Date 2017/9/25 0025 9:53.
 */
public class Test12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String str = sc.nextLine();
            Set set = new HashSet();
            for (int i=0;i<str.length();i++){
                if (str.charAt(i)>=0 && str.charAt(i)<=127){
                    set.add(String.valueOf(str.charAt(i)));
                }
            }
            System.out.println(set.size());
        }
    }
}
