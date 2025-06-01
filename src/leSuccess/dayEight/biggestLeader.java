package leSuccess.dayEight;
import java.util.*;
public class biggestLeader {
    public static void main(String[] args) {
        int[] nums={1,12,86,75,82,22,6};
        List<Integer> list=new ArrayList<>();

        int leader=nums[nums.length-1];
        for(int i=nums.length-2;i>=0;i--) {
            if (nums[i] > leader) {
                list.add(0,leader);
                leader = nums[i];
            }
        }
//        Collections.reverse(list);
        System.out.println(list.toString());
    }
}
