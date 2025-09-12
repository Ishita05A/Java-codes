package Day73;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class reverseKElementOFQueue {
    static Queue<Integer> reverse_K(Queue<Integer> q,int k){
        Stack<Integer> st = new Stack<>();
        int n = q.size();
        for(int i = 0; i<k;i++){
            st.push(q.remove());
        }
        for(int i = 0; i<k;i++){
            q.add(st.pop());
        }
        for(int i = 0;i<n-k;i++){
            q.add(q.remove());
        }
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
        q = reverse_K(q, 3);
        System.out.println(q);
    }
    
}
