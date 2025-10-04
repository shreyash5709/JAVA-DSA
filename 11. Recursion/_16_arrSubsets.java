import java.util.*;

public class _16_arrSubsets {
    static ArrayList<List<Integer>> all = new ArrayList<>();
    public static void printSubset(int[] arr, ArrayList<Integer> ans, int i){
        if(i==arr.length){ // TC = O(n*2^n)
            all.add(new ArrayList<>(ans));
            return;
        }
        printSubset(arr, ans, i+1); // not add element
        ans.add(arr[i]);
        printSubset(arr, ans, i+1); // add element
        ans.remove(ans.size()-1);
    }
    public static void main(String[] args) {
        all = new ArrayList<>();
        int[] arr = {1,2,3};
        ArrayList<Integer> ans = new ArrayList<>();
        printSubset(arr, ans, 0);
        System.out.print(all);
    }
}
