package leSuccess_Assignment.Assignment3;
import java.util.*;
public class findDuplicates {
    public static void main(String[] args) {
        int[] arr={5,3,8,5,6,3,2};
        System.out.println(findDuplicates(arr));
    }
    static List<Integer> findDuplicates(int[] arr){
        List<Integer> result=new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:arr){
            if(map.containsKey(num)){
                result.add(num);
            }else{
                map.put(num,0);
            }
        }
        return result;

    }
}
