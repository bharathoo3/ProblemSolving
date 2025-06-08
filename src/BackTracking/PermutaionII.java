package BackTracking;
//47
import java.util.*;
public class PermutaionII {
    public static void main(String[] args) {
        int[] nums={1,1,3};
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        boolean[] bool=new boolean[nums.length];
        findPer(nums,result,temp,bool);
        System.out.println(result.toString());
    }
    static void findPer(int[] nums,List<List<Integer>> result,List<Integer> temp,boolean[] bool)
    {
        if(temp.size()==nums.length)
        {
            if(!result.contains(temp))
                {
                    result.add(new ArrayList<>(temp));
                }
            return;
        }
        for(int i=0;i<nums.length;i++)
        {
            if(!bool[i])
            {
                bool[i]=true;
                temp.add(nums[i]);
                findPer(nums,result,temp,bool);
                temp.remove(temp.size()-1);
                bool[i]=false;
            }
        }
    }
}
