public class _12_arrayTraversal {
    public static void print(int[] arr, int n){ // TC = O(n)
        if(n<0) return;
        print(arr, n-1);
        System.out.print(arr[n] + " ");
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int n = arr.length-1;
        print(arr, n);
    }
}
