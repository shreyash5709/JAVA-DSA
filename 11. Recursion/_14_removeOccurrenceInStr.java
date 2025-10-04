public class _14_removeOccurrenceInStr {
    public static void skip(String s, int n){ // TC = O(n)
        
        if(n<0){
            return;
        }

        skip(s, n-1);
        
        if(s.charAt(n)!='a'){
            System.out.print(s.charAt(n) + " ");
        }
    }
    public static void main(String[] args) {
        String s = "Shreyash_Jaiswal";
        int n = s.length()-1;
        skip(s, n);
    }
}
