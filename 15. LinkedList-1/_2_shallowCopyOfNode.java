public class _2_shallowCopyOfNode {
    public static void print(Node head){
        Node temp = head;
        while(temp != null){
            System.out.println(temp.val);
            temp = temp.next;
        }
    }
    public static void displayRecursive(Node head){
        if(head == null) return;
        // System.out.println(head.val + " ");
        displayRecursive(head.next);
        System.out.print(head.val + " "); // for reverse order printing
    }
    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        // Node temp = a; // shallow copy of a.
        // Node temp = new Node(a.val); // deep copy of a.
        // System.out.println(a);
        // System.out.println(temp);
        print(a);
        displayRecursive(a);
    }
}
