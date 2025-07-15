package Day47;

import java.util.Scanner;
import java.util.Stack;

public class copyStack {
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        System.out.println("Enter no. of elements");
        int n = sc.nextInt();
        System.out.println("Enter elements of stack");
        for (int i = 0; i < n; i++) {
            st.push(sc.nextInt());
        }
        System.out.println(st.size());
        System.out.println(st);
        Stack<Integer> rt = new Stack<>();
        while (st.size() > 0) {
            rt.push(st.pop());
        }
        System.out.println(rt);
        Stack<Integer> gt = new Stack<>();
        while (rt.size() > 0) {
            gt.push(rt.pop());
        }
        System.out.println(gt);
        System.out.println(st); // Original stack will become empty
        sc.close();

    }
}
