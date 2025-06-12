package linkedList;
//206
public class ReverseLinkedList {
    public class ListNode {
     int val;
    ListNode next;
    ListNode() {}
   ListNode(int val) { this.val = val; }
   ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
    public ListNode reverseList(ListNode head) {
        ListNode next,current,pre=null;
        current=head;
        if(current==null)return pre;
        while(current!=null)
        {
            next=current.next;
            current.next=pre;
            pre=current;
            current=next;
        }
        return pre;
    }

    public static void main(String[] args) {

    }
}
