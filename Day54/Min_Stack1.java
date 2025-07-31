import java.util.Scanner;
import java.util.Stack;

public class Min_Stack1 {
    public static class Min_Stack{
        Stack<Integer> st = new Stack<>();
        Stack<Integer> min = new Stack<>();
        void push(int val){
            if(st.size() == 0){
                st.push(val);
                min.push(val);
            }
            else{
                if(val < min.peek()) min.push(val);
                else min.push(min.peek());
                st.push(val);
            }
        }
        void pop(){
            st.pop();
            min.pop();
        }
        int peek(){
            return st.peek();
        }
        int getMin(){
            return min.peek();
        }
    }
    
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        Min_Stack st = new Min_Stack();
        st.push(8);
        st.push(4);
        st.push(7);
        st.push(2);
        System.out.println(st.getMin());
        st.pop();
        st.pop();
        System.out.println(st.getMin());
        sc.close();
    }
    
}
