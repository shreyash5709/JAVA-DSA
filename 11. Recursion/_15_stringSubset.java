public class _15_stringSubset {
    public static void printSubset(String s, String ans, int i){
        if(i==s.length()){ // TC = O(n*2^n)
            System.out.println(ans);
            return;
        }
        char ch = s.charAt(i);
        printSubset(s, ans, i+1); // not add ch
        printSubset(s, ans+ch, i+1); // add ch
    }
    public static void main(String[] args) {
        String s = "abc";
        printSubset(s, " ", 0);
    }
}
