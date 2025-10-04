public class _7_KthLargest {
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

    public static int partion(int[] arr, int hi, int lo){
        int mid = lo+(hi-lo)/2;
        int pivot = arr[mid], pivotIdx = mid;
        int smallCount = 0;
        for(int i=lo; i<=hi; i++){
            if(i==mid) continue;
            else if(arr[i]<=pivot) smallCount++;
        }
        int correctIdx = lo+smallCount;
        swap(arr, pivotIdx, correctIdx);
        // Partion
        int i=lo, j=hi;
        while(i<correctIdx && j>correctIdx){
            if(arr[i]<=pivot) i++;
            else if(arr[j]>pivot) j--;
            else if(arr[i]>pivot && arr[j]<=pivot) swap(arr, i, j);
        }
        return correctIdx;
    }

    public static void quickSelect(int[] arr, int lo, int hi, int k){
        if(lo>hi) return;
        // if(lo==hi){
        //     if(lo==k-1) ans = arr[lo];
        //     return;
        // }

        int idx = partion(arr, hi, lo);

        if(idx==k-1){
            ans = arr[idx];
            return;
        }
        else if(idx>k-1) quickSelect(arr, lo, idx-1, k);
        else quickSelect(arr, idx+1, hi, k);
    }

    static int ans;
    public static void main(String[] args) {
        int[] arr = {4, 9, 7, 1, 3, 2, 6, 5, 8};
        int n = arr.length;
        int k = 3;
        ans = 0;
        print(arr);
        quickSelect(arr, 0, n-1, n-k+1);
        System.out.println(ans);
    }
}
