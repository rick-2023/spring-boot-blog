package offer66;

/**
 * @author 范正荣
 * @Date 2017/8/15 0015 上午 9:37.
 */

import java.util.Scanner;

public class Demo {


    /** 请完成下面这个函数，实现题目要求的功能 **/
    /**
     * 当然，你也可以不按照这个模板来作答，完全按照自己的想法来 ^-^
     **/
    static int maxScore(int[] score) {
        int total = 0;
        if (score.length <= 1) { //数组长度为0的时候 & 不存在左边和右边的时候
            return total;
        }
        for (int i = 0; i < score.length; i++) {
            if (score[i] == 0) { //分数为0的时候
                continue;
            } else {
                if (i == 0) { //左边不存在的时候
                    total += score[i] * score[i + 1];
                } else if (i == score.length - 1) {//右边不存在的时
                    total += score[i] * score[0];
                } else {
                    total += score[i - 1] * score[i] * score[i + 1];
                }
            }
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int res;
        int _score_size = 0;
        _score_size = Integer.parseInt(in.nextLine().trim());
        int[] _score = new int[_score_size];
        int _score_item;
        for (int _score_i = 0; _score_i < _score_size; _score_i++) {
            _score_item = Integer.parseInt(in.nextLine().trim());
            _score[_score_i] = _score_item;
        }
        res = maxScore(_score);
        System.out.println(String.valueOf(res));
    }
}

