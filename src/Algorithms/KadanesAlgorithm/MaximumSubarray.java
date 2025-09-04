package Algorithms.KadanesAlgorithm;
import java.util.*;
public class MaximumSubarray {

    public static int maxSubArray(int[] nums) {
        int maxSum = nums[0];  // Initialize to first element
        int currentSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            // If currentSum becomes negative, start new subarray from nums[i]
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println("Maximum Subarray Sum: " + maxSubArray(nums));  // Output: 6
    }
}
