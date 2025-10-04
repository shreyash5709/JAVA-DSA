import java.util.Scanner;

public class _3_linearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter the elements : ");
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Value to find in array : ");
        int x = sc.nextInt();
        for(int i=0; i<n; i++){
            if(arr[i]==x){
                System.out.print("Value " + x + "is find at idx " + i);
                break;
            }else{
                System.out.print("Value not found in array.");
            }
        }
        sc.close();
    }
}
