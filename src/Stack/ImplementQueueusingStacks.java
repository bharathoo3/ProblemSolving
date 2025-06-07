package Stack;
//232
import java.util.*;
public class ImplementQueueusingStacks {
    static Stack<Integer> st1=new Stack<>();
    static Stack<Integer> st2=new Stack<>();
    public static void main(String[] args) {
        ImplementQueueusingStacks s=new ImplementQueueusingStacks();
        s.push(1);
        s.push(2);

    }
    void push(int x)
    {
        while(!st1.isEmpty())
        {
            st2.push(st1.pop());
        }
       st1.push(x);
        while(!st2.isEmpty())
        {
            st1.push(st2.pop());
        }
    }
    int pop()
    {
        return st1.pop();
    }
    int peek()
    {

        return st2.peek();
    }
    boolean isEmpty()
    {

        return st2.isEmpty();
    }

}
