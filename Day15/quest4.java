package Day15;

import java.util.Scanner;
import java.util.Stack;

public class quest4 {
    static void display(Stack<Integer> st) {
        int[] arr = new int[st.size()];
        for (int i = arr.length - 1; i >= 0; i--) {
            arr[i] = st.pop();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            st.push(arr[i]);
        }
    }

    static void removeFromAnyIndex(Stack<Integer> st, int n) {
        Stack<Integer> rt = new Stack<>();
        while (st.size() != n) {
            rt.push(st.pop());
        }
        st.pop();
        while (rt.size() > 0)
            st.push(rt.pop());
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
        System.out.println("Enter index you want to remove");
        int x = sc.nextInt();
        removeFromAnyIndex(st, x);
        display(st);
        sc.close();
    }

}
