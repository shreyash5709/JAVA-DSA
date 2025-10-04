import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _17_print1ToNSubsets {
    static ArrayList<List<Integer>> all = new ArrayList<>();
    public static void printSubset(int n, int k, ArrayList<Integer> ans, int i){
        if(ans.size()==k){
            all.add(new ArrayList<>(ans));
            return;
        }
        if(i>n) return;

        printSubset(n, k, ans, i+1);
        ans.add(i);
        printSubset(n, k, ans, i+1);
        ans.remove(ans.size()-1);
    }
    public static void main(String[] args) {
        all = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        System.out.print("Enter k : ");
        int k = sc.nextInt();
        if (k > n || k <= 0) {
            System.out.println("Invalid input: k must be between 1 and n");
            sc.close();
            return;
        }

        printSubset(n, k, new ArrayList<>(), 1);
        System.out.print(all + "\n");

        sc.close();
    }
}
