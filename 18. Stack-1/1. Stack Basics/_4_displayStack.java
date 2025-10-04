import java.util.Stack;

public class _4_displayStack {
    public static void displayStack(Stack<Integer> st){
        if(st.size()==0) return;
        int top = st.pop();
        displayStack(st);
        System.out.print(top + " ");
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
        // using a altenative stack
        // Stack<Integer>temp = new Stack<>();
        // while(st.size()>0){
        //     temp.push(st.pop());
        // }
        // System.out.println(temp);
        // while(temp.size()>0){
        //     int x = temp.pop();
        //     System.out.print(x + " ");
        //     st.push(x);
        // }
        // System.out.println();
        // System.out.println(st);

        // using sn array;
        // int n = st.size();
        // int[] temp = new int[n];
        // for(int i=n-1; i>=0; i--){
        //     temp[i] = st.pop();
        // }
        // for(int i=0; i<n; i++){
        //     System.out.print(temp[i] + " ");
        //     st.push(temp[i]);
        // }
        // System.out.println();
        // System.out.println(st);

        // recursive print;
        displayStack(st);
    }
}
