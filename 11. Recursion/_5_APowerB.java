import java.util.*;
public class _5_APowerB { // T.C = O(logn);
    public static int aPowerB(int x, int n){
        if(n==0) return 1;
        int ans = aPowerB(x, n/2);
        if(n%2==0) return ans*ans;
        return ans*ans*x;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x : ");
        int x = sc.nextInt();
        System.out.print("Enter n : ");
        int n = sc.nextInt();

        if(x==0 && n==0){
            System.out.println("Please enter valid values !");
        }
        else{
            int ans = aPowerB(x, n);
            System.out.print(x + " raised to the power " + n + " = " + ans);
        }
        sc.close();
    }
}
