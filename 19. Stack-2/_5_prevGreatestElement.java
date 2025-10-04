import java.util.Stack;

public class _5_prevGreatestElement {
    public static void print(int[] arr){
        for(int el : arr){
            System.out.print(el + " ");
        }
        System.out.println();
    }
    // Method-1
    public static int[] prevGreatestM1(int[] arr){
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[n];
        st.push(arr[0]);
        ans[0] = -1;
        for(int i=1; i<n; i++){
            while(st.size()>0 && arr[i]>st.peek()) st.pop();
            if(st.size()==0) ans[i] = -1;
            else ans[i] = st.peek();
            st.push(arr[i]); 
        }
        return ans;
    }

    // Method-2
    public static int[] prevGreatestM2(int[] arr){
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[n];
        for(int i=0; i<n; i++){
            ans[i] = -1;
            while(st.size()>0 && arr[i]>arr[st.peek()]) st.pop();
            if(st.size()>0 && arr[i]<arr[st.peek()]){
                ans[i] = arr[st.peek()];
            }
            st.push(i); 
        }
        return ans;
    }

    // Method-3
    public static int[] prevGreatestM3(int[] arr){
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[n];
        for(int i=n-1; i>=0; i--){
            ans[i] = -1;
            while(st.size()>0 && arr[i]>arr[st.peek()]){
                ans[st.peek()] = arr[i];
                st.pop();
            }
            st.push(i); 
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {100, 80, 60, 70, 60, 75, 85};
        print(arr);
        int[] ans1 = prevGreatestM1(arr);
        print(ans1);
        int[] ans2 = prevGreatestM2(arr);
        print(ans2);
        int[] ans3 = prevGreatestM3(arr);
        print(ans3);
    }
}