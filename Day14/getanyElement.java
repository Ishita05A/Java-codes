package Day14;

import java.util.Scanner;
import java.util.Stack;

public class getanyElement {
    static void getElement(Stack<Integer> st, int n) {
        while (st.size() > n) {
            st.pop();
        }
        System.out.println(st.peek());

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
        System.out.println("Enter postition of element you want to access");
        int idx = sc.nextInt();
        getElement(st, idx);
        sc.close();

    }

}
