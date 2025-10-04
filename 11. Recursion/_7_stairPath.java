import java.util.Scanner;
public class _7_stairPath {
    public static int stairPath(int n){ // TC = O(2^n)
        if(n==0) return n+1;
        if(n<=2) return n;
        return stairPath(n-1)+stairPath(n-2)+stairPath(n-3);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N : ");
        int n = sc.nextInt();
        System.out.println(stairPath(n));
        sc.close();
    }
}
