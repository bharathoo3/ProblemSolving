package Tree;

import java.util.ArrayList;
import java.util.List;

//144
public class BinaryTreePreorderTraversal {
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
    static void preorder(Node root, List<Integer> li)
    {
        if(root==null)return;
        li.add(root.data);
        preorder(root.left,li);
        preorder(root.right,li);
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
        preorder(root,li);
        System.out.println("preorder :"+li.toString());
    }
}
