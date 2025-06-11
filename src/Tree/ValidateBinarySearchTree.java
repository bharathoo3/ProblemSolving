package Tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//98
public class ValidateBinarySearchTree {
    static TreeNode root = null;
    static List<Integer> arry=new ArrayList<>();
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val)
        { this.val = val; }
    }
    public static boolean isValidBST(TreeNode root) {
        return booleans(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }
    static boolean booleans(TreeNode root,long min,long max)
    {
        if(root==null) return true;
        if(root.val <= min || root.val >=max)
            return false;
        return booleans(root.left,min,root.val) && booleans(root.right,root.val,max);
    }
    static void inorder(TreeNode root)
    {
        if(root==null)return;
        inorder(root.left);
        arry.add(root.val);
        inorder(root.right);
    }

    public static void main(String[] args) {
        root=new TreeNode(50);
        root.left=new TreeNode(10);
        root.left.right=new TreeNode(30);
        root.left.right.right=new TreeNode(40);
        root.right=new TreeNode(60);
        root.right.left=new TreeNode(55);
        root.right.right=new TreeNode(70);
        System.out.println(isValidBST(root));

        //inorder method
        inorder(root);
        System.out.println(arry.toString());
        int flag=-1;
        for(int i=1;i<arry.size();i++)
        {
            if(arry.get(i-1)>arry.get(i)) {
                System.out.println("false");
                flag++;
                break;
            }
        }
        if(flag==-1)
            System.out.println("true");
    }
}
