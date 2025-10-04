public class _5_sort {
    public static void print(int[] arr){
        for(int el : arr){
            System.out.print(el + " ");
        }
        System.out.println();
    }
    public static void swap(int[] arr, int i, int j){
        int swap = arr[i];
        arr[i] = arr[j];
        arr[j] = swap;
    }

    public static void quickSort(int[] arr, int lo, int hi){
        if(lo>=hi) return;
        int pivot = arr[lo];
        int smallCount = 0;
        for(int i=lo+1; i<=hi; i++){
            if(arr[i]<=pivot) smallCount++;
        }
        int correctIdx = lo+smallCount;
        swap(arr, lo, correctIdx);
        int i=lo, j=hi;
        while(i<correctIdx || j>correctIdx){
            if(arr[i]<=pivot) i++;
            else if(arr[j]>pivot) j--;
            else if(arr[i]>pivot && arr[j]<=pivot) swap(arr, i, j);
        }
        quickSort(arr, lo, correctIdx-1);
        quickSort(arr, correctIdx+1, hi);
    }
    public static void main(String[] args) {
        int[] arr = {4, 9, 7, 1, 3, 2, 6, 5, 8};
        int n = arr.length;
        print(arr);
        quickSort(arr, 0, n-1);
        print(arr);
    }
}
