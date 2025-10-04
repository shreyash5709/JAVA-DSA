class Queue{
    private int f=-1;
    private int r=-1;
    private int size = 0;
    private int[] arr = new int[10];
    void add(int val){
        if(r==arr.length-1){
            System.out.println("Queue is Full!");
            return;
        }
        if(f == -1){ 
            f=r=0;
            arr[0] = val;
        }
        else{ 
            arr[++r] = val;
        }
        size++;
    }
    int remove(){
        if(size==0){
            System.out.println("Queue is Empty!");
            return -1;
        }
        int top = arr[f];
        f++;
        size--;
        return top;
    }
    int peek(){
        if(size==0){
            System.out.println("Queue is Empty!");
            return -1;
        }
        return arr[f];
    }
    boolean isEmpty(){
        if(size>0) return false;
        return true;
    }
    void display(){
        if(size==0) System.out.println("Queue is Empty!");
        for(int i=f; i<=r; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    int size(){
        return size;
    }
}
public class implimentation {
    public static void main(String[] args) {
        Queue qe = new Queue();
        qe.add(1);
        qe.add(2);
        qe.add(3);
        qe.add(4);
        qe.add(5);
        System.out.println(qe.peek());
        qe.display();
        qe.remove();
        qe.display();
        System.out.println(qe.size());
    }
}
