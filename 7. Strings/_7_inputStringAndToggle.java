import java.util.Scanner;

public class _7_inputStringAndToggle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String str = sc.nextLine();
        StringBuilder sb = new StringBuilder(str);
        int n = sb.length();
        for(int i=0; i<n; i++){
            int a = (int)(sb.charAt(i));
            if(a>=65 && a<=90){
                sb.setCharAt(i, (char)(a+32));
            }
            else if(a>=97 && a<=122){
                sb.setCharAt(i, (char)(a-32));
            }
        }
        System.out.println(sb);
        sc.close();
    }
}
