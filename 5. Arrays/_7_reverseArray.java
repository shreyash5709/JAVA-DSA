public class _7_reverseArray {
    public static void main(String[] args) {
        int []arr = {10,20,30,40,50,60,70};
        int si=0,ei=arr.length-1;
        while (si<=ei){
            int temp = arr[si];
            arr[si]=arr[ei];
            arr[ei]=temp;
            si++;
            ei--;
        }
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
