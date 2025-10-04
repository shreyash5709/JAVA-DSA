class CQueue{
    private int f=-1;
    private int r=-1;
    private int size = 0;
    private int[] arr = new int[5];
    int n = arr.length;
    void add(int val) throws Exception{
        if(size == n){
            throw new Exception("Queue is Full!");
        }
        else if(size==0){ 
            f=r=0;
            arr[0] = val;
        }
        else if(r==n-1){
            arr[0] = val;
            r=0;
        }
        else if(r<n-1){ 
            arr[++r] = val;
        } 
        size++;
    }

    int remove() throws Exception{
        if(size==0){
            throw new Exception("Queue is Empty!");
        }
        else{
            int top = arr[f]; 
            if(f == n-1) f=0;
            else f++;
            size--;
            return top;
        }
    }

    int peek() throws Exception{
        if(size==0){
            throw new Exception("Queue is Empty!");
        }
        return arr[f];
    }
    
    boolean isEmpty(){
        if(size>0) return false;
        return true;
    }

    void display(){
        if(size==0){
            System.out.println("Queue is Empty!");
            return;
        }
        if(f<=r){ // front<=rear
            for(int i=f; i<=r; i++){
                System.out.print(arr[i] + " ");
            }
        }
        else{ // rear<front
            for(int i=f; i<n; i++){
                System.out.print(arr[i] + " ");
            }

            for(int i=0; i<=r; i++){
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }
    
    int size(){
        return size;
    }
}
public class arrayImplementation {
    public static void main(String[] args) throws Exception{
        CQueue qe = new CQueue();
        qe.display();
        qe.add(1);
        qe.add(2);
        qe.add(3);
        qe.add(4);
        qe.display(); // 1 2 3 4
        qe.remove();
        qe.display(); //   2 3 4
        System.out.println(qe.size()); // 3
        qe.add(5);
        qe.display(); //   2 3 4 5
        qe.add(6);
        qe.display(); // 6 2 3 4 5  -> 2 3 4 5 6
        qe.remove();
        qe.display(); // 6 3 4 5 -> 3 4 5 6
        qe.add(7);
        qe.display(); // 7 6 3 4 5 -> 3 4 5 6 7
    }
}
