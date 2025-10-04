import java.util.Scanner;

public class _19_HCF {
    public static int printHCF(int a, int b){ // TC = O(min(a,b))
        int min = Math.min(a, b);
        for (int i = min; i >= 1; i--) {
            if(a%i==0 && b%i==0) return i;
        }
        return 1;
    }
    public static int printGCD(int a, int b){
        if(b%a==0) return a;
        return printGCD(b%a, a);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a : ");
        int a = sc.nextInt();
        System.out.print("Enter b : ");
        int b = sc.nextInt();
        System.out.println(printGCD(a, b));

        sc.close();
    }
}
