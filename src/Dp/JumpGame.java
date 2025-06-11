package Dp;
//55
public class JumpGame {
    public static void main(String[] args) {
        int nums[]={2,3,0,1,4};
        System.out.println(approch1(nums));
        System.out.println(approch2(nums));
    }
    //approach 1
    static boolean approch1(int[] nums)
    {
        int goal=nums.length-1;
        for(int i=nums.length-2;i>=0;i--)
        {
            if(i+nums[i] >= goal)
                goal=i;
        }
        return goal==0;
    }
    //approach 2
    static boolean approch2(int[] nums)
    {
        int maxIndex=0;
        for(int i=0;i<nums.length-1;i++)
        {
            if(i > maxIndex)return false;
            maxIndex=Math.max(maxIndex,i+nums[i]);
        }
        return true;
    }
}
