package Day73;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseQueue {
    static Queue<Integer> reverse(Queue<Integer> q) {
        Stack<Integer> st = new Stack<>();
        while (!q.isEmpty()) {
            st.push(q.remove());
        }
        while (!st.isEmpty())
            q.add(st.pop());
        return q;
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(8);
        q.add(9);
        q.add(0);
        q.add(3);
        q.add(5);
        System.out.println(q);
        q = reverse(q);
        System.out.println(q);
    }

}
