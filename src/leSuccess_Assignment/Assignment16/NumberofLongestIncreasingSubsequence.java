package leSuccess_Assignment.Assignment16;
//673
public class NumberofLongestIncreasingSubsequence {
    public static void main(String[] args) {
        int[] nums={10,9,2,5,3,7,101,18}; //4
        System.out.println(findLongest(nums));
    }
    static int findLongest(int[] nums)
    {
        int[] dp=new int[nums.length];
        for(int i=0;i<nums.length;i++)
            dp[i]=1;
        int maxLen=0;
        for(int i=1;i<nums.length;i++)
        {
            for(int j=0;j<nums.length;j++)
            {
                if(nums[i]>nums[j])
                    dp[i]=Math.max(dp[i],dp[j]+1);
            }
            maxLen=Math.max(dp[i],maxLen);
        }
        return maxLen;
    }
}
