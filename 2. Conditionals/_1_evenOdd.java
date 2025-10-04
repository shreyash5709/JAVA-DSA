import java.util.*;
public class _1_evenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a num : ");
        int a = sc.nextInt();
        if(a % 2 == 0){
            System.out.print("Even.");
        }else{
            System.out.print("Odd.");
        }

        sc.close();
    }
}
