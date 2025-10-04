import java.util.Scanner;

public class _20_binaryString {
    public static void printBinaryString(String s, int n){
        int m = s.length();
        if(m==n){
            System.out.print(s + " ");
            return;
        }
        if(m==0 || s.charAt(m-1)=='0'){
            printBinaryString(s+0, n);
            printBinaryString(s+1, n);
        }
        else printBinaryString(s+0, n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        printBinaryString("", n);
        sc.close();
    }
}
