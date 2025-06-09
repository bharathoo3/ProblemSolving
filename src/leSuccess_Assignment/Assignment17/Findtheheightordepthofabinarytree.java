package leSuccess_Assignment.Assignment17;

import java.util.LinkedList;
import java.util.Queue;

public class Findtheheightordepthofabinarytree {
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
    static int findHeight(Node root)
    {
        Queue<Node> qu=new LinkedList<>();
        int level=-1;
        qu.add(root);
        while(true)
        {
            int queuSize= qu.size();
            if(queuSize==0)
                return level;
            while (queuSize>0)
            {
                Node ptr=qu.poll();
                if(ptr.left!=null)
                    qu.add(ptr.left);
                if(ptr.right!=null)
                    qu.add(ptr.right);
                queuSize--;
            }
            level++;
        }
    }
    public static void main(String[] args) {
        root=new Node(10);
        root.left=new Node(20);
        root.right=new Node(30);
        root.left.left=new Node(40);
        root.left.right=new Node(50);
        root.right.left=new Node(60);
        root.right.right=new Node(70);
        root.right.right.right=new Node(80);
        root.right.right.right.right=new Node(90);
        System.out.println("The Height of the Tree is : "+findHeight(root));
    }
}
