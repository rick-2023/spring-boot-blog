package XML;

/**
 * @author 范正荣
 * @Date 2017/9/6 0006 下午 2:57.
 */
public class Solution1 {
    //num1,num2分别为长度为1的数组。传出参数
//将num1[0],num2[0]设置为返回结果

        public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
            if(array == null || array.length <= 1){
 num1[0] = num2[0] = 0;
 return;
 }

            int tmp = 0;
            for(int i:array){
                tmp ^= i;
            }
            int index = findfirstBit(tmp);
            for(int i=0;i<array.length;i++){
                if(isBit(array[i],index)){
                    num1[0] ^= array[i];
                }else{
                    num2[0] = array[i];
                }
            }
        }
        public boolean isBit(int target,int index){
            return ((target>>index)&1)== 1;
        }

        public int findfirstBit(int target){
            int index = 0;
            while(((target&1)==0) && index<32){
                target>>=1;
                index ++;
            }
            return index;
        }
    }

