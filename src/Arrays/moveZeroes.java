package Arrays;

import java.util.Arrays;

public class moveZeroes {
    public static void main(String[] args) {
        int[] nums={0,1,0,3,12};
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
        System.out.println(Arrays.toString(nums));
    }
}
