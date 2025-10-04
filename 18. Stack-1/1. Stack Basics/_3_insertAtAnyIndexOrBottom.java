import java.util.Stack;

public class _3_insertAtAnyIndexOrBottom {
    public static void insertAtBottom(Stack<Integer> st, int x){
        if(st.isEmpty()){
            st.push(x);
            return;
        }
        int top = st.pop();
        insertAtBottom(st, x);
        st.push(top);
    }
    public static void insertAtIndex(Stack<Integer> st, int x, int idx){
        if(st.size()==idx){
            st.push(x);
            return;
        }
        int top = st.pop();
        insertAtIndex(st, x, idx);
        st.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer>st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);

        // Normal method
        // Stack<Integer>temp = new Stack<>();
        // int idx = 2;
        // int x = 6;
        // while(st.size()>idx){
        //     temp.push(st.pop());
        // }
        // System.out.println(temp);
        // st.push(x);
        // while(temp.size()>0){
        //     st.push(temp.pop());
        // }
        // System.out.println(st);
        // System.out.println(temp);

        insertAtIndex(st, 6, 0);
        System.out.println(st);
        insertAtBottom(st, 7);
        System.out.println(st);
    }
}