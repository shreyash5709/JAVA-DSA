class Node{
    int val;
    Node next;
    Node prev;
    Node(){}
    Node(int val){
        this.val = val;
    }
}
class DLL{
    Node head;
    Node tail;
    int size;
    void print(){
        Node temp = head;
        while (temp!=null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }  
    void reversePrint(){
        Node temp = tail;
        while (temp!=null) {
            System.out.print(temp.val + " ");
            temp = temp.prev;
        }
        System.out.println();
    }  
    void insertAtTail(int val){
        Node temp = new Node(val);
        if(size==0) head = tail = temp;
        else{
            tail.next = temp;
            temp.prev = tail;
            tail = temp;
        }
        size++;
    }
    void insertAtHead(int val){
        Node temp = new Node(val);
        if(size==0) head = tail = temp;
        else{
            temp.next = head;
            head.prev = temp;
            head = temp;
        }
        size++;
    }
    void insert(int idx, int val){
        if(idx < 0 || idx > size){
            System.out.println("Invalid index");
            return;
        }
        if(idx==0){
            insertAtHead(val);
            return;
        }
        if(idx==size){ 
            insertAtTail(val);
            return;
        }
        Node temp = new Node(val);
        Node x = head;
        for(int i=1; i<idx; i++){
            x = x.next;
        }
        Node y = x.next;
        x.next = temp;
        temp.prev = x;
        y.prev = temp;
        temp.next = y;
        size++;
    }
    void deleteAtHead(){
        if(size==0) throw new Error("List is empty !");
        head = head.next;
        head.prev = null;
        size--;
    }
    void deleteAttail(){
        if(size==0) throw new Error("List is empty !");
        tail = tail.prev;
        tail.next = null;
        size--;
    }
    void delete(int idx){
        if(idx<0 || idx>=size){
            System.out.println("Invalid index !");
            return;
        }
        if(idx==0){
            deleteAtHead();
            return;
        }
        if(idx==size-1){
            deleteAttail();
            return;
        }
        Node temp = head;
        for(int i=1; i<idx; i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
        temp = temp.next;
        temp.prev = temp.prev.prev;
        size--;
    }
    int get(int idx){
        if(head==null) return -1;
        if(idx<0 || idx>=size){
            System.out.print("Invalid index ! ");
            return idx;
        }
        if(idx==0) return head.val;
        if(idx==size-1) return tail.val;
        Node temp = head;
        for(int i=0; i<idx; i++){
            temp = temp.next;
        }
        return temp.val;
    }
    void set(int idx, int val){
        if(idx<0 || idx>=size){
            System.out.print("Invalid index ! ");
            return;
        }
        if(idx==0){
            head.val = val;
            return;
        }
        if(idx==size-1){
            tail.val = val;
            return;
        }
        Node temp = head;
        for(int i=0; i<idx; i++){
            temp = temp.next;
        }
        temp.val = val;
    }
}
public class doublyLL_implimentation {
    public static void main(String[] args) {
        DLL list = new DLL();
        list.insertAtTail(10);
        list.insertAtTail(20);
        list.insertAtTail(30);
        list.insertAtTail(40);
        list.insertAtTail(50);
        list.print();
        list.reversePrint();
        list.insertAtHead(5);
        list.print();
        list.reversePrint();
        list.insert(3, 25);
        list.print();
        list.insert(0, 2);
        list.print();
        list.insert(8, 60);
        list.print();
        list.deleteAtHead();
        list.print();
        list.deleteAttail();
        list.print();
        list.delete(3);
        list.print();
        System.out.println(list.get(2));
        System.out.println(list.get(-1));
        System.out.println(list.get(6));
        list.set(0, 9);
        list.print();
        list.set(3, 35);
        list.print();
        list.set(5, 45);
        list.print();
    }
}
