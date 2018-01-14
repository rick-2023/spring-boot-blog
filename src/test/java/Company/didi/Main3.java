package Company.didi;

import java.util.Scanner;
import java.util.Stack;

/**
 * @author 范正荣
 * @Date 2017/8/26 0026 上午 10:42.
 */
public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        transfer(M,N);
    }

    public static void transfer(int M,int N){
        Stack s = new Stack();
        char[] chars = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
       if (M>=0) {
           while (M > 0) {
               s.push(chars[M % N]);
               M /= N;
           }
       }else{
          M= -M;
           while (M > 0) {
               s.push(chars[M % N]);
               M /= N;
           }
           s.push('-');
       }

        while (!s.isEmpty()){
            System.out.print(s.pop());
        }
    }
}
