public class _12_mostOccurinChar {
    public static void main(String[] args) {
        String s = "shreyashjaiswal";
        int[] arr = new int[26];
        int n = s.length();
        for(int i=0; i<n; i++){
            char ch = s.charAt(i);
            int idx = (int)ch - 97;
            arr[idx]++;
        }
        int max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            max = Integer.max(max, arr[i]);
        }
        for(int i=0; i<26; i++){
            if(max == arr[i]){
                char ch = (char)(i+97);
                System.out.print(ch + " ");
            }
        }
    }
}
