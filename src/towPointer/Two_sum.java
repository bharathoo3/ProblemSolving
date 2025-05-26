package towPointer;//leetcode 1

import java.lang.reflect.Array;
import java.util.Arrays;

public class Two_sum {
    public static void main(String[] args) {
        int[] arr={1,3,5,7,12,15};
        int target=10;
        System.out.println(Arrays.toString(twosum(arr, target)));
    }
    public static int[] twosum(int[] arr,int target)
    {
        int left=0,right=arr.length-1;
        while(left<right)
        {
            if(arr[left]+arr[right]==target)
                return new int[] {left,right};
            else if (arr[left]+arr[right]>target) {
                right--;
            }
            else
                left++;
        }
        return null;
    }
}
