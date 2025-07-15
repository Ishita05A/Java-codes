package Day47;

import java.util.Scanner;
import java.util.Stack;

public class InsertAtBottom {
    static void insert_at_bottom(Stack<Integer> st, int x) {
        Stack<Integer> rt = new Stack<>();
        while (st.size() > 1) {
            rt.push(st.pop());
        }
        st.push(x);
        while (rt.size() > 0)
            st.push(rt.pop());
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
        System.out.println("Enter element to be inserted at end");
        int x = sc.nextInt();
        insert_at_bottom(st, x);
        System.out.println(st);
        sc.close();
    }

}
