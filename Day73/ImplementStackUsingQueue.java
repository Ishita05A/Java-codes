package Day73;

import java.util.LinkedList;
import java.util.Queue;

public class ImplementStackUsingQueue {
    public static class stack{
        Queue<Integer> q = new LinkedList<>();
        int size = 0;
        void push(int val){
            q.add(val);
            size++;
        }
        int pop(){
            if(size == 0){
                System.out.println("Stack is Empty ");
                return -1;
            }
            for(int i = 0;i<q.size()-1;i++){
                q.add(q.remove());
            }
            int val = q.remove();
            size--;
            return val;
        }
        int peek(){
            if(size == 0){
                System.out.println("Stack is Empty");
                return -1;
            }
            for(int i = 0;i<q.size()-1;i++){
                q.add(q.remove());
            }
            int val = q.remove();
            q.add(val);
            return val;
        }
        void display(){
            for(int i = 0;i<q.size();i++){
                System.out.print(q.element()+" ");
                q.add(q.remove());
            }
            System.out.println();
        }


    }
    public static void main(String[] args) {
        stack st = new stack();
        st.push(5);
        st.push(7);
        st.push(8);
        st.push(3);
        st.push(1);
        System.out.println(st.peek());
        st.display();
        System.out.println(st.pop());
        System.out.println(st.peek());
        st.display();
    }
    
}
