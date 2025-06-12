package Practice;
//300
public class LongestIncreasingSubsequence {
    public static void main(String[] args) {
        int[] nums={10,9,2,5,3,7,101,18}; //4
        System.out.println(findLongest(nums));
    }
    static int findLongest(int[] nums)
    {
        int maxlen=1;
        int[] dp=new int[nums.length];
        for(int i=0;i<nums.length;i++)
            dp[i]=1;

        for(int i=1;i<nums.length;i++)
        {
            for (int j=0;j<nums.length;j++)
            {
                if(nums[i]>nums[j])
                    dp[i]=Math.max(dp[i],dp[j]+1);
            }
            maxlen=Math.max(dp[i],maxlen);
        }
        return maxlen;
    }

    //public int lengthOfLIS(int[] nums) {
    //        List<Integer> sub = new ArrayList<>();
    //
    //        for (int num : nums) {
    //            int idx = Collections.binarySearch(sub, num);
    //            if (idx < 0) idx = -(idx + 1);  // insertion point
    //
    //            if (idx == sub.size()) {
    //                sub.add(num);  // append to subsequence
    //            } else {
    //                sub.set(idx, num);  // replace to keep subsequence minimal
    //            }
    //        }
    //
    //        return sub.size();
    //    }

}
