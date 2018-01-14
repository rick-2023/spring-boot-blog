package HuaWei;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * @author 范正荣
 * @Date 2017/9/25 0025 9:30.
 * 合并表记录
 */
public class Test10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int n = sc.nextInt();
            TreeMap<Integer,Integer> map = new TreeMap<>();
            while (n-->0){
                int key = sc.nextInt();
                int value = sc.nextInt();

                if (map.containsKey(key)){
                    map.put(key,map.get(key)+value);
                }else {
                    map.put(key,value);
                }
            }

            for (Map.Entry<Integer, Integer> entry : map.entrySet()){
                System.out.println(entry.getKey()+" "+entry.getValue());
            }
        }
        sc.close();
    }
}
