package Tree;

import java.util.ArrayList;
import java.util.List;

//145
public class BinaryTreePostorderTraversal {
    static Node root=null;
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data)
        {
            this.data=data;
            this.left=this.right=null;
        }
    }
    static void postorder(Node root, List<Integer> li)
    {
        if(root==null)return;
        postorder(root.left,li);
        postorder(root.right,li);
        li.add(root.data);
    }

    public static void main(String[] args) {
        root=new Node(10);
        root.left=new Node(20);
        root.right=new Node(30);
        root.left.left=new Node(40);
        root.left.right=new Node(50);
        root.right.left=new Node(60);
        root.right.right=new Node(70);
        List<Integer> li=new ArrayList<>();
        postorder(root,li);
        System.out.println("Postorder :"+li.toString());
    }
}
