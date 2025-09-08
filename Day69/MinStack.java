package Day69;
import java.util.Stack;

public class MinStack {
    public static class Minstack{
        Stack<Integer> st = new Stack<>();
        int size = 0;
        int min = Integer.MIN_VALUE;
        void push(int val){
            if(size == 0){
                st.push(val);
                min = val;
            }
            else if(val < min){
                st.push(val-min);
                min = val;
            }
            else{
                st.push(val);
            }
            size++;
        }
        void pop(){
            if(size == 0) return;
            else{
                if(st.peek() < min){
                    min = min-st.peek();
                    st.pop();
                }
                else{
                    st.pop();
                }
            }
            size--;
        }
        int peek(){
            if(size == 0){
                System.out.println("Stack is Empty");
                return -1;
            }
            if(st.peek() >= min) return st.peek();
            else{
                return min-st.peek();
            }

        }

    }
    public static void main(String[] args) {
        Minstack s = new Minstack();
        s.push(4);
        s.push(5);
        System.out.println(s.min);
        s.push(3);
        s.push(5);
        System.out.println(s.min);
        s.pop();
        s.pop();
        System.out.println(s.min);

    }
    
}
