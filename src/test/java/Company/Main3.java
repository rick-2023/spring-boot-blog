package Company;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author 范正荣
 * @Date 2017/8/12 0012 上午 10:36.
 * 2018网易春招-消除重复元素
 */
public class Main3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i= 0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            ArrayList<Integer> list = new ArrayList<>();
            for (int i= n-1;i>=0;i--){
                if (!list.contains(arr[i])){
                    list.add(arr[i]);
                }
            }

            for (int i=list.size()-1;i>=0;i--){
                System.out.print(list.get(i));
                if (i!=0)
                    System.out.print(" ");
            }

        }
    sc.close();
    }

}
