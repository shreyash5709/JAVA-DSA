class Node{
    int val;
    Node next;
    Node(){}
    Node(int val){
        this.val = val;
    }
}
class LQueue{
    private Node f = null;
    private Node r = null;
    private int size = 0;
    void add(int val){
        Node x = new Node(val);
        if(f==null){
            f = r = x;
        }
        else{
            r.next = x;
            r = x;
        }
        size++;
    }
    int remove(){
        if(size==0){
            System.out.println("Queue is Empty!");
            return -1;
        }
        int x = f.val;
        f=f.next;
        size--;
        return x;
    }
    int peek(){
        if(size==0){
            System.out.println("Queue is Empty!");
            return -1;
        }
        return f.val;
    }
    int size(){
        return size;
    }
    boolean isEmpty(){
        if(size==0) return true;
        return false;
    }
    void display(){
        if(size==0){
            System.out.println("Queue is Empty!");
            return;
        }
        Node temp = f;
        while(temp!=null){
            System.out.print(temp.val + " ");
            temp=temp.next;
        }
        System.out.println();
    }
}

public class implementation {
    public static void main(String[] args) {
        LQueue q = new LQueue();
        System.out.println(q.isEmpty());
        q.remove();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.display();
        System.out.println(q.peek());
        System.out.println(q.size());
        q.remove();
        System.out.println(q.peek());
        System.out.println(q.size());
        System.out.println(q.isEmpty());
        q.display();
    }
}
