import java.util.Stack;

public class _5_reverseStack {
    public static void insertAtBottom(Stack<Integer> st, int x){
        if(st.size()==0){
            st.push(x);
            return;
        }
        int top = st.pop();
        insertAtBottom(st, x);
        st.push(top);
    }
    public static void reverseStack(Stack<Integer> st){
        if(st.size()==1) return;
        int top = st.pop();
        reverseStack(st);
        insertAtBottom(st, top);
    }
    public static void main(String[] args) {
        Stack<Integer>st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);

        //  Normal Method 
        // Stack<Integer>gt = new Stack<>();
        // while(st.size()>0){
        //     gt.push(st.pop());
        // }
        // System.out.println(gt);
        // Stack<Integer>qt = new Stack<>();
        // while(gt.size()>0){
        //     qt.push(gt.pop());
        // }
        // System.out.println(qt);
        // while(qt.size()>0){
        //     st.push(qt.pop());
        // }
        // System.out.println(st);

        reverseStack(st);
        System.out.println(st);
    }
}
