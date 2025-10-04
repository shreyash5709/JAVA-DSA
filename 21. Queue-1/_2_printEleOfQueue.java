import java.util.*;
import java.util.Queue;
public class _2_printEleOfQueue {
    public static void main(String[] args) {
        Queue<Integer> qe = new LinkedList<>();
        qe.add(1);
        qe.add(2);
        qe.add(3);
        qe.add(4);
        qe.add(5);
        int n = qe.size();
        for(int i=0; i<n; i++){
            int ele = qe.remove();
            System.out.print(ele + " ");
            qe.add(ele);
        }
        System.out.println(qe);
    }
}