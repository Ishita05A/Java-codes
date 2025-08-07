package Day58;

import java.util.LinkedList;
import java.util.Queue;

public class implementStackUsingQueue {
    public static class Queue_st_imp{
        Queue<Integer> q = new LinkedList<>();

        int size = 0;
        void push(int val){
            q.add(val);
            size++;
        }
        int pop(){
            if(size == 0){
                System.out.println("Stack is Empty");
                return -1;
            }
            for(int i = 1; i<=size-1;i++){
                q.add(q.remove());
            }
            int x = q.remove();
            size--;
            return x;
        }
        boolean isEmpty(){
            if(size == 0) return true;
            return false;
        }
        int peek(){
            if(size == 0){
                System.out.println("Stack is Empty");
                return -1;
            }
            for(int i = 1; i<=size-1;i++){
                q.add(q.remove());
            }
            int x = q.remove();
            q.add(x);
            return x;
        }
        void display(){
        for(int i = 1;i<=q.size();i++){
            System.out.print(q.element()+" ");
            q.add(q.remove());
        }
        System.out.println();
    }   
       

    }
    public static void main(String[] args) {
        Queue_st_imp st = new Queue_st_imp();
        st.push(5);
        st.push(4);
        st.push(7);
        st.push(1);
        st.push(0);
        st.display();
        System.out.println(st.peek());
        System.out.println(st.pop());
        System.out.println(st.isEmpty());
        System.out.println(st.pop());
        st.display();
    }
}
