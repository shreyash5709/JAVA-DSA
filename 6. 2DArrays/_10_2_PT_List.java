import java.util.ArrayList;
import java.util.List;

public class _10_2_PT_List {
    public static List<List<Integer>> generate(int n){
        List<List<Integer>> ans = new ArrayList <>(n);
        for(int i=0; i<n; i++){
            List<Integer> l = new ArrayList <>();
            for(int j=0; j<=i; j++){
                if(j==0 || j==i) l.add(1);
                else l.add(ans.get(i-1).get(j) + ans.get(i-1).get(j-1));
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
