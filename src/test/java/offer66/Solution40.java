package offer66;

/**
 * @author 范正荣
 * @Date 2017/7/23 0023 下午 2:06.
 */
public class Solution40 {
    public void FindNumsAppearOnce(int[] array, int num1[], int num2[]) {

        int length = array.length;
        if (length == 2) {
            num1[0] = array[0];
            num2[0] = array[1];
            return;
        }

        int BitResult = 0;
        for(int i :array){
            BitResult^=i;
        }

        int index = findFirstBit1(BitResult);

        for(int i = 0;i<length;i++){
            if(isBit(array[i],index)){
                num1[0] ^= array[i];
            }else {
                num2[0] ^= array[i];
            }
        }

    }

    private boolean isBit(int i,int index) {
        return ((i>>index)&1) == 0;
    }

    private int findFirstBit1(int bitResult) {
        int index = 0;
        while((bitResult&1)==0 && index<32 ){
            bitResult>>=1;
            index++;
        }
        return index;
    }
}
