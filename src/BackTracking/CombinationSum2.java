package BackTracking;

import java.util.*;

//40
public class CombinationSum2 {
    public static void main(String[] args) {
        int[] nums={10,1,2,7,6,1,5};
        int target=8;
        Arrays.sort(nums);
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        findCombination(0,nums,result,temp,target);
        System.out.println(result.toString());
    }
    static void findCombination(int ind,int[] nums,List<List<Integer>> result,List<Integer> temp,int target) {

            if (target == 0) {
                result.add(new ArrayList<>(temp));
                return;
            }


        for(int i=ind;i<nums.length;i++)
        {
            if(i>ind && nums[i]==nums[i-1])continue;
            if (nums[ind] > target) break;
                temp.add(nums[ind]);
                findCombination(i + 1, nums, result, temp, target - nums[ind]);
                temp.remove(temp.size() - 1);
        }

    }
}
