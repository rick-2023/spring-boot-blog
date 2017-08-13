package Sort;

import org.junit.Test;

/**
 * @author 范正荣
 * @Date 2017/8/13 0013 下午 3:08.
 * 堆排序
 * 时间复杂度O(NlogN),空间复杂度O(1)
 */
public class HeapSort {
    /**
     * 最大堆的向下调整算法
     *
     * @param a     待调整的数组
     * @param start 被下调节点的起始位置，一般为0,表示从第0个开始
     * @param end   截止的范围
     */

    public void maxHeapDown(int[] a, int start, int end) {
        int c = start;//当前的位置
        int l = 2 * start + 1;//左节点
        int tmp = a[c];//当前节点的大小

        for (; l <= end; c = l, l = 2 * l + 1) {
            if (l < end && a[l] < a[l + 1]) {//两个里面选择大的子节点
                l++;
            }

            if (tmp > a[l]) {
                break;
            } else {
                a[c] = a[l];
                a[l] = tmp;
            }

        }
    }

    /**
     * 堆排序 升序
     *
     * @param a 排序数组
     * @param n 数组长度
     */
    public void SortAsc(int[] a, int n) {
        int i, tmp;
        for (i = n / 2 - 1; i >= 0; i--) {
            maxHeapDown(a, i, n - 1);
        }

        for (i = n - 1; i > 0; i--) {
            tmp = a[0];
            a[0] = a[i];
            a[i] = tmp;
            maxHeapDown(a, 0, i - 1);
        }
    }

    @Test
    public void testSortAsc() {
        int i;
        int[] a = {2, 5, 4, 1, 3, 7, 8, 6};
        System.out.println("升序前：");
        for (i = 0; i < a.length; i++) {
            System.out.print(a[i] + ",");
        }
        System.out.println();
        System.out.println("升序后：");
        SortAsc(a, a.length);
        for (i = 0; i < a.length; i++) {
            System.out.print(a[i] + ",");
        }
    }

    /**
     * 最小堆的向下调整算法
     *
     * @param a     待调整的数组
     * @param start 被下调节点的起始位置，一般为0,表示从第0个开始
     * @param end   截止的范围
     */

    public void minHeapDown(int[] a, int start, int end) {
        int c = start;//当前的位置
        int l = 2 * start + 1;//左节点
        int tmp = a[c];//当前节点的大小

        for (; l <= end; c = l, l = 2 * l + 1) {
            if (l < end && a[l] > a[l + 1]) {//两个里面选择大的子节点
                l++;
            }

            if (tmp <= a[l]) {
                break;
            } else {
                a[c] = a[l];
                a[l] = tmp;
            }

        }
    }

    /**
     * 堆排序 降序
     *
     * @param a 排序数组
     * @param n 数组长度
     */
    public void SortDesc(int[] a, int n) {
        int i, tmp;
        for (i = n / 2 - 1; i >= 0; i--) {
            minHeapDown(a, i, n - 1);
        }

        for (i = n - 1; i > 0; i--) {
            tmp = a[0];
            a[0] = a[i];
            a[i] = tmp;
            minHeapDown(a, 0, i - 1);
        }
    }

    @Test
    public void testSortDesc() {
        int i;
        int[] a = {2, 5, 4, 1, 3, 7, 8, 6};
        System.out.println("升序前：");
        for (i = 0; i < a.length; i++) {
            System.out.print(a[i] + ",");
        }
        System.out.println();
        System.out.println("升序后：");
        SortDesc(a, a.length);
        for (i = 0; i < a.length; i++) {
            System.out.print(a[i] + ",");
        }
    }
}
