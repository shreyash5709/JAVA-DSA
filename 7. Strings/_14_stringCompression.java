public class _14_stringCompression {
    public static void main(String[] args) {
        String s = "aaaabbbcccddeeeaa";
        char[] ch = s.toCharArray();
        StringBuilder ans = new StringBuilder();
        int i=0, j=0;
        while(j<ch.length){
            if(ch[i]==ch[j]) j++;
            else{
                ans.append(ch[i]);
                int len = j-i;
                if(len>1) ans.append(len); 
                i=j;
            }
        }
        ans.append(ch[i]);
        int len = j-i;
        if(len>1) ans.append(len);
        System.out.print(ans);
    }
}
