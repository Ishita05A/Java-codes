package Day47;

import java.util.Scanner;
import java.util.Stack;

public class remove_from_anyIdx {
    static void remove(Stack<Integer> st, int idx) {
        if (st.size() == idx + 1) {
            st.pop();
            return;
        }
        int top = st.pop();
        remove(st, idx);
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
        System.out.println("Enter idx to remove");
        int idx = sc.nextInt();
        remove(st, idx);
        System.out.println(st);
        sc.close();

    }

}
