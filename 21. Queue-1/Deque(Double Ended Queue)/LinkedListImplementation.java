class Node{
    int val;
    Node next;
    Node prev;
    Node(){}
    Node(int val){
        this.val = val;
    }
}
class Deque{
    Node front=null;
    Node rear=null;
    int size=0;

    void addFirst(int val){
        Node x = new Node(val);
        if(front==null) front = rear = x;
        else{
            x.next = front;
            front.prev = x;
            front = x;
        }
        size++;
    }

    void addLast(int val){
        Node x = new Node(val);
        if(rear==null) front = rear = x;
        else{
            rear.next = x;
            x.prev = rear;
            rear = x;
        }
        size++;
    }

    int removeFirst() throws Exception{
        if(size==0) throw new Exception("Deque is Empty!");
        int x = front.val;
        if(front==rear){
            front = rear = null;
        }
        else{
            front = front.next;
            front.prev = null;
        }
        size--;
        return x;
    }

    int removeLast() throws Exception{
        if(size==0) throw new Exception("Deque is Empty!");
        int x = rear.val;
        if(front==rear){
            front = rear = null;
        }
        else{
            rear = rear.prev;
            rear.next = null;
        }
        size--;
        return x;
    }

    int getFirst() throws Exception {
        if (size == 0) throw new Exception("Deque is Empty!");
        return front.val;
    }

    int getLast() throws Exception {
        if (size == 0) throw new Exception("Deque is Empty!");
        return rear.val;
    }

    boolean isEmpty() {
        return size == 0;
    }

    int getSize() {
        return size;
    }

    void display(){
        if (size == 0) {
            System.out.println("Deque is Empty!");
            return;
        }
        Node temp = front;
        while(temp!=null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
public class LinkedListImplementation {
    public static void main(String[] args) throws Exception{
        Deque dq = new Deque();
        
        System.out.println(dq.getSize()); // Should be 0
        
        dq.addFirst(1);
        dq.display(); // 1
        System.out.println(dq.getSize()); // Should be 1
        
        dq.addLast(2);
        dq.display(); // 1 2
        System.out.println(dq.getSize()); // Should be 2
        dq.addFirst(3); 
        dq.display(); // 3 1 2

        dq.removeFirst();
        dq.display(); // 1 2
        System.out.println(dq.getSize()); // Should be 2
        
        dq.removeLast();
        dq.display(); // 1
        System.out.println(dq.getSize()); // Should be 1
        
        System.out.println("Is empty: " + dq.isEmpty()); // Should be true
    }
}
