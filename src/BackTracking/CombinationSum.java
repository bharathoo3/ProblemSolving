package BackTracking;
import java.util.*;
//39
public class CombinationSum {
    public static void main(String[] args) {
        int[] nums={2,3,6,7};
        int target=7;
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        findCombination(0,nums,result,temp,target);
        System.out.println(result.toString());
    }
    static void findCombination(int ind,int[] nums,List<List<Integer>> result,List<Integer> temp,int target)
    {
        if(ind==nums.length)
        {
            if(target==0)
            {
                result.add(new ArrayList<>(temp));
            }
            return;
        }
        if(nums[ind]<=target)
        {
            temp.add(nums[ind]);
            findCombination(ind,nums,result,temp,target-nums[ind]);
            temp.remove(temp.size()-1);
        }
        findCombination(ind+1,nums,result,temp,target);
    }
}
