package Day15;

import java.util.Scanner;
import java.util.Stack;

public class ques3 {
    static void displayReverseRecursively(Stack<Integer> st) {
        if (st.size() == 0)
            return;
        int top = st.pop();
        System.out.print(top + " ");
        displayReverseRecursively(st);
        st.push(top);
    }

    static void displayrecursively(Stack<Integer> st) {
        if (st.size() == 0)
            return;
        int top = st.pop();
        displayrecursively(st);
        System.out.print(top + " ");
        st.push(top);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        System.out.println("Enter  no. of elements");
        int n = sc.nextInt();
        System.out.println("Enter elements");
        for (int i = 1; i <= n; i++) {
            int x = sc.nextInt();
            st.push(x);
        }
        displayReverseRecursively(st);
        displayrecursively(st);
        sc.close();
    }

}
