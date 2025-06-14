package Tree;
//100
public class SameTree {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val)
        { this.val = val; }
    }
    public static void main(String[] args) {
       TreeNode p=new TreeNode(1);
       p.right=new TreeNode(2);
        p.left=new TreeNode(3);
        TreeNode q=new TreeNode(1);
        q.right=new TreeNode(2);
        q.left=new TreeNode(3);
        System.out.println(isSameTree(p,q));
    }
    static public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null && q==null)return true;
        if(p==null || q==null)return false;
        if(p.val!=q.val)return false;
        return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
    }
}
