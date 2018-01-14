package Sort;

import org.junit.Test;

/**
 * @author 范正荣
 * @Date 2017/8/13 0013 下午 2:28.
 * 快速排序
 * 时间复杂度在最坏情况下是O(N2)，平均的时间复杂度是O(N*lgN·)
 * 快速排序的优化1,固定位置选取，2，随机位置选取，3.三值取中法
 */
public class QuickSort {

    public void quickSort(int[] a, int left, int right) {
        if (left < right) {
            int i = left;
            int j = right;
            int x = a[i];//基准

            while (i < j) {
                while (i < j && a[j]>x) {//从右往左寻找第一个小于基准的数
                    j--;
                }
                if (i < j)
                    a[i++] = a[j];

                while (i < j && a[i]<x) {
                    i++;
                }
                if (i < j)
                    a[j--] = a[i];
            }
            a[i] = x;
            quickSort(a,left,i-1);
            quickSort(a,i+1,right);
        }
    }

    @Test
    public void testQuickSort(){
        int i;
        int[] a = {2, 5, 4, 1, 3, 7, 8, 6};
        System.out.println("升序前：");
        for (i = 0; i < a.length; i++) {
            System.out.print(a[i] + ",");
        }
        System.out.println();
        System.out.println("升序后：");
        quickSort(a, 0,a.length-1);
        for (i = 0; i < a.length; i++) {
            System.out.print(a[i] + ",");
        }
    }
    }

