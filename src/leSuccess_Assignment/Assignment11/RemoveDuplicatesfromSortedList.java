package leSuccess_Assignment.Assignment11;
public class RemoveDuplicatesfromSortedList {
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
    public Node removeduplicate(Node head)
    {
        Node current=head;
        while (current!=null&&current.next!=null)
        {
            if(current.data==current.next.data)
                current.next=current.next.next;
            else
                current=current.next;
        }
        return head;
    }

    public static void main(String[] args) {
        RemoveDuplicatesfromSortedList list=new RemoveDuplicatesfromSortedList();
        list.add(1);
        list.add(1);
        list.add(3);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(4);
        list.add(5);
        list.display(list.head);
        list.display(list.removeduplicate(list.head));
    }
}