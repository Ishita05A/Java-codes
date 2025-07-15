package Day47;

import java.util.Scanner;
import java.util.Stack;

public class reverse_iterative {
    static void reverse(Stack<Integer> st) {
        Stack<Integer> rt = new Stack<>();
        Stack<Integer> gt = new Stack<>();
        while (st.size() > 0)
            rt.push(st.pop());
        while (rt.size() > 0)
            gt.push(rt.pop());
        while (gt.size() > 0)
            st.push(gt.pop());
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
        reverse(st);
        System.out.println(st);
        sc.close();
    }

}
