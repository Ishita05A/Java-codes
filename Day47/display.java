package Day47;

import java.util.Scanner;
import java.util.Stack;

public class display {
    static void display_stack(Stack<Integer> st) {
        Stack<Integer> rt = new Stack<>();
        while (st.size() > 0)
            rt.push(st.pop());
        while (rt.size() > 0) {
            System.out.print(rt.peek() + " ");
            st.push(rt.pop());
        }

    }

    static void display_using_array(Stack<Integer> st) {
        int n = st.size();
        int[] arr = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            arr[i] = st.pop();
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
            st.push(arr[i]);
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
        display_using_array(st);
        System.out.println();
        display_stack(st);
        sc.close();

    }

}
