package leSuccess_Assignment.Assignment13;
import java.util.*;
public class StockSpan {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        int[] nums={100, 80, 60, 70, 60, 75, 85};
        int[] results=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            while (!st.isEmpty()&&nums[st.peek()]<=nums[i])
                st.pop();

            results[i]=st.isEmpty() ?i+1:i-st.peek();
            st.push(i);
        }
        System.out.println(Arrays.toString(results));
    }
}
