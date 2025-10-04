import java.util.Scanner;

public class _4_sum1toN {
    public static int sum(int n){ // TC = O(n)
        if(n==0 || n==1) return n;
        int sum = 0;
        sum += n + sum(n-1);
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N : ");
        int n = sc.nextInt();
        int sum = sum(n);
        System.out.print("Sum of 1 to " + n + " = " + sum);
        sc.close();
    }
}
