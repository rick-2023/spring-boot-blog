package Company;

import java.util.Scanner;

/**
 * @author 范正荣
 * @Date 2017/8/12 0012 下午 3:57.
 */
public class Test {
    public static int maxScore(int[] score) {
        int count = 0;
        if (score.length <= 1)
            return count;

        for (int i = 0; i < score.length; i++) {
            if (score[i] == 0) {
                continue;
            } else {
                if (i == 0) {
                    count += score[i] * score[0];
                } else if (i == score.length - 1) {
                    count += score[i] * score[i + 1];
                } else {
                    count += score[i - 1] * score[i] * score[i + 1];
                }
            }
        }
        return count;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] str = sc.nextLine().split(" ");// 输入时以空格隔开数字
        int[] num = new int[str.length];//初始化一个整型数组,长度为你输入数字的个数
        for (int i = 0; i < str.length; i++) {
            num[i] = Integer.parseInt(String.valueOf(str[i]));//将字符转换为int型再赋给整型数组
        }

        int res = maxScore(num);
        System.out.println(res);

    }
}
/*
/*import java.lang.reflect.Array;

import java.util.Scanner;
public class Main {
/** 请完成下面这个process函数，实现题目要求的功能
    private static int process()
    {

    }
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        boxTemplate.price = CUSTOMS_LIMIT_MONEY_PER_BOX;

        while (scanner.hasNext()){
            boxTemplate.length = scanner.nextInt();
            boxTemplate.width = scanner.nextInt();
            boxTemplate.height = scanner.nextInt();

            int itemNum = scanner.nextInt();
            items = new Model[itemNum];
            for(int i=0; i<itemNum; i++){
                Model item = new Model();
                item.price = scanner.nextInt();
                item.length = scanner.nextInt();
                item.width = scanner.nextInt();
                item.height = scanner.nextInt();
                items[i] = item;
            }
            long startTime = System.currentTimeMillis();
            boxMinNum = Integer.MAX_VALUE;
            System.out.println (process());

        }
    }

}*/