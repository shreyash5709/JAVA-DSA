public class QS_1_ {
    public static class LL{
        Node head;
        Node tail;
        private int size;
        void size(){
            System.out.println("Size : " + size);
        }
        void insertAtTail(int val){
            Node temp = new Node(val);
            if(head==null) head = tail = temp;
            tail.next = temp;
            tail = temp;
            size++;
        }
        void insertAtHead(int val){
            Node temp = new Node(val);
            if(head==null) head = tail = temp;
            temp.next = head;
            head = temp;
            size++;
        }
        void insert(int idx, int val) throws Error{
            if(idx==0){ 
                insertAtHead(val);
                return;
            }
            if(idx==size){
                insertAtTail(val);
                return;
            }
            if(idx<0 || idx>size) throw new Error("Invalid index !");
            Node temp = new Node(val);
            Node x = head;
            for(int i=1; i<idx; i++){
                x = x.next;
            }
            temp.next = x.next;
            x.next = temp;
            size++;
        }
        void display(){
            Node temp = head;
            while(temp != null){
                System.out.print(temp.val + " ");
                temp=temp.next;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        LL list = new LL();
        list.size();
        list.insertAtTail(10);
        list.insertAtTail(20);
        list.insertAtTail(30);
        list.insertAtTail(40);
        list.insertAtTail(50);
        list.display();
        list.size();
        System.out.println(list.head.val);
        System.out.println(list.tail.val);
        list.insertAtHead(5);
        list.insertAtTail(60);
        list.display();
        list.size();
        System.out.println(list.head.val);
        System.out.println(list.tail.val);
        list.insert(3, 25);
        list.display();
        list.size();
        list.insert(0, 1);
        list.display();
        list.size();
        list.insert(9, 70);
        list.display();
        list.size();
    }
}
