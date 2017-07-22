package offer66;

/**
 * Created by Administrator on 2017/7/22 0022.
 */
public class Solution36 {
    public int InversePairs(int [] array) {
        if(array.length<1)
            return 0;

        int[] copy = new int[array.length];
        return reverseParse(array,copy,0,array.length-1);
    }

    public static int reverseParse(int[] data,int[] copy,int start,int end) {
        if (start == end) {
            copy[start] = data[start];
            return 0;
        }
        int length = (end-start)/2;
        int left = reverseParse(data,copy,start,start+length);
        int right = reverseParse(data,copy,start+length+1,end);
        int i = start+length;
        int j = end;
        int indexCopy = end;
        int count = 0;

        while(i>=start && j>=start+length+1){
            if(data[i]>data[j]){
                copy[indexCopy] = data[i];
                indexCopy--;
                i--;
                count += j-(start+length);
            }else{
                copy[indexCopy] = data[j];
                indexCopy--;
                j--;
            }
        }
        for (; i >= start;) {
            copy[indexCopy] = data[i];
            indexCopy--;
            i--;
        }

        for (; j >= start + length + 1;) {
            copy[indexCopy] = data[j];
            indexCopy--;
            j--;
        }
        return (count+left+right)%1000000007;
    }
}
