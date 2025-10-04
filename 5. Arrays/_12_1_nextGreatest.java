public class _12_1_nextGreatest {
    public static void print(int[] arr){
        for(int el : arr){
            System.out.print(el + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int [] arr = {12,8,41,37,2,49,16,28,21};
        int n = arr.length;
        int[] ans = new int[n];
        ans[n-1] = -1;
        for(int i=0; i<n-1; i++){
            int mx = Integer.MIN_VALUE;
            for(int j=i+1; j<n; j++){
                mx = Integer.max(mx, arr[j]);
            }
            ans[i]=mx;
        }
        print(arr);
        print(ans);
    }
}
