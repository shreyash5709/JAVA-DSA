import java.util.Scanner;
public class _3_1toN {
    public static void print(int n){ // TC = O(n)
        if(n==0) return;
        print(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N : ");
        int n = sc.nextInt();
        print(n);
        sc.close();
    }
}
