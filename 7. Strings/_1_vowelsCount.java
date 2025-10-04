import java.util.Scanner;

public class _1_vowelsCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String str = sc.nextLine();
        int n = str.length(), count = 0;
        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            if(isVowel(ch)==true){
                count++;
            }
        }
        System.out.print("Numbers of vowel in string = " + count);
        sc.close();
    }
    public static Boolean isVowel(char ch){
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U') return true;
        return false;
    }
}
