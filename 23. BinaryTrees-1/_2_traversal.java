public class _2_traversal {
    public static void main(String[] args) {
        Node root = new Node(1);
        Node a = new Node(2);
        Node b = new Node(3);
        Node c = new Node(4);
        Node d = new Node(5);
        Node e = new Node(6);
        Node f = new Node(7);
        root.left = a; root.right = b;
        a.left = c; a.right = d;
        b.left = e; b.right = f;
        preorder(root);
        System.out.println();
        inorder(root);
        System.out.println();
        postorder(root);
        System.out.println();
    }
    public static void preorder(Node root){
        if(root==null) return;
        System.out.print(root.val + " ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void inorder(Node root){
        if(root==null) return;
        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }
    public static void postorder(Node root){
        if(root==null) return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.val + " ");
    }
}
