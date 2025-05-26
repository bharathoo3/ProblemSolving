package hashMap;
import java.util.*;
public class Two_sum {
    public static void main(String[] args) {
       int[] nums={2,7,11,15};
       int target=9;
        System.out.println(Arrays.toString(twosum(nums,target)));
    }
    public static int[] twosum(int[] nums,int target)
    {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            int val=target-nums[i];
            if(map.containsKey(val))
                return new int[] {map.get(val),i};
            map.put(nums[i],i);
        }
        return null;
    }
}
