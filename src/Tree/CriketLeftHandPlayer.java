package Tree;
//404
public class CriketLeftHandPlayer {
    static TreeNode root = null;

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val)
        { this.val = val; }
    }

    static int leftHandBatsman(TreeNode root) {
        return dfs(root, false);
    }

    static int dfs(TreeNode node, boolean isLeft) {
        if (node == null) return 0;
        //only left batsmen should added
        if (node.left == null && node.right == null && isLeft)
            return node.val;

        //like a factorial method
        return dfs(node.left, true) + dfs(node.right, false);
    }

    public static void main(String[] args) {
        root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);


        int result = leftHandBatsman(root);
        System.out.println("Sum of left-hand batsman (left leaves): " + result);
    }
}
