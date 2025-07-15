package Day47;

import java.util.Scanner;
import java.util.Stack;

public class InsertAtAnyIdx {
    static void insert_at_any_idx(Stack<Integer> st, int idx, int x) {
        Stack<Integer> rt = new Stack<>();
        while (st.size() > idx) {
            rt.push(st.pop());
        }
        st.push(x);
        while (rt.size() > 0) {
            st.push(rt.pop());
        }
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
        System.out.println("Enter idx to insert");
        int idx = sc.nextInt();
        System.out.println("Enter element to be inserted at end");
        int x = sc.nextInt();
        System.out.println(st);
        insert_at_any_idx(st, idx, x);
        System.out.println(st);
        sc.close();
    }

}
