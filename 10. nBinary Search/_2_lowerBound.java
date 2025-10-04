public class _2_lowerBound {
    public static int binarySearch(int[] arr, int target){
        int n = arr.length;
        int s=0, e=n-1;
        int lb = n;
        while (s<=e) {
            int mid = s+(e-s)/2;
            if(target <= arr[mid]){
                lb = Math.min(mid, lb);
                e = mid-1;
            }
            else s = mid+1;
        }
        return lb;
    }
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 30, 40, 50, 51};
        int idx = binarySearch(arr, 30);
        System.out.print(idx);
    }
}
