package HuaWei;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @author 范正荣
 * @Date 2017/9/26 0026 19:14.
 */
public class Test16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String str1 = sc.nextLine();
            String str2 = sc.nextLine();
            replaces(str1,str2);
        }
    }

    public static void replaces(String str1,String str2){
        int len1 = str1.length();
        int len2 = str2.length();
        String str = len1>len2?str1:str2;
        Set<Character> set = new HashSet();
        for (int i=0;i<str1.length();i++){
            set.add(str1.charAt(i));
        }
        for (int i=0;i<str2.length();i++){
            if(set.contains(str2.charAt(i))){
                str1 = str1.replace(String.valueOf(str2.charAt(i)),"_");
                str2 = str2.replace(String.valueOf(str2.charAt(i)),"_");
            }
        }

        System.out.println(str1);
        System.out.println(str2);
    }
}
