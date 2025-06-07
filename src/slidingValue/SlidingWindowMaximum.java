package slidingValue;

import java.util.*;

public class SlidingWindowMaximum {
    public static void main(String[] args) {
        int[] nums={1,3,-1,-3,5};
        int k=3;
        //1st
        System.out.println(Arrays.toString(findmax(nums,k)));

        //2nd
        System.out.println(Arrays.toString(usingQueue(nums,k)));
    }

    //1st approach
    static int[] findmax(int[] nums,int k)
    {
        int Windowcount=nums.length-k+1;
        int[] result=new int[Windowcount];
        for(int start=0;start<Windowcount;start++)
        {
            int end=start+k-1;
            int maxVal=nums[start];
            for(int i=start+1;i<=end;i++)
                if(maxVal<nums[i])
                    maxVal=nums[i];
            result[start]=maxVal;
        }
        return result;
    }

    //2md approach using queue
    static int[]  usingQueue(int[] nums,int k)
    {
        Deque<Integer> queue=new ArrayDeque<>();
        int Windowcount=nums.length-k+1;
        int[] result=new int[Windowcount];
        int resultindex=0;
        for(int i=0;i<nums.length;i++) //{1,3,-1,-3,5}
        {
           while(!queue.isEmpty() && queue.peek()==i-k)
           {
               queue.poll();
           }
           while (!queue.isEmpty() && nums[queue.peekLast()]<nums[i])
           {
               queue.pollLast();
           }
           queue.offer(i);
           if(i>=k-1)
           {
               result[resultindex++]=nums[queue.peek()];
           }

        }
        return result;
    }
}
