package HuaWei;

import java.util.Scanner;

/**
 * @author 范正荣
 * @Date 2017/9/24 0024 17:07.
 * 质数因子
 */
public class Test9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            long num = sc.nextLong();
            getResult(num);
        }
    }

    public static  void  getResult(long number){
        long num = number;
        while (num!=1){
            for (int i=2;i<=num;i++){
                if (num %i == 0){
                    num/=i;
                    System.out.print(i+" ");
                    break;
                }
            }
        }
    }
}
