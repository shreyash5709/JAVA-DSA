import java.util.Stack;

public class _1_basicsOfStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        System.out.println("Size of stack is : "+st.size());
        System.out.println(st);
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);
        System.out.println(st.peek());
        st.pop();
        System.out.println(st);
        System.out.println(st.peek());
        System.out.println("Size of stack is : "+st.size());
    }
}
