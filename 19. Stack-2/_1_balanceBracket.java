import java.util.Scanner;
import java.util.Stack;

class _1_balanceBracket{
    public static boolean isBalanced(String str){
            Stack<Character> st = new Stack<>();
            int n = str.length();
            for(int i=0; i<n; i++){
                char ch = str.charAt(i);
                if(ch=='('){
                    st.push(ch);
                }
                else{
                    if(st.isEmpty()) return false;
                    if(st.peek()=='(') st.pop();
                }
            }
            if(st.isEmpty()) return true;
            return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the brackets : ");
        String str = sc.nextLine();
        System.out.println(isBalanced(str));
        sc.close();
    }
}