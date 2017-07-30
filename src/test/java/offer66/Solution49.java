package offer66;

/**
 * @author 范正荣
 * @Date 2017/7/30 0030 上午 9:55.
 * 构建乘积数组
 */
public class Solution49 {
    public int[] multiply(int[] A) {
        if (A == null)
            return null;
        int[] B = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            B[i] = 1;
            for (int j = 0; j < i; j++) {
                B[i] *= A[j];
            }
            for (int k = i + 1; k < A.length; k++) {
                B[i] *= A[k];
            }
        }
        return B;
    }

    @org.junit.Test
    public void test() {
        int[] A = {1, 2, 3};
        int[] B = multiply(A);
        for (int b : B) {
            System.out.println(b);
        }
    }
}
