package BackTracking;

import java.util.*;

//90
public class subSetII {
    public static void main(String[] args) {
        int[] nums={1,2,2};
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        findsubset(nums,result,temp,0);
        System.out.println(result.toString());
    }
    static void findsubset(int[] nums,List<List<Integer>> result,List<Integer> temp,int ind)
    {
        if(ind== nums.length)
        {
            if(!result.contains(temp))
            result.add(new ArrayList<>(temp));
            return;
        }

        findsubset(nums,result,temp,ind+1);
        temp.add(nums[ind]);
        findsubset(nums,result,temp,ind+1);
        temp.remove(temp.size()-1);
    }
}
