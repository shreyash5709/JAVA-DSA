import java.util.Stack;

public class _4_evaluationOfPostfix {
    public static void main(String[] args) {
        String postfix = "95-34*6/+";
        Stack<Integer> val = new Stack<>();
        for(int i=0; i<postfix.length(); i++){
            char ch = postfix.charAt(i);
            int ascii = (int)ch;
            if(ascii >= 48 && ascii<=57){
                val.push(ascii-48);
            }
            else{
                int v2 = val.pop();
                int v1 = val.pop();
                if(ch=='-') val.push(v1-v2);
                if(ch=='+') val.push(v1+v2);
                if(ch=='*') val.push(v1*v2);
                if(ch=='/') val.push(v1/v2);
            }
        }
        System.out.println(val.peek());
    }
}
