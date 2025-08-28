package Day61;

import java.util.Scanner;
import java.util.Stack;

public class infix {
    static int infix_operation(String str) {
        Stack<Integer> st = new Stack<>();
        Stack<Character> op = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int ascii = (int) ch;
            if (ascii >= 48 && ascii <= 57) {
                st.push(ascii - 48);

            } else if (op.size() == 0)
                op.push(ch);
            else {
                if (ch == '+' || ch == '-') {
                    int v2 = st.pop();
                    int v1 = st.pop();
                    if (op.peek() == '+')
                        st.push(v1 + v2);
                    if (op.peek() == '-')
                        st.push(v1 - v2);
                    if (op.peek() == '*')
                        st.push(v1 * v2);
                    if (op.peek() == '/')
                        st.push(v1 / v2);
                    op.pop();
                    op.push(ch);
                }

                else if (ch == '*' || ch == '/') {
                    if (op.peek() == '*' || op.peek() == '/') {
                        int v2 = st.pop();
                        int v1 = st.pop();
                        if (op.peek() == '*')
                            st.push(v1 * v2);
                        if (op.peek() == '/')
                            st.push(v1 / v2);
                        op.pop();
                        op.push(ch);

                    } else
                        op.push(ch);

                }

            }
            

        }
        while (st.size() > 1) {
                int v2 = st.pop();
                int v1 = st.pop();
                
                if (op.peek() == '+')
                    st.push(v1 + v2);
                if (op.peek() == '-')
                    st.push(v1 - v2);
                if (op.peek() == '*')
                    st.push(v1 * v2);
                if (op.peek() == '/')
                    st.push(v1 / v2);
                op.pop();
            }

        return st.peek();

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter expression");
        String str = sc.nextLine();
        int val = infix_operation(str);
        System.out.println(val);
        sc.close();

    }
}
