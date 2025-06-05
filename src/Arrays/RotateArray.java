package Arrays;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] nums={1, 2, 3, 4, 5, 6, 7};
        int k=17;
        k=k%nums.length;//beacuse reduce the more num of rotation like if k=17 k%length is k=3
        swap(nums,0,nums.length-1);
        swap(nums,k,nums.length-1);
        swap(nums,0,k-1);
        System.out.println(Arrays.toString(nums));
    }
    static int[] swap(int[] nums,int left,int right)
    {
        while (left<right)
        {
            int temp=nums[left];
            nums[left]=nums[right];
            nums[right]=temp;
            left++;right--;
        }
        return nums;
    }
}
