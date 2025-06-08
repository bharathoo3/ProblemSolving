package BackTracking;
import java.util.*;
//42
public class Permutation {
    public static void main(String[] args) {
        int[] arr={1,2};
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        findPermutaion(arr,result,temp);
        System.out.println(result.toString());
    }
    static void findPermutaion(int[] arr,List<List<Integer>> result,List<Integer> temp)
    {
        if(temp.size()==arr.length)
        {
            result.add(new ArrayList<>(temp));
            return;
        }
        for(int i=0;i<arr.length;i++) {
            if (temp.contains(arr[i]))continue;
            temp.add(arr[i]);
            findPermutaion(arr,result,temp);
            temp.remove(temp.size()-1);
        }
    }
}
