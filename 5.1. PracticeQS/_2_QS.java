public class _2_QS {
    public static int secondLargest(int[] arr){
        int n = arr.length;
        if(n<2){
            System.out.print("Array should have two element.");
            return -1;
        }
        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;
        for(int i=1; i<n; i++){
            if(arr[i]>max){
                smax = max;
                max = arr[i];
            }
            else if(arr[i]>smax && arr[i]!=max){
                smax = arr[i];
            }
        }
        return smax;
    }
    public static void main(String[] args) {
        int[] arr = {10,50,50,61,5,4,9,10,3};
        int secondMax = secondLargest(arr);
        System.out.println(secondMax);
    }
}
