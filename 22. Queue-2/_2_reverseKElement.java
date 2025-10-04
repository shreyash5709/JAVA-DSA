import java.util.*;
import java.util.Queue;

public class _2_reverseKElement {
    public static void main(String[] args) {
        Queue<Integer> qe = new LinkedList<>();
        qe.add(1);
        qe.add(2);
        qe.add(3);
        qe.add(4);
        qe.add(5);
        int k=3;
        System.out.println(qe);
        Stack<Integer> st = new Stack<>();
        for(int i=0; i<k; i++){
            st.push(qe.remove());
        }
        while(st.size()>0){
            qe.add(st.pop());
        }
        for(int i=0; i<qe.size()-k; i++){
            qe.add(qe.remove());
        }
        System.out.println(qe);
    }
}
