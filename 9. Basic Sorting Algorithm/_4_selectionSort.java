public class _4_selectionSort {
    public static void print(int[] arr) {
        for(int ele : arr){
            System.out.print(ele + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {2,3,1,6,5,4};
        int n = arr.length;
        for(int i=0; i<n-1; i++){
            int min = Integer.MAX_VALUE;
            int minIdx = -1;
            for (int j = i; j < n; j++) {
                min = Math.min(min, arr[j]);
                if(min==arr[j]) minIdx = j;
            }
            int temp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = temp;
        }
        print(arr);
    }
}
