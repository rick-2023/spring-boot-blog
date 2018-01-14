package HuaWei;

import java.util.Scanner;

/**
 * @author 范正荣
 * @Date 2017/9/24 0024 16:59.
 */
public class Test8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            StringBuffer sb = new StringBuffer();
            sb.append(sc.next());
            String str = sb.reverse().substring(0,sb.length()-2);
            char[] ch = str.toCharArray();
            int sum = 0;
            for (int i=0;i<ch.length;i++){
                if (ch[i]>='A' && ch[i]<='F'){
                    sum+= (Integer.valueOf(ch[i]-55))*Math.pow(16,i);
                }else{
                    sum+=(Integer.valueOf(ch[i]-48))*Math.pow(16,i);
                }
            }
            System.out.println(sum);
        }
    }
}
