package Tree;
//235
public class LowestCommonAncestorofaBinarySearchTree {
    static TreeNode root = null;

    static class TreeNode {
        int val;
        TreeNode left;
       TreeNode right;
        TreeNode(int val)
        { this.val = val; }
    }
    public static void lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode ptr=root;
        if(root==null)return;
        while(ptr!=null)
        {
            if(p.val<ptr.val && q.val<ptr.val)
                ptr=ptr.left;
            else if(p.val>ptr.val && q.val>ptr.val)
                ptr=ptr.right;
            else
            {  System.out.println(ptr.val);
            break;}
        }
    }

    public static void main(String[] args) {
        root=new TreeNode(50);
        root.left=new TreeNode(10);
        root.left.right=new TreeNode(30);
        root.left.right.right=new TreeNode(40);
        root.right=new TreeNode(60);
        root.right.left=new TreeNode(55);
        root.right.right=new TreeNode(70);
        lowestCommonAncestor(root,new TreeNode(60),new TreeNode(70));
    }
}
