public class _6_newSelectionSort {
    public static void print(int[] arr) {
        for(int ele : arr){
            System.out.print(ele + " ");
        }
        System.out.println();
    }
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        int[] arr = {3,2,1,5,4};
        print(arr);
        sort(arr);
        print(arr);
    }
    public static void sort(int[] arr){
        int n = arr.length;
        for (int i = n-1; i >= 0; i--) {
            int max = Integer.MIN_VALUE;
            int maxIdx = 0;
            for (int j = i; j >= 0; j--) {
                max = Math.max(max, arr[j]);
                if(max == arr[j]) maxIdx = j;
            }
            swap(arr, i, maxIdx);
        }
    }
}
