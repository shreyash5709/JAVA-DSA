import java.util.*;
class Node{
    int val;
    Node left;
    Node right;
    Node(){}
    Node(int val){
        this.val = val;
    }
}
public class _1_levelOrderTraversal {
    public static class Pair{
        Node node;
        int level;
        Pair(Node node, int level){
            this.node = node;
            this.level = level;
        }        
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        Node a = new Node(2);
        Node b = new Node(3);
        Node c = new Node(4);
        Node d = new Node(5);
        Node e = new Node(6);
        Node f = new Node(7);
        Scanner sc = new Scanner(System.in);
        root.left = a; root.right = b;
        a.left = c; a.right = d;
        b.left = e; b.right = f;
        leftToRightBFS(root);
        System.out.println();
        righToLefttBFS(root);
        System.out.println();
        // System.out.print("Enter the level : ");
        // int n = sc.nextInt();
        // nthLevelPrintBFS(root, 0, n);
        // System.out.println();

        
        int level = Levels(root);
        for(int i=1; i<=level; i++){
            nthLevelPrintBFS(root, 1, i);
            System.out.println();
        }
        System.out.println();

        levelOrderTraversal(root);
        sc.close();
    }
    public static void leftToRightBFS(Node root){
        Queue<Node> q = new LinkedList<>();
        if(root!=null) q.add(root);
        while(q.size()>0){
            Node front = q.remove();
            System.out.print(front.val + " ");
            if(front.left!=null) q.add(front.left);
            if(front.right!=null) q.add(front.right);
        }
    }
    public static void levelOrderTraversal(Node root){
        int prevLvl = 0;
        Queue<Pair> q = new LinkedList<>();
        if(root!=null) q.add(new Pair(root, 0));
        while(q.size()>0){
            Pair front = q.remove();
            Node temp = front.node;
            int lvl = front.level;
            if(lvl!=prevLvl){
                System.out.println();
                prevLvl++;
            }
            System.out.print(temp.val + " ");
            if(temp.left!=null) q.add(new Pair(temp.left, lvl+1));
            if(temp.right!=null) q.add(new Pair(temp.right, lvl+1));
        } 
    }
    public static void righToLefttBFS(Node root){
        Queue<Node> q = new LinkedList<>();
        if(root!=null) q.add(root);
        while(q.size()>0){
            Node front = q.remove();
            System.out.print(front.val + " ");
            if(front.right!=null) q.add(front.right);
            if(front.left!=null) q.add(front.left);
        }
    }
    public static void nthLevelPrintBFS(Node root, int level, int n){
        if(root==null) return;
        if(level==n) System.out.print(root.val + " ");
        nthLevelPrintBFS(root.left, level+1, n);
        nthLevelPrintBFS(root.right, level+1, n);
    }
    public static int Levels(Node root){
        if(root==null) return 0;
        int level = 1 + Math.max(Levels(root.left), Levels(root.right));
        return level;
    }
    
}
