package Practice;
//225
import java.util.*;
public class Implement_Stack_using_Queues {
    Queue<Integer> qu=new LinkedList<>();
    public static void main(String[] args) {
       Implement_Stack_using_Queues st=new Implement_Stack_using_Queues();
       st.add(1);
        st.add(2);
        st.add(3);
        System.out.println(st.remove());
        System.out.println(st.peek());
        System.out.println(st.isEmpty());
    }
    void add(int val)
    {
        qu.offer(val);
        for(int i=0;i<qu.size()-1;i++)
            qu.offer(qu.poll());
    }
    int remove()
    {
        return qu.poll();
    }
    int peek()
    {
        return qu.peek();
    }
    boolean isEmpty()
    {
        return qu.isEmpty();
    }
}
