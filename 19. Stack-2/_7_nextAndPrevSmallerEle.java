import java.util.Stack;

public class _7_nextAndPrevSmallerEle {
    public static void print(int[] arr){
        for(int el : arr){
            System.out.print(el + " ");
        }
        System.out.println();
    }
    public static int[] nextSmaller(int[] arr){
        int n = arr.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i=0; i<n; i++){
            ans[i] = -1;
            while(st.size()>0 && arr[i]<arr[st.peek()]){
                ans[st.peek()] = arr[i];
                st.pop();
            }
            st.push(i);
        }
        return ans;
    }
    public static int[] prevSmaller(int[] arr){
        int n = arr.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i=0; i<n; i++){
            ans[i] = -1;
            while(st.size()>0 && arr[i]<=arr[st.peek()]) st.pop();
            if(st.size()>0 && arr[i]>arr[st.peek()]){
                ans[i] = arr[st.peek()];
            }
            st.push(i);
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {2,4,4};
        print(arr);
        int[] ans1 = nextSmaller(arr);
        print(ans1);
        int[] ans2 = prevSmaller(arr);
        print(ans2);
    }
}
