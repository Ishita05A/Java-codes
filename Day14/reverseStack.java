package Day14;

import java.util.Scanner;
import java.util.Stack;

public class reverseStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        System.out.println("Enter no. of elements");
        int n = sc.nextInt();
        System.out.println("Enter Elements");
        for (int i = 1; i <= n; i++) {
            int x = sc.nextInt();
            st.push(x);
        }
        Stack<Integer> rt = new Stack<>();
        while (st.size() > 0) {
            rt.push(st.pop());
        }
        System.out.println("Reverse of Stack ");
        System.out.println(rt);
        sc.close();

    }

}
