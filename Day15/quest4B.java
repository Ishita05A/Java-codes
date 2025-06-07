package Day15;

import java.util.Scanner;
import java.util.Stack;

public class quest4B {
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

    static void insertAtAnyIndex(Stack<Integer> st, int idx, int num) {
        Stack<Integer> rt = new Stack<>();
        while (st.size() >= idx) {
            rt.push(st.pop());
        }
        st.push(num);
        while (rt.size() > 0) {
            st.push(rt.pop());
        }
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
        System.out.println("Enter position you want to add");
        int x = sc.nextInt();
        System.out.println("Enter element");
        int num = sc.nextInt();
        insertAtAnyIndex(st, x, num);
        display(st);
        sc.close();
    }

}
