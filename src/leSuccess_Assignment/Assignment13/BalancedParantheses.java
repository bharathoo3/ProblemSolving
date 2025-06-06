package leSuccess_Assignment.Assignment13;
import java.util.*;
public class BalancedParantheses {
    public static void main(String[] args) {
        String str="{[(]}";
        System.out.println(findpara(str));
    }
    static boolean findpara(String str)
    {
        Stack<Character> st=new Stack<>();
        for(char ch:str.toCharArray())
        {
            if(ch=='[' || ch=='(' || ch=='{')
                st.push(ch);
            else {
                char top=st.peek();
                if(top=='['&& ch==']' || top=='('&& ch==')'|| top=='{'&& ch=='}' )
                    st.pop();
                else
                    return false;
            }
        }
        return true;
    }
}
