package leSuccess_Assignment.Assignment14;

import java.util.*;

public class ReverseFirstKElementsofQueue {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5};
        int k=2;
        System.out.println(rotate(nums,k));
    }
    static Queue<Integer> rotate(int[] nums,int k)
    {
        int n=nums.length-k;
        int[] result=new int[nums.length];
        Queue<Integer> queue=new LinkedList<>();
        Stack<Integer> st=new Stack<>();
        for(int i:nums)
            queue.offer(i);
        while(k!=0) {
            st.push(queue.poll());
            k--;
        }
        while (!st.isEmpty())
            queue.offer(st.pop());
        while (n!=0)
        {
            queue.offer(queue.poll());
            n--;
        }

        return queue;
    }
}
