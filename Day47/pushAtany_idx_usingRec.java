package Day47;

import java.util.Scanner;
import java.util.Stack;

public class pushAtany_idx_usingRec {
    static void insert_at_bottom(Stack<Integer> st, int idx, int x) {
        if (st.size() == idx) {
            st.push(x);
            return;
        }

        int top = st.pop();
        insert_at_bottom(st, idx, x);
        st.push(top);

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
        insert_at_bottom(st, idx, x);
        System.out.println(st);
        sc.close();
    }

}
