package Dp;

public class houserobber {
    public static void main(String[] args) {
        int[] nums={5,17,3,6,10};
        System.out.println(findHigh(nums));
    }
    static int findHigh(int[] nums)
    {
        int result=0;
        if(nums.length==1)
            return nums[0];
        int first=nums[0];
        int second=Math.max(nums[1],first);
        for(int i=2;i<nums.length;i++)
        {
            result=Math.max(nums[i]+first,second);
            first=second;
            second=result;
        }
        return result;
    }
}
