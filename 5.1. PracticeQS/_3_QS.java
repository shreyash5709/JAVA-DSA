public class _3_QS {
    private static int findMinValue(int[] arr){
        int n=arr.length;
        int minValue = Integer.MAX_VALUE;
        for(int i=0; i<n; i++){
            minValue = Math.min(minValue, arr[i]);
        }
        return minValue;
    }
    public static void main(String[] args) {
        int[] arr = {10,50,50,61,5,4,9,10,3};
        int minValue = findMinValue(arr);
        System.out.println("Minimum value in the array : "+ minValue);
    }
}
