import java.util.Scanner;
import java.util.Stack;

public class _2_minNumberBracketToRemove {
    public static int minBracketRemove(String str){
            Stack<Character> st = new Stack<>();
            int n = str.length();
            for(int i=0; i<n; i++){
                char ch = str.charAt(i);
                if(ch=='(') st.push(ch);
                else{
                    if(!st.isEmpty() && st.peek()=='(') st.pop();
                    else st.push(ch);
                }
            }
            return st.size();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the brackets : ");
        String str = sc.nextLine();
        System.out.println(minBracketRemove(str));
        sc.close();
    }
}
