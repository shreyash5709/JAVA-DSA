import java.util.Scanner;

public class QS_2 {
    public static void main(String[] args) {
        // QS-2  Create a Java method to find and print the absolute value of an integer without using the built-in Math.abs() function.

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the num ; ");
        int n = sc.nextInt();
        if(n<0){
            System.out.print("Absolute value of " + n + " = " + -n);
        }else{
            System.out.print("Absolute value of " + n + " = " + n);
        }
        sc.close();
    }
}
