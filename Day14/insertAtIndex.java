package Day14;

import java.util.Scanner;
import java.util.Stack;

public class insertAtIndex {
    static void insert(Stack<Integer> st, int idx, int n) {
        Stack<Integer> rt = new Stack<>();
        while (st.size() >= idx) {
            rt.push(st.pop());
        }
        st.push(n);
        while (rt.size() > 0) {
            st.push(rt.pop());
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
        System.out.println("Enter postition you want to insert");
        int i = sc.nextInt();
        System.out.println("Enter element you want to insert");
        int num = sc.nextInt();
        insert(st, i, num);
        System.out.println(st);
        sc.close();

    }

}
