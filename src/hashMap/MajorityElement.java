package hashMap;
import java.util.*;
public class MajorityElement {
    public static void main(String[] args) {
        int[] nums={2,2,1,1,1,2,2};


        // 1-st approcah o(n) ,o(n)

//          int count=0,max=0;
//        Map<Integer,Integer> map=new HashMap<>();
//        for(int i:nums)
//        {
//            map.put(i,map.getOrDefault(i,0)+1);
//            if(map.get(i)>count)
//            {
//                count=map.get(i);
//                max=i;
//            }
//        }
//        System.out.println(max);

        //2-nd approach o(n),o(1)

        int count=0,canditate=0;
        for(int i:nums)
        {
            if(count==0)
                canditate=i;
            count+=(i==canditate)?1:-1;
        }
        System.out.println(canditate);
    }
}
