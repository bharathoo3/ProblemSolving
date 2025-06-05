package leSuccess_Assignment.Assignment11;
public class DeleteNodeinaLinkedList {
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
    public Node delete(Node head,int target)
    {
        Node dummy=new Node(-1);
        Node current=dummy;
        current.next=head;
        while (current.next!=null)
        {
            if(current.next.data==target)
            {
                current.next=current.next.next;
            }
            current=current.next;
        }
        return dummy.next;
    }
    public static void main(String[] args) {
        DeleteNodeinaLinkedList list=new DeleteNodeinaLinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.display(list.head);
        int target=3;
        list.display(list.delete(list.head,target));
    }
}