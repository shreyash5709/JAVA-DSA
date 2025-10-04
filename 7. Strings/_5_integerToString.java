import java.util.Scanner;

public class _5_integerToString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        String s = "Amit" + n;
        System.out.println(s);

        
        int m = sc.nextInt();
        String str = Integer.toString(m);
        System.out.println("Total numbers of digits into the numbers = "+ str.length());
        sc.close();
    }
}
