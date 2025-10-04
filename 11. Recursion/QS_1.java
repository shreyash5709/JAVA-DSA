import java.util.Scanner;

public class QS_1 {
    public static int printSum(int a, int b){
        if(a>b) return 0;
        if(a%2!=0) return a + printSum(a+1, b);
        return printSum(a+1, b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a : ");
        int a = sc.nextInt();
        System.out.print("Enter b : ");
        int b = sc.nextInt();
        if(a<b) System.out.print(printSum(a, b));
        else System.out.println("Enter vailid limits!");

        sc.close();
    }
}
