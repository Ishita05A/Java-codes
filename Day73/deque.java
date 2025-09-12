package Day73;

import java.util.LinkedList;
import java.util.*;
public class deque {
    public static void main(String[] args) {
        Deque<Integer> dq = new LinkedList<>();
        dq.push(5);
        dq.push(8);
        dq.add(7);
        dq.addLast(8);
        dq.addFirst(0);
        dq.removeFirstOccurrence(8);
        System.out.println(dq);
        System.out.println(dq.getFirst());
        System.out.println(dq.getLast());
    }
}
