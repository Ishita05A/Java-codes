package Day47;

import java.util.Scanner;
import java.util.Stack;

public class reverse_recursively {
    static void pushAtBottom(Stack<Integer> st, int x) {
        if (st.size() == 0) {
            st.push(x);
            return;
        }

        int top = st.pop();
        pushAtBottom(st, x);
        st.push(top);
    }

    static void reverse(Stack<Integer> st) {
        if (st.size() == 0)
            return;
        int top = st.pop();
        reverse(st);
        pushAtBottom(st, top);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        System.out.println("Enter elements");
        int n = sc.nextInt();
        System.out.println("Enter elements");
        for (int i = 0; i < n; i++) {
            st.push(sc.nextInt());
        }
        reverse(st);
        System.out.println(st);
        sc.close();

    }

}
