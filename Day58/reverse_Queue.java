package Day58;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class reverse_Queue {
    static void reverseQueue(Queue<Integer> q){
        Stack<Integer> st = new Stack<>();
        while(q.size()!=0){
            st.push(q.remove());
        }
        while(st.size()!=0){
            q.add(st.pop());
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
        reverseQueue(q);
        System.out.println();
        System.out.println("Reversed Queue");
        System.out.print(q+" ");
    }
    
    
}
