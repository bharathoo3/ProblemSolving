package Practice;
import java.util.*;
//217
public class Contains_Duplicate {
    public static void main(String[] args) {
    int[] nums={1,2,3,1};
        System.out.println(containsDuplicate(nums));
    }
   static public boolean containsDuplicate(int[] nums) {
        Set<Integer> set=new HashSet<>();
        for(int i:nums)
        {
            if(!set.add(i))
                return true;
        }
        return false;
    }
}
