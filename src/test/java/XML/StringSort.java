package XML;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author 范正荣
 * @Date 2017/10/3 0003 9:33.
 */
public class StringSort {
    public static void main(String[] args) {
        String[] s= {"abcd","abcde","abcf","abc"};
        Arrays.sort(s);
        for (String ss:s
             ) {
            System.out.println(ss);
        }
    }
    @Test
    public void test(){
        int[] a={1,2,3,5,4};
        for (int i=1;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
