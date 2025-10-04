class _1_checkIsSorted{
    public static boolean isSorted(int[] arr){
        int n=arr.length;
        int i=0;
        while(i<n-1){
            if(arr[i]>arr[i+1]) return false;
            i++;
        }
        return true;
    }
    public static void main(String[] args) {
        int [] arr = {1,2,4,5,9,12};
        boolean sorted = isSorted(arr);
        if(sorted == true)System.out.print("Given array is sorted.");
        else System.out.print("Given array is not sorted.");
    }
}