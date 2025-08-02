package Day56;

import java.util.LinkedList;
import java.util.Queue;

public class Display_Queue {
    static void displayQueue(Queue<Integer> q){
        Queue<Integer> helper = new LinkedList<>();
        while(q.size()>0){
            System.out.print(q.element()+" ");
            helper.add(q.remove());
        }
        while(helper.size()>0){
            q.add(helper.remove());
        }
        System.out.println();

    }
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(4);
        q.add(6);
        q.add(7);
        q.add(9);
        q.add(2);
        displayQueue(q);
    
    }
    
}
