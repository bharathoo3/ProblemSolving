package linkedList;


public class LinkedList {
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
          LinkedList list=new LinkedList();
          list.insert(1);
         list.insert(2);
         list.insert(3);
         list.insert(4);
         list.insert(5);
         list.insert(6);
         Node temp= list.head;
         int count=0,target=6;
         while (temp!=null) {
             if(target==temp.data)
             {
                 System.out.println(count);
                 break;
             }
             count++;
             temp=temp.next;
         }
    }
}
