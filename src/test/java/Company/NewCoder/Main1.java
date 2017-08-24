package Company.NewCoder;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @author 范正荣
 * @Date 2017/8/24 0024 上午 8:57.
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Set<Character> set= new HashSet<>();
        int count = 0;
        for (char c : s.toCharArray()){
            if (!set.contains(c)){
                set.add(c);
                count++;
            }
        }
        if (count >2){
            System.out.println(0);
        }else{
            System.out.println(count);
        }
        sc.close();
    }

}
