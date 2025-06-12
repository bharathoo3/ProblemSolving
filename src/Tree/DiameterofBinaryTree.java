package Tree;
//543
import java.util.*;
public class DiameterofBinaryTree {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    public static void main(String[] args) {

    }
    public int diameterOfBinaryTree(TreeNode root) {
        Map<TreeNode,Integer> map=new HashMap<>();
        Stack<TreeNode> st=new Stack<>();
        int diameter=0;
        if(root!=null)st.push(root);
        while(!st.isEmpty())
        {
            TreeNode node=st.peek();
            if(node.left!=null && !map.containsKey(node.left))
                st.push(node.left);
            else if(node.right!=null && !map.containsKey(node.right))
                st.push(node.right);
            else{
                st.pop();
                int leftValue=map.getOrDefault(node.left,0);
                int rightValue=map.getOrDefault(node.right,0);

                map.put(node,1+Math.max(leftValue,rightValue));

                diameter=Math.max(diameter,leftValue+rightValue);
            }
        }
        return diameter;
    }
}
