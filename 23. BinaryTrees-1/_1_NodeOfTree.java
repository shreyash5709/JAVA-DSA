class Node{
    int val;
    Node left;
    Node right;
    Node(){}
    Node(int val){
        this.val = val;
    }
}

class _1_NodeOfTree{
    public static void main(String[] args) {
        Node root = new Node(11);
        Node a = new Node(4);
        Node b = new Node(3);
        Node c = new Node(21);
        Node d = new Node(6);
        Node e = new Node(5);
        Node f = new Node(10);
        root.left = a; root.right = b;
        a.left = c; a.right = d;
        b.left = e; b.right = f;
        System.out.println(e.val);
        System.out.println(root.right.right.val);
        display(root);
        System.out.println();
        System.out.println(SumOfTreeNode(root));
        System.out.println(ProductOFTreeNode(root));
        System.out.println(ProductOFNonZeroNode(root));
        System.out.println(MaxNode(root));
        System.out.println(MinNode(root));
        System.out.println(Size(root));
        System.out.println(Level(root));
    }

    public static void display(Node root){
        if(root==null) return;
        System.out.print(root.val + " ");
        display(root.left);
        display(root.right);
    }
    public static int SumOfTreeNode(Node root){
        if(root==null) return 0;
        int sum = 0;
        sum += root.val + SumOfTreeNode(root.left) + SumOfTreeNode(root.right);
        return sum;
    }
    public static int ProductOFTreeNode(Node root){
        if(root==null) return 1;
        int product = 1;
        product *= root.val * ProductOFTreeNode(root.left) * ProductOFTreeNode(root.right);
        return product;
    }
    public static int ProductOFNonZeroNode(Node root){
        if(root==null ) return 1;
        if(root.val % 10 == 0) return 1;
        int product = 1;
        product *= root.val * ProductOFNonZeroNode(root.left) * ProductOFNonZeroNode(root.right);
        return product;
    }
    public static int MaxNode(Node root){
        if(root==null ) return Integer.MIN_VALUE;
        // int max = root.val;
        // int maxl = Integer.MIN_VALUE;
        // int maxr = Integer.MIN_VALUE;
        // maxl = Math.max(maxl, MaxNode(root.left));
        // max = Math.max(max, maxl);
        // maxr = Math.max(maxr, MaxNode(root.right));
        // max = Math.max(max, maxr);

        // int max = root.val;
        // max = Math.max(max, Math.max(MaxNode(root.left), MaxNode(root.right)));

        int max = root.val;
        int a = MaxNode(root.left);
        int b = MaxNode(root.right);
        max = Math.max(max, Math.max(a, b));
        return max;
    }
    public static int MinNode(Node root){
        if(root==null ) return Integer.MAX_VALUE;
        int a = root.val, b = MinNode(root.left), c = MinNode(root.right);
        return Math.min(a, Math.min(b, c));
    }
    public static int Size(Node root){
        if(root==null ) return 0;
        int size = 1 + Size(root.left) + Size(root.right);
        return size;
    }
    public static int Level(Node root){
        if(root==null ) return 0;
        int level = 1 + Math.max(Level(root.left), Level(root.right));
        return level;
    }
}