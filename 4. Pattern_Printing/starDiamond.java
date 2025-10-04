import java.util.Scanner;

public class starDiamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.print("Enter the num : ");
            int n = sc.nextInt();
            int nst=1;
            int nsp=n-1;
            for(int i=1; i<=n; i++){
                for(int j=1; j<=nsp; j++){
                    System.out.print(" "+" ");
                }
                for(int j=1; j<=nst; j++){
                    System.out.print("*"+" ");
                }
                nst+=2;
                nsp--;
                System.out.println();
            }
            nst=nst-4;
            nsp=1;
            for(int i=1; i<=n-1; i++){
                for(int j=1; j<=nsp; j++){
                    System.out.print(" "+" ");
                }
                for(int j=1; j<=nst; j++){
                    System.out.print("*"+" ");
                }
                nst-=2;
                nsp++;
                System.out.println();
            }
            sc.close();
    }
}
