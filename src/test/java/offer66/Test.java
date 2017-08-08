package offer66;

/**
 * @author 范正荣
 * @Date 2017/7/23 0023 上午 10:53.
 */
public class Test {
    public static void main(String[] args) {

        String str = "abcXYZabcXYZ";
        System.out.println(str.substring(3,9));

        //System.out.println(findFirstBit1(7));
    }

    private static int findFirstBit1(int num) {
        int index = 0;
        while ((num & 1) == 0 && index < 32) {
            num >>>= 1;
            index++;
        }
        return index;
    }
}
