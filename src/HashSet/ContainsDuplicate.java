package HashSet;
import java.util.*;
public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,1};
        System.out.println(containdub(nums));
    }
    public static boolean containdub(int[] nums)
    {
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            if(!set.add(nums[i]))return true;
        }
        return true;
    }
}
