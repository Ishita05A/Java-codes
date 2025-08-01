import java.util.Scanner;
import java.util.Stack;

public class Min_Stack2 {
    public static class Min_Stack{
        Stack<Long> st = new Stack<>();
        long min = -1;
        void push(int val){
            long x = (long)val;
            if(st.isEmpty()){
                st.push(x);
                min = x;
            }
            else if(x>=min){
                 st.push(x);
            }
            else if(x<min){
                st.push(2*x-min);
                min = x;
            }
        }
        void pop(){
            if(st.size() == 0) return;
            else if(st.peek()>=min) st.pop();
            else if(st.peek()<min){
                long old = 2*min - st.peek();
                min = old;
                st.pop();
            }
        }
        int peek(){
            if(st.isEmpty()) return -1;
            long q = st.peek();
            if(st.peek() >= min) return (int)q;
            else return (int)min;
        }
        int getMin(){
            return (int)min;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Min_Stack st = new Min_Stack();
        st.push(7);
        st.push(8);
        st.push(5);
        st.push(6);
        st.push(3);
        st.push(4);
        st.pop();
        st.pop();
        System.out.println(st.getMin());
        System.out.println(st.peek());
        sc.close();


        
    }
    
}
