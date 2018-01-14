package Company.蘑菇街;


import java.util.Scanner;

/**
 * @author 范正荣
 * @Date 2017/9/23 0023 18:05.
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            boolean success = true;
            int ind = -1;
            int p = scanner.nextInt();//篮筐
            int n = scanner.nextInt();//篮球
            int[] book = new int[p];//袋子中是否有篮球
            int[] x = new int[n];//每个篮球的编号

            for (int i=0;i<n;i++){
                x[i] = scanner.nextInt();
            }
            for (int i=0;i<n;i++){
                if (book[x[i]%p]==1){
                    success = false;
                    ind = i+1;
                    break;
                }else {
                    book[x[i]%p] =1;
                }
            }
            System.out.println(ind);
        }
    }
}
