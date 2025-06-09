package Tree;

import java.util.ArrayList;
import java.util.List;

//199
public class BinaryTreeRightSideView {
    static  TreeNode root=null;
  static   public class TreeNode {
     int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
 static void rightsideview(TreeNode root)
 {
     List<Integer> li=new ArrayList<>();
     findrightview(li,root,0);
     System.out.println(li.toString());
 }
 static void findrightview(List<Integer> li,TreeNode root,int level)
 {
     if(root==null)
         return;
     if(level==li.size())
         li.add(root.val);
     findrightview(li,root.right,level+1);
     findrightview(li,root.left,level+1);
 }
    public static void main(String[] args) {
         root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.right=new TreeNode(3);
        root.left.right=new TreeNode(5);
        root.right.right=new TreeNode(4);
        rightsideview(root);
    }
}
