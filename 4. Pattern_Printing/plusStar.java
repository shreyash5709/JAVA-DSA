import java.util.Scanner;

public class plusStar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the num : ");
        int n = sc.nextInt();
        int mid = n/2 + 1;
        if(n%2!=0){
            for(int i=1; i<=n; i++){
                for(int j=1; j<=n; j++){
                    if(i==mid || j==mid){
                        System.out.print("*" + " ");
                    }else{
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }
        }else{
            System.out.println("Enter odd num.");
        }
        sc.close();
    }
}
