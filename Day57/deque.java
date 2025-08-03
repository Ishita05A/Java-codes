package Day57;

import java.util.LinkedList;

import java.util.Deque;

public class deque {
    public static void main(String[] args) {
        Deque<Integer> q = new LinkedList<>();
        q.add(3);
        q.addFirst(8);
        q.addLast(5);
        q.add(6);
        q.remove();
        
        q.add(5);
         q.removeLast();
        q.add(4);
        q.add(4);
        q.add(4);
        q.add(4);
        q.removeFirstOccurrence(5);
        // q.removeLastOccurrence(5);
        System.out.println(q);
        
    }
    
}
