package Stack;

import java.util.Stack;

//leetcode 150
public class EvaluateReversePolishNotation {
    public static void main(String[] args) {
        String str="21+3*";
        System.out.println(prefix(str));
    }
    static int prefix(String str)
    {
        Stack<Integer> st=new Stack<>();
        int prefix=0;
        for(char ch:str.toCharArray())
        {
            if(Character.isDigit(ch))
                st.push(ch-'0');
            else{
                int b=st.pop(),a= st.pop();
                if(ch=='+')
                    prefix=a+b;
                else if(ch=='-')
                prefix=a-b;
                else if(ch=='*')
                    prefix=a*b;
                else if(ch=='/')
                    prefix=a/b;
                st.push(prefix);
            }
        }
        return prefix;
    }
}
