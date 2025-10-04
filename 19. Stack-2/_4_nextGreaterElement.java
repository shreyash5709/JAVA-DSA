import java.util.Stack;

public class _4_nextGreaterElement {
    public static void print(int[] arr){
        for(int el : arr){
            System.out.print(el + " ");
        }
        System.out.println();
    }

    // Using Array
    // public static int[] nextGreater(int[] arr){
    //     int n = arr.length;
    //     int[] ans = new int[n];
    //     for(int i=0; i<n; i++){
    //         ans[i] = -1;
    //         for(int j=i+1; j<n; j++){
    //             if(arr[j]>arr[i]){
    //                 ans[i] = arr[j];
    //                 break;
    //             }
    //         }
    //     }
    //     return ans;
    // }

    // Using Stack method-1
    public static int[] nextGreaterM1(int[] arr){
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[n];
        st.push(arr[n-1]);
        ans[n-1] = -1;
        for(int i=n-2; i>=0; i--){
            ans[i] = -1;
            while(st.size()>0 && arr[i]>st.peek()) st.pop();
            ans[i] = st.peek();
            st.push(arr[i]);
        }
        return ans;
    }

    // Using Stack method-2
    public static int[] nextGreaterM2(int[] arr){
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[n];
        for(int i=n-1; i>=0; i--){
            ans[i] = -1;
            while(st.size()>0 && arr[i]>arr[st.peek()]) st.pop();
            if(st.size()>0 && arr[i]<arr[st.peek()]){ 
                ans[i]=arr[st.peek()];
            }
            st.push(i);
        }
        return ans;
    }

    // Using Stack method-3
    public static int[] nextGreaterM3(int[] arr){
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[n];
        for(int i=0; i<n; i++){
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
        int[] arr = {2,-1,2};
        print(arr);
        int[] ans1 = nextGreaterM1(arr);
        print(ans1);
        int[] ans2 = nextGreaterM2(arr);
        print(ans2);
        int[] ans3 = nextGreaterM3(arr);
        print(ans3);
    }
}
