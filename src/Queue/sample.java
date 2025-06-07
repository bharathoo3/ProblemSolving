package Queue;
import java.util.*;
public class sample {
    public static void main(String[] args) {
        Queue<Integer> queue=new LinkedList<>();
        int count=0;
        int[] arr={1,2,3,4,5};
        for(int i:arr)
            queue.offer(i);


        queue.offer(8);
        delete(queue);
        System.out.println(queue);
    }
    static void delete(Queue<Integer> queue)
    {
        reverce(queue);
        System.out.println(queue.poll());
        reverce(queue);

    }
    static void reverce(Queue<Integer> queue)
    {
        if(queue.isEmpty())
            return;
        int temp=queue.poll();
        reverce(queue);
        queue.offer(temp);
    }
}
