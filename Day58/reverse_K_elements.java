package Day58;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class reverse_K_elements {
    static void reverseKElements(Queue<Integer> q,int k ){
        int n = q.size();
        Stack<Integer> st = new Stack<>();
        for(int i = 1;i<=k;i++){
            st.push(q.remove());
        }
        for(int i = 1; i<=k;i++){
            q.add(st.pop());
        }

        for(int i = 1; i<=n-k;i++){
            q.add(q.remove());
        }
    }
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println("Original Queue");
        System.out.print(q+" ");
        System.out.println();
        System.out.println("Reversed Queue K times");
        reverseKElements(q, 3);
        System.out.print(q+" ");

    }
    
}
