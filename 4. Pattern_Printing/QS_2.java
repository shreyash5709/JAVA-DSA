import java.util.Scanner;

public class QS_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the num : ");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1;j<=n-i; j++){
                System.out.print(" " + " ");
            }
            for(int j=1; j<=2*n-1;j++){
                if(j==1 || j==2*i-1){
                    System.out.print("*" + " ");
                }else{
                    System.out.print(" " + " ");
                }
            }
            System.out.println();
        }
        for(int i=n-1; i>=1; i--){
            for(int j=1; j<=n-i; j++){
                System.out.print(" " + " ");
            }
            for(int j=1; j<=2*i-1;j++){
                if(j==1 ||j==2*i-1 ){
                    System.out.print("*" + " ");
                }else{
                    System.out.print(" " + " ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
