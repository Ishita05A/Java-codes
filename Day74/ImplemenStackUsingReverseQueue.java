

import java.util.*;

public class ImplemenStackUsingReverseQueue {
    public static class Stack {
        Queue<Integer> q = new LinkedList<>();
        int size = 0;

        void push(int val) {
            if (size == 0){
                 q.add(val);
                size++;
            }
            else {
                q.add(val);
                for (int i = 0; i < size - 1; i++) {
                    q.add(q.remove());
                }
                size++;
            }
        }

        int pop() {
            if (size == 0)
                return -1;
            int val = q.remove();
            size--;
            return val;
        }

        int peek() {
            if (size == 0)
                return -1;
            int val = q.element();
            return val;
        }

        void display() {
            if (size == 0) {
                System.out.print("Stack is Empty");
                return;
            }
            for (int i = 0; i < size; i++) {
                q.add(q.remove());
            }
            for (int i = 0; i < size; i++) {
                System.out.print(q.element() + " ");
                q.add(q.remove());
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Stack st = new Stack();
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
