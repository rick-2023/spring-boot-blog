package XML;

import java.util.Arrays;

/**
 * @author 范正荣
 * @Date 2017/10/2 0002 15:37.
 */
public class ArrayDemo {
    public static void main(String[] args) {
        int[] n ={2,1,4,3};
        Arrays.sort(n);
        for (int i=0;i<n.length;i++){
            System.out.println(n[i]);
        }
    }
}
