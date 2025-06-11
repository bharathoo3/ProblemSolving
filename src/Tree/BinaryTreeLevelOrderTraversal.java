package Tree;
//102  && 107
import java.util.*;
public class BinaryTreeLevelOrderTraversal {
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
    static  List<List<Integer>> printlevelorder(Node root,List<List<Integer>> result)
    {
        Queue<Node> qu=new LinkedList<>();
        qu.add(root);
        while(!qu.isEmpty())
        {
            int level= qu.size();
            List<Integer> li=new ArrayList<>();
            for(int i=0;i<level;i++)
            {
                Node ptr=qu.poll();
                li.add(ptr.data);
                if(ptr.left!=null)qu.offer(ptr.left);
                if(ptr.right!=null)qu.offer(ptr.right);
            }
            result.add(new ArrayList<>(li));
        }
        return result;
    }
    public static void main(String[] args) {
        root=new Node(10);
        root.left=new Node(20);
        root.right=new Node(30);
        root.left.left=new Node(40);
        root.left.right=new Node(50);
        root.right.left=new Node(60);
        root.right.right=new Node(70);
        List<List<Integer>> result=new ArrayList<>();
        System.out.println(printlevelorder(root,result).toString());
        System.out.println(result.reversed().toString());
    }
}
