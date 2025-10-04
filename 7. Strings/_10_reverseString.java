import java.util.Scanner;

public class _10_reverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String str = sc.nextLine();
        StringBuilder sb = new StringBuilder(str);
        int n = sb.length();
        int i=0, j=n-1;
        while(i<=j){
            char temp = sb.charAt(i);
            sb.setCharAt(i, sb.charAt(j));
            sb.setCharAt(j, temp);
            i++; j--;
        }
        System.out.print(sb);
        sc.close();
    }
}
