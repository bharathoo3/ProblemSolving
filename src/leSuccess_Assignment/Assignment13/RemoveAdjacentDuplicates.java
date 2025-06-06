package leSuccess_Assignment.Assignment13;
import java.util.*;
public class RemoveAdjacentDuplicates {
    public static void main(String[] args) {
        String str="abbaca";
        Stack<Character> st=new Stack<>();
        for (char ch:str.toCharArray())
        {
            if(!st.isEmpty() && st.peek()==ch)
                st.pop();
            else
            st.push(ch);
        }
         StringBuilder s=new StringBuilder();
        while (!st.isEmpty())
            s.insert(0,st.pop());
        System.out.println(s.toString());
    }
}
