class Node{
    int val;
    Node next;
    public Node(){}
    public Node(int val){
        this.val = val;
    }
}

class LL{
    Node head;
    Node tail;
    void insertAtTail(int val){
        Node temp = new Node(val);
        if(head==null) head=tail=temp;
        else{
            tail.next = temp;
            tail = temp;
        }
    }

    void display(){
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    int returnMiddle(){
        Node slow = head;
        Node fast = head;
        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.val;
    }
}
public class deleteAtMiddle {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertAtTail(10);
        list.insertAtTail(20);
        list.insertAtTail(30);
        list.insertAtTail(40);
        list.insertAtTail(50);
        list.display();
        System.out.println(list.returnMiddle());
        list.insertAtTail(60);
        list.display();
        System.out.println(list.returnMiddle());
    }
}
