package Algorithms.KadanesAlgorithm;

public class Floydscuclealgorithm {
    Node head;
    class Node{
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    void insert(int data)
    {
        Node newNode=new Node(data);
        if(head==null)
        {
            head=newNode;
            return;
        }
        Node ptr=head;
        while(ptr.next!=null)
        {
            ptr=ptr.next;
        }
        ptr.next=newNode;
    }
    boolean findCycle(Floydscuclealgorithm list)
    {
        Node fast,slow;
        fast=slow=list.head;
        if(head.next==null || head==null)return false;
        while (fast.next!=null && fast.next.next!=null)
        {

            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Floydscuclealgorithm list=new Floydscuclealgorithm();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);
        list.insert(6);
        System.out.println("It is Cycle :"+list.findCycle(list));
    }
}
