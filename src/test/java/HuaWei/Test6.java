package HuaWei;

import java.util.Scanner;
import java.util.TreeSet;

/**
 * @author 范正荣
 * @Date 2017/9/24 0024 14:37.
 */
public class Test6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int n = scanner.nextInt();
            TreeSet<Integer> set = new TreeSet<>();
            for (int i=0;i<n;i++){
                set.add(scanner.nextInt());
            }

            for (Integer i : set){
                System.out.println(i);
            }

        }
    }
}
