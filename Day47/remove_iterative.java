package Day47;

import java.util.Scanner;
import java.util.Stack;

public class remove_iterative {
    static void remove(Stack<Integer> st, int idx) {
        Stack<Integer> rt = new Stack<>();
        while (st.size() > idx + 1) {
            rt.push(st.pop());
        }
        st.pop();
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
        System.out.println("Enter idx to remove");
        int idx = sc.nextInt();
        remove(st, idx);
        System.out.println(st);
        sc.close();
    }

}
