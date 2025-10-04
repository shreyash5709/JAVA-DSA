import java.util.*;
import java.util.Queue;
public class _1_reverseQueue {
    public static void main(String[] args) {
        Queue<Integer> qe = new LinkedList<>();
        qe.add(1);
        qe.add(2);
        qe.add(3);
        qe.add(4);
        qe.add(5);
        System.out.println(qe);
        Stack<Integer> st = new Stack<>();
        while(qe.size()>0){
            st.push(qe.remove());
        }
        System.out.println(qe);
        System.out.println(st);
        while(st.size()>0){
            qe.add(st.pop());
        }
        System.out.println(qe);
        System.out.println(st);
    }
}
