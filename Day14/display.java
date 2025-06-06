package Day14;

import java.util.Scanner;
import java.util.Stack;

public class display {
    static void displayStack(Stack<Integer> st) {
        int[] arr = new int[st.size()];
        for (int i = arr.length - 1; i >= 0; i--) {
            arr[i] = st.pop();

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            st.push(arr[i]);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        System.out.println("Enter no. of elements");
        int n = sc.nextInt();
        System.out.println("Enter elements");
        for (int i = 1; i <= n; i++) {
            int x = sc.nextInt();
            st.push(x);
        }
        displayStack(st);
        sc.close();
    }

}
