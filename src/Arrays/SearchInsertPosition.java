package Arrays;

public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] nums={1,3,5,6};
        int target=7;

        System.out.println(findindex(nums,target));
    }
    static int findindex(int[] nums,int target)
    {
        int left=0,right=nums.length-1;
        while(left<=right)
        {
            int mid=left+(right-left)/2;
            if(target==nums[mid])
            {
                return mid;
            } else if (target>nums[mid]) {
                left=mid+1;
            }
            else right=mid-1;
        }
        return left;
    }
}
