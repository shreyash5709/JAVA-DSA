import java.util.Scanner;
public class _6_fibonacci {
    public static int findFibonacci(int n){ // TC = O(2^n)
        if(n<=1) return n;
        int fibo = findFibonacci(n-1)+findFibonacci(n-2);
        return fibo;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N : ");
        int n = sc.nextInt();
        System.out.println(findFibonacci(n));
        sc.close();
    }
}
