import java.util.Scanner;
public class _2_Nto1 { // TC = O(n)
    public static void print(int n){
        if(n==0) return;
        System.out.println(n);
        print(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N : ");
        int n = sc.nextInt();
        print(n);
        sc.close();
    }
}
