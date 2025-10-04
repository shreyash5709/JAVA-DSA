public class _7_insertionSort {
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
        for (int i = 1; i < n; i++) {
            for (int j = i; j >= 1 && arr[j]<arr[j-1]; j--) {
                swap(arr, j, j-1);
            }
        }
    }
}
