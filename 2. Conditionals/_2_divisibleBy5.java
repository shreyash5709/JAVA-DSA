import java.util.*;

public class _2_divisibleBy5 {
    public static void main (String arg []){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        if(n%5==0){
            System.out.print(n +" is divisible by 5.");
        }else{
            System.out.print("N is not divisible by 5.");
        }
        sc.close();
    }
}