package Tree;
//129
public class SumRoottoLeafNumbers {
    static Node root=null;
    static   class Node{
        int data;
        Node left;
        Node right;
        Node(int data)
        {
            this.data=data;
            this.left=this.right=null;
        }
    }
    public static void main(String[] args) {
       root=new Node(4);
       root.left=new Node(9);
       root.right=new Node(0);
       root.left.left=new Node(5);
       root.left.left=new Node(1);
       System.out.println("SumRoottoLeafNumbers :"+findValue(root,0));
    }
    static int findValue(Node root,int currentSum)
    {
        if(root==null) return 0;
        currentSum=currentSum*10+root.data;
        if(root.left==null && root.right==null)
            return currentSum;
        return findValue(root.left,currentSum) + findValue(root.right,currentSum);
    }
}
