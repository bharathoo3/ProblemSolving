package Practice;

public class Merge_Two_Sorted_Lists {
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
    void display(Node head)
    {
        Node ptr=head;
        while (ptr!=null) {
            System.out.print(ptr.data + " -> ");
            ptr = ptr.next;
        }
        System.out.println("null");
    }
    Node mergerList(Node list1,Node list2)
    {
        Node  dummy=new Node(-1);
        Node current=dummy;
        while(list1!=null && list2!=null)
        {
            if(list1.data<list2.data)
            {
                current.next=list1;
                list1=list1.next;
            }
            else{
                current.next=list2;
                list2=list2.next;
            }
            current=current.next;
        }
        if(list1!=null)current.next=list1;
        if(list2!=null)current.next=list2;
        return dummy.next;
    }

    public static void main(String[] args) {
        Merge_Two_Sorted_Lists  list1=new Merge_Two_Sorted_Lists ();
        Merge_Two_Sorted_Lists  list2=new Merge_Two_Sorted_Lists ();
        list1.insert(1);
        list1.insert(2);
        list1.insert(4);
        list2.insert(1);
        list2.insert(3);
        list2.insert(4);
        list1.display(list1.head);
        list2.display(list2.head);
        Merge_Two_Sorted_Lists  merger=new Merge_Two_Sorted_Lists ();
        Node val=merger.mergerList(list1.head,list2.head);
        System.out.print("The merger List: ");
        merger.display(val);
    }
}
