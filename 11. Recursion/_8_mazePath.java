import java.util.Scanner;
public class _8_mazePath {
    public static int mazePath(int row, int col, int m, int n){ // TC = O(2^(n+m))
        if(row==m || col==n) return 1;
        // if(row==m && col==n) return 1;
        // if(row>m || col>n) return 0;
        int rightWays = mazePath(row, col+1, m, n);
        int downWays = mazePath(row+1, col, m, n);
        return rightWays+downWays;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter m : ");
        int m = sc.nextInt();
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        System.out.println(mazePath(1, 1, m, n));

        sc.close();
    }
}
