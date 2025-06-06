package Day14;

import java.util.Scanner;
import java.util.Stack;

public class CopyStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        Stack<Integer> rt = new Stack<>();
        Stack<Integer> gt = new Stack<>();
        System.out.println("Enter no. of elements");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            int x = sc.nextInt();
            st.push(x);
        }
        while (st.size() > 0) {
            rt.push(st.pop());
        }
        while (rt.size() > 0) {
            gt.push(rt.pop());
        }
        System.out.println(gt);
        sc.close();
    }

}
