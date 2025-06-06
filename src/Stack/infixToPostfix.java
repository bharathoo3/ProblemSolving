package Stack;

import java.util.Stack;

public class infixToPostfix {
    public static void main(String[] args) {
        String s="a+b*(c^d-e)^(f+g*h)-i";
        System.out.println(postfix(s));
    }
    static String postfix(String str)
    {
        Stack<Character> stack=new Stack<>();
        String postfix="";
        for(char ch:str.toCharArray())
        {
            if(Character.isAlphabetic(ch))
            {
                postfix+=ch;
            } else if (Character.isDigit(ch)) {
                postfix+=ch;
            } else if(ch=='(')
            {
                stack.push(ch);
            }
            else if (ch==')') {
                while(!stack.isEmpty()&&stack.peek()!='(')
                {
                    postfix+=stack.peek();
                    stack.pop();
                }
                stack.pop();
            }
            else {
              while(!stack.isEmpty() && precentence(stack.peek())>=precentence(ch))
               postfix+= stack.pop();
              stack.push(ch);
            }
        }
        while (!stack.isEmpty())
            postfix+=stack.pop();
        return postfix;
    }
    static int precentence(char ch)
    {
        if(ch=='+' || ch=='-')return 1;
      else  if(ch=='*' || ch=='/')return 2;
       else if(ch=='^')return 3;
       return -1;
    }
}
