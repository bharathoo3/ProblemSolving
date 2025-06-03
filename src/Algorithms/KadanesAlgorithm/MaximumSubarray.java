package Algorithms.KadanesAlgorithm;
import java.util.*;
public class MaximumSubarray {
    public static void main(String[] args) {
        int[] nums={-2,1,-3,4,-1,2,1,-5,4};
        int maxValue=Integer.MIN_VALUE;
        int currentSum=0;
        for(int i=1;i<nums.length;i++)
        {
            currentSum+=nums[i];
            maxValue=Math.max(currentSum,maxValue);
            if(currentSum<0)currentSum=0;
        }
        System.out.println(maxValue);
    }
}
