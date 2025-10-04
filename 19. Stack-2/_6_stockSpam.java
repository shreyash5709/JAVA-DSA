import java.util.Stack;

public class _6_stockSpam {
    public static void print(int[] arr){
        for(int el : arr){
            System.out.print(el + " ");
        }
        System.out.println();
    }
    public static int[] prevGreatest(int[] arr){
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[n];
        for(int i=0; i<n; i++){
            while(st.size()>0 && arr[i]>=arr[st.peek()]) st.pop();
            if(st.size()==0) ans[i] = i+1;
            else ans[i] = i-st.peek();
            st.push(i); 
        }
        return ans;
    }
    // public ArrayList<Integer> calculateSpan(int[] arr) {
    //     // code here
    //     int n = arr.length;
    //     Stack<Integer> st = new Stack<>();
    //     ArrayList<Integer> ans = new ArrayList<Integer>();
    //     st.push(0);
    //     ans.add(1);
    //     for(int i=1; i<n; i++){
    //         while(st.size()>0 && arr[i]>=arr[st.peek()]) st.pop();
    //         if(st.size()==0) ans.add(i+1);
    //         else ans.add(i-st.peek());
    //         st.push(i);
    //     }
    //     return ans;
    // }
    public static void main(String[] args) {
        int[] arr = {3, 7, 7, 6, 1, 2, 6, 3, 7, 5};
        print(arr);
        int[] ans = prevGreatest(arr);
        print(ans);
    }
}
