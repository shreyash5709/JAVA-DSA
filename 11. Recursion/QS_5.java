import java.util.*;

public class QS_5 {
    public static void printArraySum(int[] arr){
        int n = arr.length;
        if(n==1){
            System.out.println(Arrays.toString(arr));
            return;
        }
        System.out.println(Arrays.toString(arr));
        int[] temp = new int[n-1];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = arr[i]+arr[i+1];
        }
        printArraySum(temp);
    }
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        printArraySum(arr);
    }
}