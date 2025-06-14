package Stack;
//232
import java.util.*;
public class ImplementQueueusingStacks {
    Stack<Integer> s1=new Stack<>();
    Stack<Integer> s2=new Stack<>();

    public static void main(String[] args) {
        ImplementQueueusingStacks s=new ImplementQueueusingStacks();
        s.push(1);
        s.push(2);
    }

    public void push(int x) {
        while(!s1.isEmpty())
            s2.push(s1.pop());
        s1.push(x);
        while(!s2.isEmpty())
        {
            s1.push(s2.pop());
        }
    }

    public int pop() {
        return s1.pop();
    }

    public int peek() {
        return s1.peek();
    }

    public boolean empty() {
        return s1.isEmpty();
    }

}
