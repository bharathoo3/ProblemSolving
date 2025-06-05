package leSuccess_Assignment.Assignment12;

public class DoublyLinkedList {
    Node head=null;
    Node tail=null;
    class Node{
        int data;
        Node next;
        Node prev;
        Node(int data)
        {
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
    public void add(int data)
    {
        Node newNode=new Node(data);
        if(head==null)
        {
            tail=head=newNode;
            return;
        }
        tail.next=newNode;
        newNode.prev=tail;
        tail=newNode;
    }
    public void display(Node head)
    {
        Node temp=head;
        while (temp!=null)
        {
            System.out.print(temp.data+"<->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public void revrese(Node tail)
    {
        Node temp=tail;
        System.out.print("null");
        while (temp!=null)
        {
            System.out.print("<->"+temp.data);
            temp=temp.prev;
        }


    }
    public Node removefirst(Node head)
    {
        head=head.next;
        head.prev=null;
        return head;
    }
    public Node removelast(Node tail)
    {
        tail=tail.prev;
        tail.next=null;
        return tail;
    }
    public Node addfirst(int val,Node head)
    {
        Node newNode=new Node(val);
        newNode.next=head;
        head=newNode;
        newNode.prev=null;
        return head;
    }
    public Node addlast(int val,Node tail)
    {
        Node newNode=new Node(val);
        tail.next=newNode;
        newNode.prev=tail;
        tail=newNode;
        return tail;
    }

    public static void main(String[] args) {
        DoublyLinkedList list=new DoublyLinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.print("forward: ");
        list.display(list.head);
        System.out.print("backward: ");
        list.revrese(list.tail);
        System.out.println();
        System.out.print("remove first: ");
        list.display(list.removefirst(list.head));
        System.out.print("remove last: ");
        list.revrese(list.removelast(list.tail));
        System.out.println();
        System.out.print("add first: ");
        list.display(list.addfirst(0, list.head));
        System.out.print("add last: ");
        list.revrese(list.addlast(10, list.tail));
    }
}