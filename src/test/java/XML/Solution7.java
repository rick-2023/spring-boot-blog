package XML;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 范正荣
 * @Date 2017/9/7 0007 下午 2:21.
 */
public class Solution7 {
   /* public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String str = sc.nextLine();
            HashSet set = new HashSet();
            for (int i=0;i<str.length();i++){
                if(str.charAt(i)>=0 && str.charAt(i)<=127){
                    set.add(String.valueOf(str.charAt(i)));
                }
            }
            System.out.println(set.size());
        }


    }

    public void Solution7(){}*/
   public static void main(String args[]) {
       List Listlist1 = new ArrayList();
       Listlist1.add(0);
       List Listlist2 = Listlist1;
       System.out.println(Listlist1.get(0) instanceof Integer);
       System.out.println(Listlist2.get(0) instanceof Integer);
   }
}
