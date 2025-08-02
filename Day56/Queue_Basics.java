package Day56;
import java.util.LinkedList;
import java.util.Queue;
public class Queue_Basics {
    public static void main(String[] args) {

        Queue<Integer> q = new LinkedList<>();
        q.add(5);
        q.add(6);
        q.add(8);
        q.add(9);
        System.out.println(q);
       System.out.println( q.remove());
       System.out.println(q.remove());
       System.out.println(q.peek());
       System.out.println(q);
       System.out.println(q.size());
       System.out.println(q.isEmpty());
       System.out.println(q.element());





    }
    
}
