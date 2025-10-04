import java.util.*;
public class _1_marks{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Student's marks : ");
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Student's roll num : ");
        for(int i=0; i<n; i++){
            if(arr[i]<35){
                System.out.print(i + " ");
            }
        }
        sc.close();
    }
}