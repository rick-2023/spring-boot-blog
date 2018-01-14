package Company.NewCoder;

import java.util.Arrays;
import java.util.Scanner;
public class Main8 {
/** 请完成下面这个process函数，实现题目要求的功能 **/
    /** 当然，你也可以不按照这个模板来作答，完全按照自己的想法来 ^-^  **/
    static class BoxTemplate {
        public int price;
        public int length;
        public int width;
        public int height;
    }
    static class Model{
        public int price;
        public int length;
        public int width;
        public int height;
    }
    private static int process(BoxTemplate boxTemplate,Model[] items,int n)
    {
          if (n>10)
            return -1;
        int count = 0;
        for (int i=0;i<n;i++){
            if (items[i].price>1000)
                count ++;
        }


        int[] v = new int[n-count];
        for (int i=0;i<n-count;i++){
            v[i] = items[i].height*items[i].width*items[i].length;
        }
        int[] p = new int[n-count];
        for (int i=0;i<n-count;i++){
            p[i] = items[i].price;
        }
        Arrays.sort(p);
        Arrays.sort(v);


        int tmpV = 0;
        int tmpP = 0;
        int boxMinNum = count;
        int totolV = boxTemplate.length*boxTemplate.width*boxTemplate.height;
          for (int i=0;i<n-count;i++){

                tmpV += (items[i].height*items[i].width*items[i].length);
                tmpP += items[i].price;

                if (tmpP>CUSTOMS_LIMIT_MONEY_PER_BOX){
                   boxMinNum++;
                   continue;
                }
                if (tmpV>totolV){
                        boxMinNum++;
                        tmpP =items[i].height*items[i].width*items[i].length;
                    }

          }
          return boxMinNum;
    }

    public  final static int CUSTOMS_LIMIT_MONEY_PER_BOX = 2000;
    public static void main(String args[]){

        BoxTemplate boxTemplate = new BoxTemplate();
        Scanner scanner = new Scanner(System.in);

        boxTemplate.price = CUSTOMS_LIMIT_MONEY_PER_BOX;

        while (scanner.hasNext()){
            boxTemplate.length = scanner.nextInt();
            boxTemplate.width = scanner.nextInt();
            boxTemplate.height = scanner.nextInt();

            int itemNum = scanner.nextInt();
            Model[] items = new Model[itemNum];
            for(int i=0; i<itemNum; i++){
                Model item = new Model();
                item.price = scanner.nextInt();
                item.length = scanner.nextInt();
                item.width = scanner.nextInt();
                item.height = scanner.nextInt();
                items[i] = item;
            }
            long startTime = System.currentTimeMillis();

            System.out.println (process(boxTemplate,items,itemNum));

        }
    }

}

//               if ((tmpP<=CUSTOMS_LIMIT_MONEY_PER_BOX && tmpV>totolV) ||(tmpP >CUSTOMS_LIMIT_MONEY_PER_BOX && tmpV<totolV)){
//                    boxMinNum++;
//                    tmpV = 0;
//                    tmpP = 0;
//                }else if(tmpP>CUSTOMS_LIMIT_MONEY_PER_BOX && tmpV>totolV){
//                    boxMinNum++;
//                    tmpV = items[i].height*items[i].width*items[i].length;
//                    tmpP = 0;
//                }