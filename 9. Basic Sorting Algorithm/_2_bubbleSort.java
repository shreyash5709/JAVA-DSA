public class _2_bubbleSort {
    public static void print(int[] arr) {
        for(int ele : arr){
            System.out.print(ele + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {3,2,1,5,4};
        print(arr);
        sort(arr);
        print(arr);
    }
    public static void sort(int[] arr){
        int n=arr.length;
        // // Bubble sort - 1
        // for (int i = 0; i < n-1; i++) {
        //     for(int j=0; j<n-1; j++){
        //         if(arr[j]>arr[j+1]){
        //             int temp = arr[j];
        //             arr[j] = arr[j+1];
        //             arr[j+1] = temp;
        //         }
        //     }
        // }
        // // Bubble sort - 2
        // for (int i = 0; i < n-1; i++) {
        //     for(int j=0; j<n-1-i; j++){
        //         if(arr[j]>arr[j+1]){
        //             int temp = arr[j];
        //             arr[j] = arr[j+1];
        //             arr[j+1] = temp;
        //         }
        //     }
        // }
        // Bubble sort optimized
        for (int i = 0; i < n-1; i++) {
            boolean flag = true;
            for(int j=0; j<n-1-i; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = false;
                }
            }
            // check this pass is sorted or not 
            if(flag == true) break;
        }
    }
}
