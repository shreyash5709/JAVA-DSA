import java.util.*;

public class QS_1 {
    public static void main(String[] args) {
        // QS-1 Write a Java function that takes an integer as input and prints "Even" if the number is even and "Odd" if it's odd.

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the num : ");
        int n = sc.nextInt();
        if(n % 2 == 0){
            System.out.print("Even.");
        }else{
            System.out.print("Odd.");
        }
        sc.close();
    }
}
