import java.util.*;
public class _4_profitLoss {
    public static void main(String[] args) {
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
