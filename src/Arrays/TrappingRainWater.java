package Arrays;

import java.util.ArrayList;
import java.util.List;

//42
public class TrappingRainWater {
    public static void main(String[] args) {
       int[] nums={4,2,0,3,2,5};
       System.out.println("Totla waterLevel is : "+findWaterLevel(nums));
        List<Integer> list=new ArrayList<>();
    }
    static int findWaterLevel(int[] nums)
    {
        int result=0,n=nums.length;
        int[] ltr=new int[n];
        int[] rtl=new int[n];
        ltr[0]=nums[0];
        rtl[n-1]=nums[n-1];
        for(int i=1;i<n;i++)
        {
            ltr[i]=Math.max(ltr[i-1],nums[i]);
        }
        for(int i=n-2;i>=0;i--)
        {
            rtl[i]=Math.max(ltr[i+1],nums[i]);
        }
        for(int i=0;i<n;i++)
            result+=(Math.min(ltr[i],rtl[i])-nums[i]);
        return result;
    }
}
