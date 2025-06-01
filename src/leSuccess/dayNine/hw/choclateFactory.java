package leSuccess.dayNine.hw;

import java.util.Arrays;

public class choclateFactory {
    public static void main(String[] args) {
        int[] nums={4,5,0,1,9,0,5,0};
        System.out.println(Arrays.toString(moveZero(nums)));
    }
    static int[] moveZero(int[] nums)
    {
        int nz=0;
        for(int i=0;i<nums.length;i++)
        {
        if(nums[i]!=0)
            {
                int temp=nums[i];
                nums[i]=nums[nz];
                nums[nz]=temp;
                nz++;
            }
        }
        return nums;
    }
}
