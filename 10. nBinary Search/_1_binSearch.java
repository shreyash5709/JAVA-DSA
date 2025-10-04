public class _1_binSearch {
    public static int binarySearch(int[] arr, int target){
        int s=0, e=arr.length-1;
        while (s<=e) {
            int mid = s+(e-s)/2;
            if(target == arr[mid]){
                return mid;
            }
            else if(target>arr[mid]){
                s=mid+1;
            }
            else e = mid-1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {10, 12, 15, 19, 25, 51};
        int idx = binarySearch(arr, 19); 
        System.out.print(idx);
    }
}
