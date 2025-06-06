package Stack;
//leetcode 277
import java.util.*;
public class findCelebrity {
    public static void main(String[] args) {
      int[][] arr={{0,1,0},{0,0,0},{0,1,1}};
      int n=arr.length;
        System.out.println(findCelibi(arr,n));
    }
    static int findCelibi(int[][] arr,int n)
    {
        Stack<Integer> st=new Stack<>();
       for(int i=0;i<n;i++)
           st.push(i);
       while (st.size()>=2) {
           int left = st.pop(), right = st.pop();
           if (arr[left][right] == 1)
               st.push(right);
           else st.push(left);
       }
       int pc=st.pop();//potential of celebrity
        for(int i=0;i<n;i++)
        {
            if(pc!=i)
            {
                if(arr[pc][i]!=0 || arr[i][pc]!=1)
                    return -1;
            }
        }
        return pc;
    }
}
