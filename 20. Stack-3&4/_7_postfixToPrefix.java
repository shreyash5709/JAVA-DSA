import java.util.Stack;

public class _7_postfixToPrefix {
    public static void main(String[] args) {
        String postfix = "95-34*6/+"; //+-95/*346
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
                // String s = o + v1 + v2;
                // value.push(s);
                value.push(ch+v1+v2);
            }
        }
        System.out.println(value.peek());
    }
}
