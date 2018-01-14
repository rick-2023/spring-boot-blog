package HuaWei;

import java.util.Scanner;

/**
 * @author 范正荣
 * @Date 2017/9/24 0024 14:55.
 * 字符串分隔
 */
public class Test7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String  s = new String(scanner.nextLine());
            if(s.length()%8 != 0){
                s = s+"00000000";
        }
        while (s.length()>=8){
            System.out.println(s.substring(0,8));
            s = s.substring(8);
        }
    }


    }
}
