import java.util.Scanner;

public class _6_updateString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String str = sc.nextLine();
        int n = str.length();
        String s = "";
        for(int i=0; i<n; i++){
            if(i%2==0) s += 'a'; 
            else s += str.charAt(i);
        }
        System.out.print(s);
        sc.close();
    }
}
