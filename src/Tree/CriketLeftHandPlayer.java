//package Tree;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class CriketLeftHandPlayer {
//    static BinaryTreeRightSideView.TreeNode root=null;
//    static   public class TreeNode {
//        int val;
//        BinaryTreeRightSideView.TreeNode left;
//        BinaryTreeRightSideView.TreeNode right;
//        TreeNode() {}
//        TreeNode(int val) { this.val = val; }
//        TreeNode(int val, BinaryTreeRightSideView.TreeNode left, BinaryTreeRightSideView.TreeNode right) {
//            this.val = val;
//            this.left = left;
//            this.right = right;
//        }
//    }
//    static void lefthandbatsman(BinaryTreeRightSideView.TreeNode root)
//    {
//        List<Integer> li=new ArrayList<>();
//        int count=0;
//        lefthandbatsmanview(li,root,count);
//        System.out.println(count);
//    }
//    static void lefthandbatsmanview(List<Integer> li, BinaryTreeRightSideView.TreeNode root, int count)
//    {
//        if(root==null)
//            return;
//        if(root==root.left){
//        count= +root.val;
//        lefthandbatsmanview(li,root.left,count);
//        lefthandbatsmanview(li,root.right,count);
//
//    }
//    public static void main(String[] args) {
//        root=new BinaryTreeRightSideView.TreeNode(1);
//        root.left=new BinaryTreeRightSideView.TreeNode(2);
//        root.right=new BinaryTreeRightSideView.TreeNode(3);
//        root.left.right=new BinaryTreeRightSideView.TreeNode(5);
//        root.right.right=new BinaryTreeRightSideView.TreeNode(4);
//        lefthandbatsman(root);
//    }
//}
