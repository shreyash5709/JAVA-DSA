public class _4_QS {
    public static void printDuplicate(int[] arr){
        int n = arr.length;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(arr[i]==arr[j]){
                    System.out.print(arr[i] + " ");
                    break;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {4,7,2,9,1,5,7,2,8,1,5};
        printDuplicate(arr);
    }
}
