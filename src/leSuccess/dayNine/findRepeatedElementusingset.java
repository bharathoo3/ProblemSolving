package leSuccess.dayNine;
import java.util.*;
public class findRepeatedElementusingset {
    public static void main(String[] args) {
        int[] nums={1,2,5,7,8,9,5};

        System.out.println(findrepeatedelement(nums));
    }
    static boolean findrepeatedelement(int[] nums)
    {
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            if(!set.add(nums[i]))
               return true;
        }
        return false;
    }
}
