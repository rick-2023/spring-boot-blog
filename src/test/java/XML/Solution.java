package XML;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> list = new ArrayList<Integer>();
        if(nums.length==0)
            return list;

        int num1 = Integer.MIN_VALUE;
        int times1 = 0;
        int num2 = Integer.MIN_VALUE;
        int times2 = 0;

        for(int i=0;i<nums.length;i++){
            int num = nums[i];
            if(num1 == num){
                times1++;
            }else if(num2 == num){
                times2++;
            }else if(times1 == 0){
                times1 = 1;
                num1 = num;

            }else if(times2 == 0){
                times2= 1;
                num2 = num;

            }else{
                times1--;
                times2--;
            }
        }

        times1=0;
        times2=0;
        for(int i=0;i<nums.length;i++){
            if(num1 == nums[i]){
                times1++;
            }
            else if(num2 == nums[i]){
                times2++;
            }
        }
        if(times1>nums.length/3)
            list.add(num1);

        if(times2>nums.length/3)
            list.add(times2);

        return list;
    }
    @Test
    public void test(){
        int [] nums = {1,2};
       List<Integer> list = majorityElement(nums);
       for(Integer i : list){
           System.out.println(i);
       }
    }

    static class A{
        static int a;
    }

    class B{
       //static final int b;
    }
}