class Node{
    int val;
    Node next;
    Node(){}
    Node(int val){
        this.val = val;
    }
}
class CLLQueue {
    private Node f = null;
    private Node r = null;
    private int size = 0;
    void add(int val){
        Node x = new Node(val);
        if(f==null){
            f = r = x;
            x.next = x;
        }
        else{
            r.next = x;
            x.next = f;
            r = x;
        }
        size++;
    }
    int remove() throws Exception{
        if(size==0) throw new Exception("Queue is Empty!");
        int x = f.val;
        if(size==1) f = r = null;
        f=f.next;
        r.next = f;
        size--;
        return x;
    }
    int peek() throws Exception{
        if(size==0) throw new Exception("Queue is Empty!");
        return f.val;
    }

    int size()throws Exception{
        if(size==0) throw new Exception("Queue is Empty!");
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
        do{
            System.out.print(temp.val + " ");
            temp=temp.next;
        }while(temp!=f);
        System.out.println();
    }
}
public class linkedlistImplementation {
    public static void main(String[] args) throws Exception{
        CLLQueue q = new CLLQueue();
        System.out.println(q.isEmpty());
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
