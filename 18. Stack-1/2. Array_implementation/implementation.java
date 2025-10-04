class Stack{
    private int[] arr = new int[5];
    private int idx = 0;
    void push(int val){
        if(isFull()){
            System.out.println("Stack is OverFlow !");
            return;
        }
        arr[idx] = val;
        idx++;
    }
    int peek(){
        if(isEmpty()){
            System.out.println("Stack is Empty!");
            return -1;
        }
        return arr[idx-1];
    }
    int pop(){
        if(isEmpty()){
            System.out.println("Stack is UnderFlow!");
            return -1;
        }
        int top = arr[idx-1];
        arr[idx-1] = 0;
        idx--;
        return top;
    }
    int size(){
        return idx;
    }
    boolean isEmpty(){
        if(idx == 0) return true;
        return false;
    }
    boolean isFull(){
        if(idx==arr.length) return true;
        return false;
    }
    int capacity(){
        return arr.length;
    }
    void display(){
        System.out.print("[");
        for(int i=0; i<idx; i++){
            if(i==idx-1) System.out.print(arr[i]+"");
            else System.out.print(arr[i] + ", ");
        }
        System.out.println("]");
    }
}
public class implementation {
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        st.display();
        System.out.println(st.peek());
        System.out.println(st.isFull());
        System.out.println(st.isEmpty());
        System.out.println(st.capacity());
        System.out.println("Size of Stack is : " + st.size());
        st.push(60);

        st.pop();
        st.pop();
        st.pop();
        st.display();
        System.out.println("Size of Stack : "+st.size());
        System.out.println(st.isFull());
        System.out.println(st.isEmpty());
        st.pop();
        st.pop();
        st.display();
        System.out.println("Size of Stack : "+st.size());
        System.out.println(st.isFull());
        System.out.println(st.isEmpty());
        st.pop();
    }
}
