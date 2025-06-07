package leSuccess_Assignment.Assignment14;

import java.util.Arrays;

public class ImplementaQueueusingArrays {
    static int front=0,rear=0;
    int[] arr=new int[100];
    public static void main(String[] args) {
     ImplementaQueueusingArrays queue=new ImplementaQueueusingArrays();
        queue.push(1);
        queue.push(2);
        queue.push(3);
        System.out.println(queue.poll());
        System.out.println(queue.peek());
        System.out.println(queue.isEmpty());
    }
    void push(int x)
    {
        arr[rear]=x;
        rear++;
    }
    int poll()
    {
        return arr[front++];
    }
    int peek()
    {
        return arr[front];
    }
    boolean isEmpty()
    {
        return rear==front;
    }
}
