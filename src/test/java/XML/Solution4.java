package XML;
import java.util.ArrayList;
public class Solution4 {
    public ArrayList<Integer> FindNumbersWithSum(int[] array, int sum) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int i = 0;
        int j = array.length - 1;

        while (i < j) {
            int ai = array[i];
            int aj = array[j];
            if (ai + aj == sum) {
                list.add(i);
                list.add(j);
                return list;
            } else if (ai + aj > sum) {
                j--;
            } else {
                i++;
            }
        }
        return  list;
    }
}