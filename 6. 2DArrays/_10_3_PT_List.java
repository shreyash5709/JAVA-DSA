import java.util.ArrayList;
import java.util.List;

public class _10_3_PT_List {
    public static List<List<Integer>> generate(int n){
        List<List<Integer>> ans = new ArrayList <>(n);
        for(int i=0; i<n; i++){
            List<Integer> l = new ArrayList <>();
            long val = 1;
            l.add(1);
            for(int j=1; j<=i; j++){
                val = val*(i-j+1)/j;
                l.add((int)val);
            }
            ans.add(l);
        }
        return ans;
    }
    public static void main(String[] args) {
        int n = 5;
        List<List<Integer>> ans = generate(n);
        for(int i=0; i<ans.size(); i++){
            List<Integer> x = ans.get(i);
            for (int j = 0; j < x.size(); j++) {
                System.out.print(x.get(j) + " ");
            }
            System.out.println();
        }
    }
}
