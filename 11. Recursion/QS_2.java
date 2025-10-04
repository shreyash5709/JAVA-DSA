import java.util.Scanner;

public class QS_2 {
    public static boolean isPowerOfTwo(int a){
        if(a<=0) return false;
        if(a==1) return true;
        if(a%2!=0) return false;
        return isPowerOfTwo(a/2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a : ");
        int a = sc.nextInt();
        System.out.println(a + " is power of 2 = " + isPowerOfTwo(a));
        sc.close();
    }
}
