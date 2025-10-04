import java.util.Stack;

public class _8_minStack {
    public static void print(int[] arr){
        for(int el : arr){
            System.out.print(el + " ");
        }
        System.out.println();
    }
    public static int getMin(int[] arr){
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        Stack<Integer> min = new Stack<>();
        for(int i=0; i<n; i++){
            if(min.size()>0){
                if(min.peek()>arr[i]){
                    min.push(arr[i]);
                }
                else min.push(min.peek()); 
            }
            st.push(arr[i]);
            min.push(arr[i]);
            if(min.size()>st.size()) min.pop();
        }
        return min.peek();
    }
    public static void main(String[] args) {
        int[] arr = {7,8,5,6,3,4};
        print(arr);
        System.out.print(getMin(arr));
        
    }
}
