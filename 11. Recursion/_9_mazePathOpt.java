import java.util.Scanner;
public class _9_mazePathOpt {
    public static int mazePath(int m, int n){ // TC = O(2^(n+m))
        if(m==1 || n==1) return 1;
        int rightWays = mazePath(m, n-1);
        int downWays = mazePath(m-1, n);
        return rightWays+downWays;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter m : ");
        int m = sc.nextInt();
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        System.out.println(mazePath(m, n));

        sc.close();
    }
}
