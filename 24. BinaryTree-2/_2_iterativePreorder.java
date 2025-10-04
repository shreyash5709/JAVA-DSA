import java.util.*;
public class _2_iterativePreorder {
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
        preorderDisplay(root);

    }
    public static void preorderDisplay(Node root){
        Stack<Node> st = new Stack<>();
        if(root!=null) st.push(root);
        while(st.size()>0){
            Node top = st.pop();
            System.out.print(top.val + " ");
            if(top.right!=null) st.push(top.right);
            if(top.left!=null) st.push(top.left);
        }
        System.out.println();
    }
} 