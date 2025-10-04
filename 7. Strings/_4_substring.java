import java.util.Scanner;
public class _4_substring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String str = sc.nextLine();
        int n = str.length();
        for(int i=0; i<n; i++){
            for(int j=i+1; j<=n; j++){
                System.out.print(str.substring(i, j) + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
