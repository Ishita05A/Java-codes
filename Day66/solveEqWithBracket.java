package Day66;

import java.util.Scanner;
import java.util.Stack;

public class solveEqWithBracket {
    static int solve(String str) {
        Stack<Integer> st = new Stack<>();
        Stack<Character> op = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int ascii = (int) ch;
            if (ascii >= 48 && ascii <= 57) {
                st.push(ch - '0');
            } else if (op.size() == 0 || ch == '(')
                op.push(ch);
            else if (ch == ')') {
                while (op.peek() != '(') {
                    int v2 = st.pop();
                    int v1 = st.pop();
                    if (op.peek() == '+')
                        st.push(v2
                                + v1);
                    if (op.peek() == '-')
                        st.push(v2 - v1);
                    if (op.peek() == '*')
                        st.push(v2 * v1);
                    if (op.peek() == '/')
                        st.push(v2 / v1);
                    op.pop();
                }
                op.pop();
            } else {
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
                } else if (ch == '*' || ch == '/') {
                    if (op.peek() == '*') {
                        int v2 = st.pop();
                        int v1 = st.pop();
                        st.push(v2 * v1);
                        op.pop();
                    } else if (op.peek() == '*') {
                        int v2 = st.pop();
                        int v1 = st.pop();
                        st.push(v2 * v1);
                        op.pop();
                    }
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
        System.out.println("Enter equation");
        String str = sc.nextLine();
        System.out.println(solve(str));
        sc.close();
    }

}
