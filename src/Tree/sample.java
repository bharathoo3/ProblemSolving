package Tree;

public class sample {
   static Node root=null;
  static   class Node{
        int data;
        Node left;
        Node right;
        Node(int data)
        {
            this.data=data;
            this.left=this.right=null;
        }
    }
    static void inorder()
    {
        inorderprint(root);
        System.out.println();
    }
    static void inorderprint(Node root)
    {
        if(root!=null)
        {
            inorderprint(root.left);
            System.out.print(root.data+" ");
            inorderprint(root.right);
        }
    }
    static void preorder()
    {
        preorderprint(root);
        System.out.println();
    }
    static void preorderprint(Node root)
    {
        if(root!=null)
        {
            System.out.print(root.data+" ");
            preorderprint(root.left);
            preorderprint(root.right);
        }
    }
    static void postorder()
    {
        postorderprint(root);
        System.out.println();
    }
    static void postorderprint(Node root)
    {
        if(root!=null)
        {
            postorderprint(root.left);
            postorderprint(root.right);
            System.out.print(root.data+" ");
        }
    }
    public static void main(String[] args) {
        root=new Node(10);
        root.left=new Node(20);
        root.right=new Node(30);
        root.left.left=new Node(40);
        root.left.right=new Node(50);
        root.right.left=new Node(60);
        root.right.right=new Node(70);
        System.out.print("Inorder: ");
        inorder();
        System.out.print("Preorder: ");
        preorder();
        System.out.print("Postorder: ");
        postorder();

    }
}
