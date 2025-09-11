package Day72;

import java.util.Stack;

public class implementQueueUsingStack {
    public static class queue{
        Stack<Integer> st = new Stack<>();
        Stack<Integer> rt = new Stack<>();
        int size = 0;
        void push(int val){
            st.push(val);
            size++;
        }
        int remove(){
            if(size == 0){
                System.out.println("Queue is Empty");
                return -1;
            }
            while(st.size() !=1){
                rt.push(st.pop());
            }
            int ans = st.pop();
            size--;
            while(!rt.isEmpty()) st.push(rt.pop());
            return ans;
        }
        int peek(){
            if(size == 0){
                System.out.println("Queue is Empty");
                return -1;
            }
            while(st.size() !=1){
                rt.push(st.pop());
            }
            int ans = st.peek();
            while(!rt.isEmpty()) st.push(rt.pop());
            return ans;

        }
        void display(){
            while(!st.isEmpty()) rt.push(st.pop());
            while(!rt.isEmpty()){
                System.out.print(rt.peek()+" ");
                st.push(rt.pop());
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        queue q = new queue();
        q.push(5);
        q.push(7);
        q.push(9);
        q.push(4);
        q.display();
        System.out.println(q.peek());
        System.out.println(q.remove());
        System.out.println(q.size);
        q.display();    
    }
    
}
