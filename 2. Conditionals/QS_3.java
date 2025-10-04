import java.util.Scanner;

public class QS_3 {
    public static void main(String[] args) {
        // QS-3  Design a Java program that calculates and prints whether a transaction results in a profit, loss, or break-even based on the cost price and selling price.

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter cost price = ");
        int cp = sc.nextInt();
        System.out.print("Ener selling price = ");
        int sp = sc.nextInt();
        if(cp == sp){
            System.out.print("No Profit No Loss !");
        }else if(cp<sp){
            System.out.print("Profit = "+ (sp-cp));
        }else{
            System.out.print("Loss = " + (cp-sp));
        }
        sc.close();

    }
}
