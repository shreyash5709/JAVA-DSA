public class _1_cycleSort {
    public static void print(int[] arr){
        for (int ele : arr) {
            System.out.print(ele+" ");
        }
        System.out.println();
    }

    public static void cycleSort(int[] arr){
        int n=arr.length;
        int i=0;
        while(i<n){
            if(arr[i]!=i) swap(arr, i, arr[i]);
            else i++;
        }
    }

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        int[] arr = {5, 4, 1, 2, 3, 0};
        print(arr);
        cycleSort(arr);
        print(arr);
    }
}
