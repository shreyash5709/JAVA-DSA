import java.util.Scanner;

public class QS_3 {
    public static int findTarget(int[] arr, int i, int target){
        if(i==arr.length) return -1;
        if(arr[i]==target) return i;
        return findTarget(arr, i+1, target);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a target : ");
        int target = sc.nextInt();
        int idx = findTarget(arr, 0, target);
        System.out.print("Target " + target + " is at index : " + idx);
        sc.close();
    }
}
