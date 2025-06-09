package Tree;
//https://www.geeksforgeeks.org/problems/boundary-traversal-of-binary-tree/1
import java.util.*;
public class TreeBoundaryTraversal {
    static Node root=null;
    static class Node
    {
        int data;
        Node left, right;

        public Node(int d)
        {
            data = d;
            left = right = null;
        }
    }
   static ArrayList<Integer> boundaryTraversal(Node node) {
        ArrayList<Integer> result=new ArrayList<>();
        if(node ==null)
            return result;

        result.add(node.data);

        if(isleaf(node))
            return result;

        addLeftboundary(node,result);
        addLeaves(node,result);
        addRightboundary(node,result);
        return result;
    }
    static boolean isleaf(Node node)
    {
        return node.left==null && node.right==null;
    }
    static void addLeftboundary(Node node,ArrayList<Integer> result)
    {
        Node current=node.left;
        while(current!=null)
        {
            if(!isleaf(current))
                result.add(current.data);
            if(current.left!=null)
                current=current.left;
            else
                current=current.right;

        }

    }
    static void addRightboundary(Node node,ArrayList<Integer> result)
    {
        ArrayList<Integer> temp=new ArrayList<>();
        Node current=node.right;
        while(current!=null)
        {
            if(!isleaf(current))
                temp.add(current.data);
            if(current.right!=null)
                current=current.right;
            else
                current=current.left;
        }
        for(int i=temp.size()-1;i>=0;i--)
        {
            result.add(temp.get(i));
        }

    }
    static void addLeaves(Node node,ArrayList<Integer> result)
    {
        if(node==null)return;
        if(isleaf(node)){
            result.add(node.data);
            return;
        }

        addLeaves(node.left,result);

        addLeaves(node.right,result);
    }
    public static void main(String[] args) {
      root=new Node(1);
      root.left=new Node(2);
      root.left.left=new Node(4);
      root.left.right=new Node(9);
      root.left.left.left=new Node(6);
      root.left.left.right=new Node(5);
      root.left.right.right=new Node(3);
      root.left.right.right.left=new Node(7);
      root.left.right.right.right=new Node(8);

        System.out.println(boundaryTraversal(root).toString());
    }
}
