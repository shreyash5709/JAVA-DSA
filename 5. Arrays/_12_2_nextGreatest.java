public class _12_2_nextGreatest {
    public static void print(int[] arr){
        for(int el : arr){
            System.out.print(el + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int [] arr = {12,8,60,37,2,49,16,28,21};
        int n = arr.length;
        int[] ans = new int[n];
        ans[n-1] = -1;
        int nge = arr[n-1];
        for(int i=n-2; i>=0; i--){
            ans[i]=nge;
            nge = Integer.max(nge, arr[i]);
        }
        print(arr);
        print(ans);
    }
}
