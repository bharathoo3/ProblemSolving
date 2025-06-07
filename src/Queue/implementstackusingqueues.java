package Queue;
//225
import java.util.*;

public class implementstackusingqueues {
    static Queue<Integer> que=new LinkedList<>();
    public static void main(String[] args) {
        implementstackusingqueues q=new implementstackusingqueues();
        q.push(1);
        q.push(2);
        q.push(3);
        q.push(4);
        System.out.println(q.pop());
        System.out.println(q.peek());
        System.out.println(q.isEmpty());
        System.out.println(que);

    }
    public void push(int x)
    {
        que.offer(x);
        for(int i=0;i<que.size()-1;i++)
        {
            que.offer(que.poll());
        }
    }
    public int pop(){
        return que.poll();
    }
    public int peek()
    {
        return que.peek();
    }
    public boolean isEmpty()
    {
        return que.isEmpty();
    }
}
