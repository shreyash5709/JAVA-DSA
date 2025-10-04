import java.util.Stack;

public class _6_prefixToPostfix {
    public static void main(String[] args) {
        String prefix = "+-95/*346"; // 95-34*6/+
        Stack<String> value = new Stack<>();
        for(int i=prefix.length()-1; i>=0; i--){
            char ch = prefix.charAt(i);
            int ascii = (int)ch;
            if(ascii >= 48 && ascii<=57){
                String s = "" + ch;
                value.push(s);
            }
            else{
                String v1 = value.pop();
                String v2 = value.pop();
                String s = v1 + v2 + ch;
                value.push(s);
            }
        }
        System.out.println(value.peek());
    }    
}
