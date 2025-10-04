import java.util.Scanner;

public class _21_generateParentheses {
    public static void printParentheses(int open, int close, String s, int n){
        if(s.length()==2*n){
            System.out.println(s);
            return;
        }
        if(open<n) printParentheses(open+1, close, s+'(', n);
        if(open > close) printParentheses(open, close+1, s+')', n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        printParentheses(0, 0, "", n);
        sc.close();
    }
}
