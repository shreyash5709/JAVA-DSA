import java.util.Stack;

public class _3_removeSameConsecutive {
    public static void print(int[] arr){
        for(int el : arr){
            System.out.print(el + " ");
        }
        System.out.println();
    }
    public static int[] removeConsecutiveSubsequence(int[] arr){
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        for(int i=0; i<n; i++){
            if(st.size()==0 || st.peek()!=arr[i]) st.push(arr[i]);
            else if(arr[i] == st.peek()){
                if(i==n-1 || arr[i]!=arr[i+1]) st.pop();
            }
        }
        int[] ans = new int[st.size()];
        int m = ans.length;
        for(int i=m-1; i>=0; i--){
            ans[i] = st.pop();
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,10,10,10,4,4,4,5,7,7,2};
        print(arr);
        int[] ans = removeConsecutiveSubsequence(arr);
        print(ans);
    }
}
