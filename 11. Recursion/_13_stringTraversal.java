public class _13_stringTraversal {
    public static void print(String s, int n){ // TC = O(n)
        if(n<0) return;
        print(s, n-1);
        System.out.print(s.charAt(n) + " ");
    }
    public static void main(String[] args) {
        String s = "Shreyash_Jaiswal";
        int n = s.length()-1;
        print(s, n);
    }
}
