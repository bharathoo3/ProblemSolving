package hashMap;
import java.util.*;
public class TopKFrequentElements {
    public static void main(String[] args) {
        int[] nums={1,1,1,2,2,2,4,4,5,5,3};
        int k=3;
        System.out.println(Arrays.toString(topKFrequent(nums,k)));
    }
    static int[] topKFrequent(int[] nums,int k)
    {
        //find the frequency of all digits
        Map<Integer,Integer> map=new HashMap<>();
        for(int i:nums)
            map.put(i,map.getOrDefault(i,0)+1);
        //{
        //  1 → 3,
        //  2 → 2,
        //  3 → 1
        //}

        //for sorting the frequency we need some datastrucure
        List<Integer>[] buget=new List[nums.length+1];
        for(int i=0;i<buget.length;i++)
            buget[i]=new ArrayList<>();
//        buckets[0] = []
//        buckets[1] = []
//...
//        buckets[nums.length] = []4

        //sort the digit based on frequency
     for(Map.Entry<Integer,Integer> val:map.entrySet())
     {
         int number=val.getKey();
         int frequency=val.getValue();
         buget[frequency].add(number);
     }
//        buckets[1] = [3]      // 3 appears once
//        buckets[2] = [2]      // 2 appears twice
//        buckets[3] = [1]      // 1 appears three times

        //store the values in List for collect K frequent elements
        List<Integer> arrayList=new ArrayList<>();
     for(int i= buget.length-1;i>=0&&arrayList.size()<k;i--)
     {
         arrayList.addAll(buget[i]);
     }
      // return the value as array
        System.out.println(arrayList.toString());
        int[] result=new int[k];
     for(int i=0;i<k;i++)
         result[i]=arrayList.get(i);

        return result;
    }
}
