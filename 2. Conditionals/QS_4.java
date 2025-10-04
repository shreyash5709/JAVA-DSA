import java.util.Scanner;

public class QS_4 {
    public static void main(String[] args) {
        // QS-4 Implement a Java function to determine if a given year is a leap year or not. Print "Leap Year" if true,otherwise print "Not a Leap Year."

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the year : ");
        int n = sc.nextInt();
        if (n % 4 == 0 && n % 100 != 0 || n % 400 ==0) {
            System.out.print("Year " + n + " is a leap year.");
        }else{
            System.out.print("Year " + n + " is not a leap year.");
        }
        sc.close();
    }
}
