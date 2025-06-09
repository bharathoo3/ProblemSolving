package leSuccess_Assignment.Assignment17;


import java.util.*;

public class CreateaBinarTreeandPrintthelevelordertraversalofabinarytree {
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
    static Node constructTree(int[] arr)
    {
        if(arr.length==0)return null;
        root=new Node(arr[0]);
        Queue<Node> qu=new LinkedList<>();
        qu.offer(root);
        int i=1;
        while (!qu.isEmpty() && i< arr.length)
        {
            Node temp=qu.poll();
            if(i< arr.length && arr[i]!=-1)
            {
                temp.left=new Node(arr[i]);
                qu.offer(temp.left);
            }
            i++;
            if(i< arr.length && arr[i]!=-1)
            {
                temp.right=new Node(arr[i]);
                qu.offer(temp.right);
            }
            i++;
        }
        return root;
    }
    static void printlevelorder(Node root)
    {
        Queue<Node> qu=new LinkedList<>();
        qu.offer(root);
        while (!qu.isEmpty())
        {
            Node temp=qu.poll();
            System.out.print(temp.data+" ");
            if(temp.left!=null)qu.add(temp.left);
            if(temp.right!=null)qu.add(temp.right);
        }
    }
    public static void main(String[] args) {
        int[] arr={10,20,30,-1,-1,40,50,-1,60,70};
        root=constructTree(arr);
        printlevelorder(root);
    }
}
