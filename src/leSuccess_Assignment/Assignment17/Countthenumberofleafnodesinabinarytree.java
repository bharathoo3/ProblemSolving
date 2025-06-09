package leSuccess_Assignment.Assignment17;

import Tree.BinaryTreeInorderTraversal;

public class Countthenumberofleafnodesinabinarytree {
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

    static int findleafnodecount(Node root,int count)
    {
        if(root==null)return 0;
        if(root.left==null && root.left==null)
           return 1;


        return findleafnodecount(root.left,count) + findleafnodecount(root.right,count);
    }
    public static void main(String[] args) {
        root=new Node(10);
        root.left=new Node(20);
        root.right=new Node(30);
        root.left.left=new Node(40);
        root.left.right=new Node(50);
        root.right.left=new Node(60);
        root.right.right=new Node(70);
        System.out.println("the leaf node count is : "+findleafnodecount(root,0));
    }
}
