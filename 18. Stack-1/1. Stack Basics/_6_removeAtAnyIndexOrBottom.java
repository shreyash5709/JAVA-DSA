import java.util.Stack;

public class _6_removeAtAnyIndexOrBottom {
    public static void removeAtBottom(Stack<Integer> st){
        if(st.size()==1){
            st.pop();
            return;
        }
        int top = st.pop();
        removeAtBottom(st);
        st.push(top);
    }
    public static void removeAtIndex(Stack<Integer> st, int idx){
        if(st.size()==idx+1){
            st.pop();
            return;
        }
        int top = st.pop();
        removeAtIndex(st, idx);
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
        // removeAtIndex(st, 2);
        removeAtBottom(st);
        System.out.println(st);
    }
}
