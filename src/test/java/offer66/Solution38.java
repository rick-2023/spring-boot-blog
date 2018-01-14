package offer66;

/**
 * Created by Administrator on 2017/7/22 0022.
 * 思路：根据二分查找，找到第一个k与最后一个k的位置
 */
public class Solution38 {
    public int GetNumberOfK(int[] data, int k) {
        int number = 0;
        if (data != null && data.length > 0) {
            int firstK = getFirstK(data, k ,0, data.length-1);
            int lastK = getLastK(data, k, 0, data.length-1);
            if (firstK > -1 && lastK > -1) {
                number = lastK - firstK + 1;
            }
        }
        return number;
    }

    public int getFirstK(int[] data, int k, int start, int end) {
        if (data == null || data.length < 1 || start > end) {
            return -1;
        }

        int midIdx = start + (end - start) / 2;
        int midData = data[midIdx];

        if (midData == k) {
            if ((midIdx > 0 && data[midIdx - 1] != k) || midIdx == 0) {
                return midIdx;
            } else {
                end = midIdx - 1;
            }
        } else if (midData > k) {
            end = midIdx - 1;
        } else {
            start = midIdx + 1;
        }
        return getFirstK(data, k, start, end);
    }

    public int getLastK(int[] data, int k, int start, int end) {
        if (data == null || data.length < 1 || start > end) {
            return -1;
        }
        int midIdx = start + (end - start) / 2;
        int midData = data[midIdx];
        if (midData == k) {
            if (midIdx+1 < data.length && data[midIdx + 1] != k || midIdx == data.length-1) {
                return midIdx;
            } else {
                start = midIdx + 1;
            }
        } else if (midData < k) {
            start = midIdx + 1;
        } else {
            end = midIdx - 1;
        }
        return getLastK(data, k, start, end);
    }


    public void test(){
        int[] data = {1,2,3,3,3,3};
        System.out.println(GetNumberOfK(data,3));
    }
}
