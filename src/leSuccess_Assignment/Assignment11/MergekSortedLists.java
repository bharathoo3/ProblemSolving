package leSuccess_Assignment.Assignment11;
import java.util.*;
public class MergekSortedLists {
    Node head=null;
    class Node{
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    public void add(int data)
    {
        Node newNode=new Node(data);
        if(head==null)
        {
            head=newNode;
            return;
        }
        Node temp=head;
        while (temp.next!=null)
            temp=temp.next;
        temp.next=newNode;
    }
    public void display(Node head)
    {
        Node temp=head;
        while (temp!=null)
        {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public Node mergeList(Node[] lists)
    {
        PriorityQueue<Node> pq=new PriorityQueue<>(
                (a,b) ->Integer.compare(a.data, b.data)
        );
        for(Node i:lists)
        {
            if(i!=null)
                pq.offer(i);
        }
        Node dummy=new Node(-1);
        Node temp=dummy;
        while (!pq.isEmpty())
        {
            Node smallest=pq.poll();
            temp.next=smallest;
            temp=temp.next;
            if(smallest.next!=null)
                pq.offer(smallest.next);
        }
        return dummy.next;
    }
    public static void main(String[] args) {
        MergekSortedLists li1=new MergekSortedLists();
        li1.add(1);
        li1.add(4);
        li1.add(5);
        MergekSortedLists li2=new MergekSortedLists();
        li2.add(1);
        li2.add(3);
        li2.add(4);
        MergekSortedLists li3=new MergekSortedLists();
        li3.add(2);
        li3.add(6);
        li3.add(7);
        li1.display(li1.head);
        li2.display(li2.head);
        li3.display(li3.head);
        MergekSortedLists result=new MergekSortedLists();
        Node[] arrlist=new Node[]{li1.head,li2.head,li3.head};
        Node mergenode=result.mergeList(arrlist);
        result.display(mergenode);
}
}