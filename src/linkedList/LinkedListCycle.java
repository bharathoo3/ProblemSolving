package linkedList;
//141
public class LinkedListCycle {
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
    public static void main(String[] args) {
      LinkedList li=new LinkedList();
      li.insert(1);
      li.insert(2);
      li.insert(3);
      li.insert(4);
    }
    public boolean hasCycle(Node head) {
        Node slow=head,fast=head;
        if(head==null || head.next==null)return false;
        while(fast != null && fast.next !=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)
                return true;
        }
        return false;
    }
}
