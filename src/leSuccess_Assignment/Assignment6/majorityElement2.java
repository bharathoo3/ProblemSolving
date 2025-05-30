package leSuccess_Assignment.Assignment6;
import java.util.*;
public class majorityElement2 {
    public static void main(String[] args) {
        int[] arr = {3, 3, 4, 2, 3, 3, 3};
        System.out.println(findElement(arr));
    }

    static int findElement(int[] arr) {
        int maxCount=0;
        int maxValue=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:arr){
            map.put(i,(1+map.getOrDefault(i,0)));
            if(map.get(i)>maxCount){
                maxCount=map.get(i);
                maxValue=i;
            }
        }
        return maxValue;
    }
}
