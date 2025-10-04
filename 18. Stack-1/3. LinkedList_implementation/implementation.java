class Node{
    int val;
    Node next;
    Node(int val){
        this.val = val;
    }
}
class LLStack {
    private Node head = null;
    private int size = 0;
    void push(int val){
        Node temp = new Node(val);
        temp.next = head;
        head = temp;
        size++;
    }
    int peek(){
        if(isEmpty()){
            System.out.println("Stack is Empty!");
            return -1;
        }
        return head.val;
    }
    int pop(){
        if(isEmpty()){
            System.out.println("Stack is UnderFlow!");
            return -1;
        }
        int top = head.val;
        head = head.next;
        size--;
        return top;
    }
    boolean isEmpty(){
        if(size==0) return true;
        return false;
    }
    int size(){
        return size;
    }
    void displayReverse(){
        Node temp = head;
        System.out.print("[");
        while(temp!=null){
            if(temp.next!=null) System.out.print(temp.val + ", ");
            else System.out.print(temp.val);
            temp = temp.next;
        }
        System.out.print("]");
        System.out.println();
    }
    void displayRec(Node h){
        if(h==null) return;
        Node temp = h;
        displayRec(h.next);
        if(temp==head) System.out.print(temp.val);
        else System.out.print(temp.val + ", ");
    }
    void display(){
        System.out.print("[");
        displayRec(head);
        System.out.println("]");
    }
}
public class implementation {
    public static void main(String[] args) {
        LLStack st = new LLStack();
        System.out.println(st.isEmpty());
        System.out.println("Size of stack is : " + st.size());
        System.out.println(st.peek());
        st.displayReverse();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        st.displayReverse();
        st.display();
        System.out.println(st.peek());
        System.out.println("Size of stack is : " + st.size());
        System.out.println(st.isEmpty());
        st.pop();
        st.pop();
        st.pop();
        st.pop();
        st.displayReverse();
        System.out.println(st.peek());
        System.out.println("Size of stack is : " + st.size());
        st.pop();
        st.displayReverse();
        System.out.println(st.peek());
        System.out.println("Size of stack is : " + st.size());
        st.pop();
    }
}
