package leSuccess_Assignment.Assignment14;

public class ImplementaQueueusingLinkedList {
    Node head=null,tail;
    class Node{
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    void push(int data)
    {
        Node newNode=new Node(data);
        if(head==null)
        {
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;
    }
    void pop()
    {
        System.out.println("The poped element is "+head.data);
        head=head.next;
    }
    void peek()
    {
        System.out.println("The peek element "+head.data);
    }
    boolean isEmpty()
    {
        return head==tail;
    }
    public static void main(String[] args) {
        ImplementaQueueusingLinkedList queue=new ImplementaQueueusingLinkedList();
        queue.push(1);
        queue.push(2);
        queue.push(3);
        queue.pop();
        queue.push(4);
        queue.peek();
        System.out.println(queue.isEmpty());

    }
}
