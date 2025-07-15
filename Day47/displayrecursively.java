package Day47;

import java.util.Scanner;
import java.util.Stack;

public class displayrecursively {
    static void dislayrec(Stack<Integer> st) {
        if (st.size() == 0)
            return;
        int top = st.pop();
        dislayrec(st);
        System.out.print(top + " ");
        st.push(top);
    }

    static void displayREVrec(Stack<Integer> st) {
        if (st.size() == 0)
            return;
        int top = st.pop();
        System.out.print(top + " ");
        displayREVrec(st);

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

        dislayrec(st);
        System.out.println();
        displayREVrec(st);
        sc.close();
    }

}
