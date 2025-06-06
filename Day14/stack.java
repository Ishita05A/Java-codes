package Day14;

import java.util.Scanner;
import java.util.Stack;

public class stack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        st.push(3);
        st.push(2);
        st.push(9);
        System.out.println(st);
        System.out.println(st.peek());
        System.out.println("Size of Stack is = " + st.size());
        st.pop();
        System.out.println(st);
        System.out.println("Size of stack = " + st.size());
        sc.close();
    }

}
