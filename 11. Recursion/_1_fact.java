import java.util.Scanner;

public class _1_fact {
    public static int returnFact(int n){ // TC = O(n)
        if(n==0 || n==1) return 1;
        int ans = n*returnFact(n-1);
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N : ");
        int n = sc.nextInt();
        int fact = returnFact(n);
        System.out.println(fact);
        sc.close();
    }
}
