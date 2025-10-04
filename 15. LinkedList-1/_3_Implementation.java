class SLL{ // User defined data structure
    private Node head;
    private Node tail;
    private int size;
    void insertAtTail(int val){
        Node temp = new Node(val);
        if(head==null) head = tail = temp;
        else{
            tail.next = temp;
            tail = temp;
        }
        size++;
    }
    
    void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    
    void size(){
        System.out.println("Size : " + size);
    }

    void insertAtHead(int val){
        Node temp = new Node(val);
        if(head==null) head = tail = temp;
        else{
            temp.next = head;
            head = temp;
        }
        size++;
    }

    void insert(int idx, int val){
        if(idx==0){
            insertAtHead(val);
            return;
        }
        else if(idx==size){
            insertAtTail(val);
            return;
        }
        else if(idx>size || idx<0){
            System.out.print("Invalid index !");
            return;
        }

        Node temp = new Node(val);
        Node x = head;
        for(int i=0; i<idx; i++){
            x = x.next;
        }
        temp.next = x.next;
        x.next = temp;
        size++;
    }

    int get(int idx) throws Error{
        if(idx==size-1){
            return tail.val;
        }
        if(idx>=size || idx<0){
            throw new Error("Invalid index !");
        }
        Node x = head;
        for(int i=1; i<=idx; i++){
            x = x.next;
        }
        return x.val;
    }

    void set(int idx, int val) throws Error{
        if(idx==size-1){
            tail.val = val;
            return;
        }
        if(idx>=size || idx<0){
            throw new Error("Invalid index !");
        }
        Node x = head;
        for(int i=1; i<=idx; i++){
            x = x.next;
        }
        x.val = val;
    }

    void delete(int idx) throws Error{
        if(size==0) throw new Error("List is empty !");
        if(idx==0){
            head = head.next;
            size--;
            return;
        }
        if(idx>=size || idx<0){
            throw new Error("Invalid index !");
        }
        Node temp = head;
        for(int i=1; i<idx; i++){
            temp = temp.next;
        }
        if(temp.next==tail) tail = temp;
        temp.next = temp.next.next;
        size--;
    }
}

public class _3_Implementation {
    public static void main(String[] args) {
        SLL list = new SLL();
        list.size();
        list.insertAtTail(10);
        list.insertAtTail(20);
        list.insertAtTail(30);
        list.insertAtTail(40);
        list.display();
        list.size();
        list.insertAtTail(50);
        list.display();
        list.size();
        // list.insertAtHead(5);
        // list.display();
        // list.size();
        // list.insert(3, 35);
        // list.display();
        // list.size();
        System.out.println(list.get(3));

        list.set(3, 25);
        list.display();
        list.size();
        list.delete(3);
        list.display();
        list.size();
        list.delete(3);
        list.display();
        list.size();
    }
}
