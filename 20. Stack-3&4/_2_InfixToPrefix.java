import java.util.Stack;

public class _2_InfixToPrefix{
    public static void main(String[] args) {
        String infix = "9-5+3*4/6"; // +-95/*346
        System.out.println("Infix : " + infix);
        Stack<String> val = new Stack<>();
        Stack<Character> op = new Stack<>();
        for(int i=0; i<infix.length(); i++){
            char ch = infix.charAt(i);
            int ascii = (int)ch;
            if(ascii >= 48 && ascii<=57){
                String s = "" + ch;
                val.push(s);
            }
            else if(op.size()==0 || ch=='(' || op.peek()=='(') op.push(ch);
            else if(ch==')'){
                while(op.peek()!='('){
                    // work
                    String v2 = val.pop();
                    String v1 = val.pop();
                    char o = op.pop();
                    String s = o + v1 + v2;
                    val.push(s);
                }
                op.pop(); // '(' hta diya
            }
            else{
                if(ch=='-' || ch=='+'){
                    // work
                    String v2 = val.pop();
                    String v1 = val.pop();
                    char o = op.pop();
                    String s = o + v1 + v2;
                    val.push(s);
                    // push
                    op.push(ch);
                }
                else{
                    if(op.peek()=='*' || op.peek()=='/'){
                        // work
                        String v2 = val.pop();
                        String v1 = val.pop();
                        char o = op.pop();
                        String s = o + v1 + v2;
                        val.push(s);
                        // push
                        op.push(ch);
                    }
                    else op.push(ch);
                }
            }
        }
        while(val.size()>1){
            // work
            String v2 = val.pop();
            String v1 = val.pop();
            char o = op.pop();
            String s = o + v1 + v2;
            val.push(s);
        }
        String prefix = val.pop();
        System.out.println("Prefix : " + prefix);
    }
}
