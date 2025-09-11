package Day72;
import java.util.*;
import java.util.Queue;


public class queueBasic {
    static void display(Queue<Integer> q){
        int n = q.size();
        while(n>0){
            int val = q.remove();
            System.out.print(val+" ");
            q.add(val);
            n--;
        }
    }
    public static void main(String[] args) {
        
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        System.out.println(q);
        display(q);

        
    }
    
}
