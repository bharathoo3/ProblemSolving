package Dp;
//300
public class LongestIncreasingSubsequence {
    public static void main(String[] args) {
        int[] nums={10,9,2,5,3,7,101,18}; //4
//        System.out.println(findLongest(nums));
        findLongest(nums);
    }
    static int findLongest(int[] nums)
    {
        if(nums.length==1)
            return nums[0];
        int count=1;
        int first=1;
        int second=nums[0]<nums[1] ? ++count:1;
        int third=0;
        int max=0;
        for(int i=2;i<nums.length;i++)
        {
            third=nums[i-1]<nums[i] ? ++count:1;
            count=third;
            System.out.println(third);
            max=Math.max(max,third);
        }
        return max;
    }
}
