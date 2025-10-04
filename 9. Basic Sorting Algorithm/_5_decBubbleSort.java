public class _5_decBubbleSort {
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
        for(int i=0; i<n-1; i++){
            boolean flag = true;
            for(int j=0; j<n-1-i; j++){
                if(arr[j] < arr[j+1]){
                    swap(arr, j, j+1);
                    flag = false;
                }
            }
            if(flag == true) break;
        }
    }
}
