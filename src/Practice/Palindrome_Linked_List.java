package Practice;
//234
public class Palindrome_Linked_List {
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
        Palindrome_Linked_List list=new Palindrome_Linked_List();
        list.insert(1);
        list.insert(2);
        list.insert(2);
        list.insert(1);
        System.out.println("give list is palindrome : "+list.pali(list.head));
    }
    boolean pali(Node head)
    {
        Node slow=head,fast=head;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        Node secondHalf=reverse(slow);
        Node firstHalf=head;
        while (secondHalf!=null)
        {
            if(secondHalf.data != firstHalf.data)
                return false;
            secondHalf=secondHalf.next;
            firstHalf=firstHalf.next;
        }
        return true;
    }
    Node reverse(Node head)
    {
        Node current=head,next=null,prev=null;
        while(current!=null)
        {
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        return prev;
    }
}
