import java.util.Stack;

public class _9_postfixTOInfix {
    public static void main(String[] args) {
        String postfix = "95-34*6/+"; // 5-9+3*4/6
        Stack<String> value = new Stack<>();
        for(int i=0; i<postfix.length(); i++){
            char ch = postfix.charAt(i);
            int ascii = (int)ch;
            if(ascii >= 48 && ascii<=57){
                // String s = "" + ch;
                // value.push(s);
                value.push(ch+"");
            }
            else{
                String v2 = value.pop();
                String v1 = value.pop();
                // String o = "" + ch;
                // String s = '(' + v1 + o + v2 + ')';
                // value.push(s);
                value.push('(' + v1 + ch + v2 + ')');
            }
        }
        System.out.println(value.peek());
    }
}
